package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.baril.BarilType;
import fr.archemod.blocks.baril.LiquideType;
import fr.archemod.blocks.tileentity.TileEntityBlockBaril;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockBaril extends BlockBase implements ITileEntityProvider {

    //public static final PropertyInteger SIZE = PropertyInteger.create("size", 0, 15);


    public BlockBaril(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
        setTickRandomly(true);
        setCreativeTab(ArcheMod.archeCreativeTabs);
    }




    @Override
    public boolean isOpaqueCube (IBlockState state)
    {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityBlockBaril(0, BarilType.VIDE);
    }



    public int damageDropped(IBlockState state) {
        return 0;
    }


    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }


    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {

        return getDefaultState();
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return (new ItemStack(ModBlocks.BARIL_VIDE, 1, 1)).getItem();
    }

    private void setLiquidContainer(BarilType bariltarget, BarilType newBaril, ItemStack itemClicked, ItemStack itemGived, int value, World worldIn, BlockPos pos, EntityPlayer playerIn, boolean remplir) {
        TileEntity entity = worldIn.getTileEntity(pos);

        if (entity instanceof TileEntityBlockBaril) {

            TileEntityBlockBaril blockBaril = (TileEntityBlockBaril) entity;
            if (bariltarget == BarilType.VIDE) {

                if (blockBaril.getQuantity() >= 15) {
                    return;
                }

                if(!remplir){
                    return;
                }


                blockBaril.setQuantity(blockBaril.getQuantity() + value);
                blockBaril.setType(newBaril.name());

                int countGived = playerIn.getHeldItemMainhand().getCount();

                if(playerIn.getHeldItemMainhand().getCount() >= 1){
                    countGived = countGived - 1;
                }

                playerIn.inventory.addItemStackToInventory(itemGived);

                playerIn.replaceItemInInventory(playerIn.inventory.getSlotFor(
                        playerIn.getHeldItemMainhand()),
                        new ItemStack(playerIn.getHeldItemMainhand().getItem(), countGived)
                );




            }else if (value <= blockBaril.getQuantity()) {

                int newValue = blockBaril.getQuantity() - value;
                blockBaril.setType(newBaril.name());
                blockBaril.setQuantity(newValue);

                System.out.println("fonction on");

                if(blockBaril.getQuantity() <= 0){
                    System.out.println("Le baril est vide");
                    blockBaril.setType(BarilType.VIDE.name());
                }


                int countGived = playerIn.getHeldItemMainhand().getCount();

                if(playerIn.getHeldItemMainhand().getCount() >= 1){
                    countGived = countGived - 1;
                }

                playerIn.inventory.addItemStackToInventory(itemGived);

                playerIn.replaceItemInInventory(playerIn.inventory.getSlotFor(
                        playerIn.getHeldItemMainhand()),
                        new ItemStack(playerIn.getHeldItemMainhand().getItem(), countGived)
                );

            }

        }
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (playerIn.getHeldItemMainhand() != ItemStack.EMPTY)
            if (playerIn.getHeldItemMainhand().getItem() == Items.STICK) {

                    TileEntity entity = worldIn.getTileEntity(pos);

                    if (!(entity instanceof TileEntityBlockBaril)) {

                    }

                TileEntityBlockBaril blockBaril = (TileEntityBlockBaril) entity;

                int size = blockBaril.getQuantity();
                if (!worldIn.isRemote)
                    if (size > 0) {
                        playerIn.sendMessage((new TextComponentString(blockBaril.getType())));
                        playerIn.sendMessage((new TextComponentString("Le fut contient encore " + size + " verres.")).setStyle((new Style()).setColor(TextFormatting.YELLOW)));
                    } else {
                        playerIn.sendMessage((new TextComponentString("Le fût est vide")).setStyle((new Style()).setColor(TextFormatting.YELLOW)));
                    }
            } else {
                TileEntity entity = worldIn.getTileEntity(pos);

                if (entity instanceof TileEntityBlockBaril) {

                    TileEntityBlockBaril blockBaril = (TileEntityBlockBaril) entity;

                    BarilType barilTarget = BarilType.valueOf(blockBaril.getType());
                    ItemStack item = playerIn.getHeldItemMainhand();


                    // SEAU METAL

                    //Partie remplissage de baril seau

                    if(item.getItem() == Items.WATER_BUCKET){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(Items.WATER_BUCKET), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == Items.MILK_BUCKET){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(Items.MILK_BUCKET), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_BIERRE_BLONDE){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.SEAU_DE_BIERRE_BLONDE), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_BIERE_BRUNE){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.SEAU_DE_BIERE_BRUNE), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_BIERE_ROUSSE){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.SEAU_DE_BIERE_ROUSSE), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_VIN_BLANC){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.SEAU_DE_VIN_BLANC), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_VIN_ROUGE){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.SEAU_DE_VIN_ROUGE), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_RHUM){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.SEAU_DE_RHUM), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_HYDROMEL){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.SEAU_DE_HYDROMEL), new ItemStack(Items.BUCKET), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }


                    //Partie vidage de baril SEAU
                    if (item.getItem() == Items.BUCKET) {
                        if(barilTarget == BarilType.EAU){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(Items.BUCKET), new ItemStack(Items.WATER_BUCKET), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.LAIT){
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(Items.BUCKET), new ItemStack(Items.MILK_BUCKET), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_BRUNE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(Items.BUCKET), new ItemStack(ModItems.SEAU_DE_BIERE_BRUNE), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERRE_BLONDE){
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(Items.BUCKET), new ItemStack(ModItems.SEAU_DE_BIERRE_BLONDE), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_ROUSSE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(Items.BUCKET), new ItemStack(ModItems.SEAU_DE_BIERE_ROUSSE), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_BLANC){
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(Items.BUCKET), new ItemStack(ModItems.SEAU_DE_VIN_BLANC), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_ROUGE){
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(Items.BUCKET), new ItemStack(ModItems.SEAU_DE_VIN_ROUGE), 15, worldIn, pos, playerIn, false);
                            return true;
                        }
                        if(barilTarget == BarilType.RHUM){
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(Items.BUCKET), new ItemStack(ModItems.SEAU_DE_RHUM), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.HYDROMEL){
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(Items.BUCKET), new ItemStack(ModItems.SEAU_DE_HYDROMEL), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                    }





