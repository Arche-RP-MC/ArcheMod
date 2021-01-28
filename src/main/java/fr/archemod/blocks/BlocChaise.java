package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlocChaise extends BlockHorizontal{
    private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

    private static final AxisAlignedBB CHAIR_BASE = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

    public BlocChaise(String registryName, Material materialIn, SoundType sound) {
        super(materialIn);
        setSoundType (sound);
        setHardness (2.0F);
        setRegistryName("archemod", registryName);
        setTranslationKey(registryName);
        setCreativeTab(ArcheMod.archeCreativeTabs);
    }

    public boolean isOpaqueCube (IBlockState state) {
        return false;
    }

    public boolean isFullCube (IBlockState state) {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer () {
        return BlockRenderLayer.TRANSLUCENT;
    }

    public AxisAlignedBB getBoundingBox (IBlockState state, IBlockAccess source, BlockPos pos) {
        return BOUNDING_BOX;
    }

    public IBlockState getStateForPlacement (World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        IBlockState state = super.getStateForPlacement (world, pos, facing, hitX, hitY, hitZ, meta, placer);
        state = state.withProperty ((IProperty)FACING, (Comparable)placer.getHorizontalFacing ());
        return state;
    }

    public IBlockState getStateFromMeta (int meta) {
        return getDefaultState ().withProperty ((IProperty)FACING, (Comparable)EnumFacing.byHorizontalIndex (meta));
    }

    public int getMetaFromState (IBlockState state) {
        return ((EnumFacing)state.getValue ((IProperty)FACING )).getHorizontalIndex ();
    }

    protected BlockStateContainer createBlockState () {
        return new BlockStateContainer((Block)this, new IProperty[] { (IProperty)FACING });
    }
}
