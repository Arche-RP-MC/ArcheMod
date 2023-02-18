package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityBarril;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;


public class BlockBarril extends Block implements ITileEntityProvider {

    public static final PropertyInteger ORIENTATION = PropertyInteger.create("orientation", 0, 3);



    public BlockBarril(String name, Material material, float hardness, float resistance, SoundType soundType){
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setSoundType(soundType);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }



    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof TileEntityBarril) {
                TileEntityBarril tileEntityBarril = (TileEntityBarril) tileEntity;
                ItemStack itemStack = playerIn.getHeldItem(hand);
                if (itemStack.getItem() == Items.WATER_BUCKET && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("eau");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == Items.MILK_BUCKET && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("lait");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == Items.STICK) {
                    playerIn.sendMessage(new TextComponentString("Contenu : " + tileEntityBarril.getContenu() + ", charges restantes : " + tileEntityBarril.getCharge()));
                } else if (itemStack.getItem() == ModItems.VERRE_A_PIED) {
                    if (tileEntityBarril.getCharge() > 0) {
                        tileEntityBarril.setCharge(tileEntityBarril.getCharge() - 1);
                        itemStack.shrink(1);
                        if (tileEntityBarril.getContenu().equals("eau")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_EAU, 1, 0));
                        } else if (tileEntityBarril.getContenu().equals("lait")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_LAIT));
                        }
                    } else {
                        playerIn.sendMessage(new TextComponentString("Le baril est vide"));
                    }
                }
            }
        }
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityBarril();
    }

}