// SEAU EN BOIS

                    //Partie vidage de baril SEAU EN BOIS
                    if (item.getItem() == ModItems.SEAU_EN_BOIS) {
                        if(barilTarget == BarilType.EAU){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_D_EAU_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.LAIT){
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_DE_LAIT_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_BRUNE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_DE_BIERE_BRUNE_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERRE_BLONDE){
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_DE_BIERRE_BLONDE_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_ROUSSE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_DE_BIERE_ROUSSE_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_BLANC){
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_DE_VIN_BLANC_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_ROUGE){
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_DE_VIN_ROUGE_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }
                        if(barilTarget == BarilType.RHUM){
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_DE_RHUM_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.HYDROMEL){
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.SEAU_EN_BOIS), new ItemStack(ModItems.SEAU_DE_HYDROMEL_EN_BOIS), 15, worldIn, pos, playerIn, false);
                            return true;
                        }

                    }

                    //Partie remplissage de baril seau en bois

                    if(item.getItem() == ModItems.SEAU_D_EAU_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(ModItems.SEAU_D_EAU_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_LAIT_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(ModItems.SEAU_DE_LAIT_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_BIERE_BRUNE_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.SEAU_DE_BIERRE_BLONDE_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_BIERRE_BLONDE_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.SEAU_DE_BIERE_BRUNE_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_BIERE_ROUSSE_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.SEAU_DE_BIERE_ROUSSE_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_VIN_BLANC_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.SEAU_DE_VIN_BLANC_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_VIN_ROUGE_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.SEAU_DE_VIN_ROUGE_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_RHUM_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.SEAU_DE_RHUM_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }

                    if(item.getItem() == ModItems.SEAU_DE_HYDROMEL_EN_BOIS){
                        if(barilTarget == BarilType.VIDE){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.SEAU_DE_HYDROMEL_EN_BOIS), new ItemStack(ModItems.SEAU_EN_BOIS), 15, worldIn, pos, playerIn, true);
                            return true;
                        }
                    }



// BOCAL
                    if (item.getItem() == ModItems.BOCAL) {
                        if(barilTarget == BarilType.EAU){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_D_EAU), 2, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.LAIT){
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_DE_LAIT), 2, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_BRUNE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_DE_BIERE_BRUNE), 2, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERRE_BLONDE){
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_DE_BIERRE_BLONDE), 2, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_ROUSSE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_DE_BIERE_ROUSSE), 2, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_BLANC){
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_DE_VIN_BLANC), 2, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_ROUGE){
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_DE_VIN_ROUGE), 2, worldIn, pos, playerIn, false);
                            return true;
                        }
                        if(barilTarget == BarilType.RHUM){
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_DE_RHUM), 2, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.HYDROMEL){
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.BOCAL), new ItemStack(ModItems.BOCAL_DE_HYDROMEL), 2, worldIn, pos, playerIn, false);
                            return true;
                        }

                    }


