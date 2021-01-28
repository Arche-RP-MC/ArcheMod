package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
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
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.Random;

public class BlockBaril extends BlockBase {

    public static final PropertyInteger SIZE = PropertyInteger.create("size", 0, 15);

    public BarilType content;

    public BlockBaril(String name, Material material, float hardness, float resistance, SoundType soundType, BarilType content) {
        super(name, material, hardness, resistance, soundType);
        setTickRandomly(true);
        setCreativeTab(ArcheMod.archeCreativeTabs);
        this.content = content;
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

    public enum BarilType {
        EAU, VIDE;
    }

    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf((this.content != BarilType.VIDE) ? 15 : 0));
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return (new ItemStack(ModBlocks.BARIL_VIDE, 1, 1)).getItem();
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (playerIn.getHeldItemMainhand() != ItemStack.EMPTY)
            if (playerIn.getHeldItemMainhand().getItem() == Items.STICK) {
                int size = (Integer) state.getValue((IProperty) SIZE);
                if (!worldIn.isRemote)
                    if (size > 0) {
                        playerIn.sendMessage((new TextComponentString("Le fut contient encore " + size + " verres.")).setStyle((new Style()).setColor(TextFormatting.YELLOW)));
                    } else {
                        playerIn.sendMessage((new TextComponentString("Le fut est vide")).setStyle((new Style()).setColor(TextFormatting.YELLOW)));
                    }
            } else {
                switch (this.content) {
                    case VIDE:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_D_EAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack((Item)ModItems.SEAU_EN_BOIS));
                            break;
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.WATER_BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(15)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));
                            break;
                        }
                        break;
                    case EAU:
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.BOCAL) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_EAU.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.BOCAL_D_EAU));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == Items.BUCKET) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET));
                        }
                        if (playerIn.getHeldItemMainhand().getItem() == ModItems.SEAU_EN_BOIS) {
                            worldIn.setBlockState(pos, ModBlocks.BARIL_VIDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(((Integer)state.getValue((IProperty)SIZE)).intValue() - 1)));
                            playerIn.getHeldItemMainhand().shrink(1);
                            playerIn.inventory.addItemStackToInventory(new ItemStack(ModItems.SEAU_D_EAU_EN_BOIS));
                        }
                        break;
                }
                if (((Integer)worldIn.getBlockState (pos).getValue((IProperty)SIZE)).intValue() == 0)
                    worldIn.setBlockState(pos, ModBlocks.BARIL_VIDE.getDefaultState().withProperty((IProperty)SIZE, Integer.valueOf(0)));
            }
        return true;
    }

}
