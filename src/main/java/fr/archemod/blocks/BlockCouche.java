package fr.archemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockCouche extends BlockBase {

    public static final PropertyInteger LAYERS = PropertyInteger.create("layers", 1, 2);

    protected static final AxisAlignedBB[] SNOW_AABB = new AxisAlignedBB[] { new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D) };

    public Item itemDropped = null;

    public BlockCouche(String name, Material material, float hardness, float resistance, SoundType soundType, Item itemDropped) {
        super(name, material, hardness, resistance, soundType);
        this.itemDropped = itemDropped;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SNOW_AABB[((Integer)state.getValue((IProperty)LAYERS)).intValue()];
    }

    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
        return (((Integer)worldIn.getBlockState(pos).getValue((IProperty)LAYERS)).intValue() < 5);
    }

    public boolean isTopSolid(IBlockState state) {
        return (((Integer)state.getValue((IProperty)LAYERS)).intValue() == 7);
    }

    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        int i = ((Integer)blockState.getValue((IProperty)LAYERS)).intValue() - 1;
        float f = 0.125F;
        AxisAlignedBB axisalignedbb = blockState.getBoundingBox(worldIn, pos);
        return new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY, axisalignedbb.minZ, axisalignedbb. maxX, (i * 0.125F), axisalignedbb.maxZ);
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos.down());
        Block block = iblockstate.getBlock();
        return (block != Blocks.ICE && block != Blocks. PACKED_ICE) ? (iblockstate.getBlock().isLeaves(iblockstate, (IBlockAccess)worldIn, pos.down()) ? true : ((block == this && ((Integer)iblockstate.getValue((IProperty)LAYERS)).intValue() >= 7) ? true : ((iblockstate.isOpaqueCube() && iblockstate.getMaterial().blocksMovement())))) : false;
    }

    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        checkAndDropBlock(worldIn, pos, state);
    }

    private boolean checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!canPlaceBlockAt(worldIn, pos)) {
            worldIn.setBlockToAir(pos);
            return false;
        }
        return true;
    }

    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
        worldIn.setBlockToAir(pos);
    }

    public int quantityDropped(Random random) {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        if (side == EnumFacing.UP)
            return true;
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        return (iblockstate.getBlock() == this && ((Integer)iblockstate.getValue((IProperty)LAYERS)).intValue() >= ((Integer)blockState.getValue((IProperty)LAYERS)).intValue()) ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }

    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty((IProperty)LAYERS, Integer.valueOf((meta & 0x7) + 1));
    }

    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
        return (((Integer)worldIn.getBlockState(pos).getValue((IProperty)LAYERS)).intValue() == 1);
    }

    public int getMetaFromState(IBlockState state) {
        return ((Integer)state.getValue((IProperty)LAYERS)).intValue() - 1;
    }

    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return ((Integer)state.getValue((IProperty)LAYERS)).intValue() + 1;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] { (IProperty)LAYERS });
    }

    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this.itemDropped;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return Minecraft.isFancyGraphicsEnabled() ? BlockRenderLayer.CUTOUT_MIPPED : BlockRenderLayer.SOLID;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