// VERRE A PIED
                    if (item.getItem() == ModItems.VERRE_A_PIED) {
                        if(barilTarget == BarilType.EAU){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_EAU), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.LAIT){
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_LAIT), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_BRUNE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_BIERE_BRUNE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERRE_BLONDE){
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_BIERRE_BLONDE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_ROUSSE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_BIERE_ROUSSE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_BLANC){
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_VIN_BLANC), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_ROUGE){
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_VIN_ROUGE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }
                        if(barilTarget == BarilType.RHUM){
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_RHUM), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.HYDROMEL){
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.VERRE_A_PIED), new ItemStack(ModItems.VERRE_A_PIED_HYDROMEL), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                    }




                    // CHOPPE EN VERRE

                    if (item.getItem() == ModItems.CHOPPE_EN_VERRE) {
                        if(barilTarget == BarilType.EAU){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_EAU), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.LAIT){
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_LAIT), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_BRUNE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERE_BRUNE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERRE_BLONDE){
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERRE_BLONDE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_ROUSSE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERE_ROUSSE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_BLANC){
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_VIN_BLANC), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_ROUGE){
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_VIN_ROUGE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }
                        if(barilTarget == BarilType.RHUM){
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_RHUM), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.HYDROMEL){
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.CHOPPE_EN_VERRE), new ItemStack(ModItems.CHOPPE_EN_VERRE_HYDROMEL), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                    }

                    // CHOPPE EN ARGILE


                    if (item.getItem() == ModItems.CHOPPE_EN_ARGILE) {
                        if(barilTarget == BarilType.EAU){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_EAU), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.LAIT){
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_LAIT), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_BRUNE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERE_BRUNE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERRE_BLONDE){
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERRE_BLONDE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_ROUSSE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERE_ROUSSE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_BLANC){
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIN_BLANC), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_ROUGE){
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIN_ROUGE), 1, worldIn, pos, playerIn, false);
                            return true;
                        }
                        if(barilTarget == BarilType.RHUM){
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_RHUM), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.HYDROMEL){
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.CHOPPE_EN_ARGILE), new ItemStack(ModItems.CHOPPE_EN_ARGILE_HYDROMEL), 1, worldIn, pos, playerIn, false);
                            return true;
                        }

                    }

                    // BOUTEILLE EN VERRE

                    if (item.getItem() == ModItems.BOUTEILLE_VIDE) {
                        if(barilTarget == BarilType.EAU){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_D_EAU), 5, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.LAIT){
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_DE_LAIT), 5, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_BRUNE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_DE_BIERE_BRUNE), 5, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERRE_BLONDE){
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_DE_BIERRE_BLONDE), 5, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_ROUSSE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_DE_BIERE_ROUSSE), 5, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_BLANC){
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_DE_VIN_BLANC), 5, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_ROUGE){
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_DE_VIN_ROUGE), 5, worldIn, pos, playerIn, false);
                            return true;
                        }
                        if(barilTarget == BarilType.RHUM){
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_DE_RHUM), 5, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.HYDROMEL){
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.BOUTEILLE_VIDE), new ItemStack(ModItems.BOUTEILLE_DE_HYDROMEL), 5, worldIn, pos, playerIn, false);
                            return true;
                        }

                    }



                    // GROSSE BOUTEILLE EN VERRE

                    if (item.getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                        if(barilTarget == BarilType.EAU){
                            //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                            setLiquidContainer(barilTarget, BarilType.EAU, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_D_EAU), 7, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.LAIT){
                            setLiquidContainer(barilTarget, BarilType.LAIT, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_LAIT), 7, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_BRUNE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_BRUNE, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_BIERE_BRUNE), 7, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERRE_BLONDE){
                            setLiquidContainer(barilTarget, BarilType.BIERRE_BLONDE, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_BIERRE_BLONDE), 7, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.BIERE_ROUSSE){
                            setLiquidContainer(barilTarget, BarilType.BIERE_ROUSSE, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_BIERE_ROUSSE), 7, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_BLANC){
                            setLiquidContainer(barilTarget, BarilType.VIN_BLANC, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_VIN_BLANC), 7, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.VIN_ROUGE){
                            setLiquidContainer(barilTarget, BarilType.VIN_ROUGE, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_VIN_ROUGE), 7, worldIn, pos, playerIn, false);
                            return true;
                        }
                        if(barilTarget == BarilType.RHUM){
                            setLiquidContainer(barilTarget, BarilType.RHUM, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_RHUM), 7, worldIn, pos, playerIn, false);
                            return true;
                        }

                        if(barilTarget == BarilType.HYDROMEL){
                            setLiquidContainer(barilTarget, BarilType.HYDROMEL, new ItemStack(ModItems.GROSSE_BOUTEILLE_VIDE), new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_HYDROMEL), 7, worldIn, pos, playerIn, false);
                            return true;
                        }

                    }


                }


            }

        return true;

    }



}




