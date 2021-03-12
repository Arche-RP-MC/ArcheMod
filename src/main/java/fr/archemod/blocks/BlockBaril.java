/*package fr.archemod.blocks;

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
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockBaril extends BlockBase implements ITileEntityProvider {

    public static final PropertyInteger SIZE = PropertyInteger.create("size", 0, 15);


    public BlockBaril(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
        setTickRandomly(true);
        setCreativeTab(ArcheMod.archeCreativeTabs);
        setDefaultState(this.blockState.getBaseState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
    }



    protected PropertyInteger getSizeProperty() {
        return SIZE;
    }

    public IBlockState getStateFromMet(int meta) {
        return getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(meta));
    }

    public int getMetaFromState(IBlockState state) {
        return ((Integer)state.getValue((IProperty)SIZE)).intValue();
    }

    public int damageDropped(IBlockState state) {
        return 0;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] { (IProperty)SIZE });
    }

    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }


    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf((this.content != BarilType.VIDE) ? 15 : 0));
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return (new ItemStack(ModBlocks.BARIL_VIDE, 1, 1)).getItem();
    }

    private void setLiquidContainer(BarilType bariltarget, BarilType newBaril, ItemStack itemClicked, ItemStack itemGived, int value, World worldIn, BlockPos pos,EntityPlayer playerIn, boolean remplir){
        TileEntity entity = worldIn.getTileEntity(pos);

        if(entity instanceof TileEntityBlockBaril){

            TileEntityBlockBaril blockBaril = (TileEntityBlockBaril) entity;
            if(bariltarget.equals(BarilType.VIDE)){
                    if(remplir){

                        if(blockBaril.getQuantity() >= 15){
                            return;
                        }
                        blockBaril.setQuantity(blockBaril.getQuantity() + value);
                        blockBaril.setType(newBaril.name());

                        for (int i = 0; i < playerIn.inventory.getSizeInventory(); i++){
                            if(playerIn.inventory.getStackInSlot(i) == itemClicked){
                                playerIn.replaceItemInInventory(i, itemGived);
                            }
                        }

                    }else{

                        if(value < blockBaril.getQuantity()){

                            blockBaril.setQuantity(blockBaril.getQuantity() - value);

                            if(blockBaril.getQuantity() <= 0){
                                blockBaril.setType(BarilType.VIDE.name());
                            }
                        }
                    }
            }


        }
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (playerIn.getHeldItemMainhand() != ItemStack.EMPTY)
            if (playerIn.getHeldItemMainhand().getItem() == Items.STICK) {
                int size = (Integer) state.getValue((IProperty) SIZE);
                if (!worldIn.isRemote)
                    if (size > 0) {
                        playerIn.sendMessage((new TextComponentString(this.getLocalizedName())));
                        playerIn.sendMessage((new TextComponentString("Le fut contient encore " + size + " verres.")).setStyle((new Style()).setColor(TextFormatting.YELLOW)));
                    } else {
                        playerIn.sendMessage((new TextComponentString("Le fut est vide")).setStyle((new Style()).setColor(TextFormatting.YELLOW)));
                    }
            } else {
                TileEntity entity = worldIn.getTileEntity(pos);

                if(entity instanceof TileEntityBlockBaril) {

                    TileEntityBlockBaril blockBaril = (TileEntityBlockBaril) entity;

                    BarilType barilTarget = BarilType.valueOf(blockBaril.getType());
                    ItemStack item = playerIn.getHeldItemMainhand();


                    if(item.getItem() == Items.BUCKET){

                        //           baril visé joueur  new baril     item cliqué par le joueur            item reçus                 valeur du liquide                  remplir ou vider
                        setLiquidContainer(barilTarget, BarilType.EAU,new ItemStack(Items.BUCKET), new ItemStack(Items.WATER_BUCKET), 15, worldIn, pos, playerIn, true);

                    }

                    if(item.getItem() == Item



                }

                switch () {
                    case BarilType.VIDE:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_D_EAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty) SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item) ModItems.SEAU_EN_BOIS));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.WATER_BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty) SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));

                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_LAIT_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item)ModItems.SEAU_EN_BOIS));
                        break;
                        }
                         if (playerIn.getHeldItemMainhand().getItem() == Items.MILK_BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty) SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));
                    }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_BIERRE_BLONDE_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item)ModItems.SEAU_EN_BOIS));
                            break;
                        }

                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_BIERRE_BLONDE) {
                        worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                        playerIn.getHeldItemMainhand().shrink(1);
                        playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));
                        break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_BIERE_ROUSSE_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item)ModItems.SEAU_EN_BOIS));
                            break;
                        }

                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_BIERE_ROUSSE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));
                            break;
                        }

                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_VIN_BLANC_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item)ModItems.SEAU_EN_BOIS));
                            break;
                        }

                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_VIN_BLANC) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));
                            break;
                        }


                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_VIN_ROUGE_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item)ModItems.SEAU_EN_BOIS));
                            break;
                        }

                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_VIN_ROUGE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));

                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_RHUM_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item)ModItems.SEAU_EN_BOIS));
                            break;
                        }

                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_RHUM) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));

                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_HYDROMEL_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item)ModItems.SEAU_EN_BOIS));
                            break;
                        }

                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_DE_HYDROMEL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));

                            break;
                        }

                        break;



                    case BarilType.EAU:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_D_EAU));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_D_EAU_EN_BOIS));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_EAU));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_EAU));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_EAU));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_D_EAU));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_D_EAU));
                            break;
                        }

                        break;

                    case BarilType.LAIT:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_DE_LAIT));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.MILK_BUCKET));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_LAIT_EN_BOIS));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_LAIT));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_LAIT));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_LAIT));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_DE_LAIT));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_LAIT.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_LAIT));
                        }

                        break;

                    case BarilType.BIERRE_BLONDE:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_DE_BIERRE_BLONDE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_BIERRE_BLONDE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_BIERRE_BLONDE_EN_BOIS));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_BIERRE_BLONDE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERRE_BLONDE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERRE_BLONDE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_DE_BIERRE_BLONDE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERRE_BLONDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_BIERRE_BLONDE));
                        }
                        break;

                    case BarilType.BIERE_BRUNE:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_BRUNE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_DE_BIERE_BRUNE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_BRUNE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_BIERE_BRUNE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_BRUNE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_BIERE_BRUNE_EN_BOIS));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_BRUNE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_BIERE_BRUNE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_BRUNE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERE_BRUNE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_BRUNE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERE_BRUNE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_BRUNE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_DE_BIERE_BRUNE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_BRUNE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_BIERE_BRUNE));
                        }
                        break;


                    case BarilType.BIERE_ROUSSE:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_DE_BIERE_ROUSSE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_BIERE_ROUSSE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_BIERE_ROUSSE_EN_BOIS));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_BIERE_ROUSSE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERE_ROUSSE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERE_ROUSSE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_DE_BIERE_ROUSSE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_BIERE_ROUSSE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_BIERE_ROUSSE));
                        }
                        break;

                    case BarilType.VIN_BLANC:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_DE_VIN_BLANC));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_VIN_BLANC));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_VIN_BLANC_EN_BOIS));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_VIN_BLANC));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_VIN_BLANC));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIN_BLANC));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_DE_VIN_BLANC));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_BLANC.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_VIN_BLANC));
                        }
                        break;
                    case BarilType.VIN_ROUGE:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_DE_VIN_ROUGE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_VIN_ROUGE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_VIN_ROUGE_EN_BOIS));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_VIN_ROUGE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_VIN_ROUGE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIN_ROUGE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_DE_VIN_ROUGE));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIN_ROUGE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_VIN_ROUGE));
                        }
                        break;



                    case BarilType.RHUM:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_DE_RHUM));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_RHUM));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_RHUM_EN_BOIS));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_RHUM));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_RHUM));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_RHUM));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_DE_RHUM));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_RHUM.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_RHUM));
                        }
                        break;

                    case BarilType.HYDROMEL:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_DE_HYDROMEL));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_HYDROMEL));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_DE_HYDROMEL_EN_BOIS));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.VERRE_A_PIED) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_HYDROMEL));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_VERRE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_HYDROMEL));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.CHOPPE_EN_ARGILE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_HYDROMEL));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 5)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOUTEILLE_DE_HYDROMEL));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.GROSSE_BOUTEILLE_VIDE) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_HYDROMEL.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 7)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.GROSSE_BOUTEILLE_DE_HYDROMEL));
                        }
                        break;
                }
                if (((Integer)worldIn.getBlockState (pos).getValue((IProperty)SIZE)).intValue() == 0)
                    worldIn.setBlockState(pos, ModBlocks.BARIL_VIDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
            }
        return true;
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityBlockBaril(15, BarilType.VIDE);
    }
}





*/