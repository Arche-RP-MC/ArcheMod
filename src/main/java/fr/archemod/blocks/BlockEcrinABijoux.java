package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.container.ContainerBlockInventory;
import fr.archemod.blocks.tileentity.TileEntityTable;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockEcrinABijoux extends BlockBase implements ITileEntityProvider {

    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    private static final AxisAlignedBB AXIS_ALIGNED_BB_SOUTH = new AxisAlignedBB(0.25D, 0.0D, 0.17D, 0.75D, 0.4D, 0.67D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_NORTH = new AxisAlignedBB(0.25D, 0.0D, 0.37D, 0.75D, 0.4D, 0.87D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_EAST = new AxisAlignedBB(0.17D, 0.0D, 0.25D, 0.67D, 0.4D, 0.75D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_WEST = new AxisAlignedBB(0.37D, 0.0D, 0.25D, 0.87D, 0.4D, 0.75D); //OK

    public BlockEcrinABijoux(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
        setLightLevel(0F);
        setLightOpacity(0);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new ContainerBlockInventory("am:ecrin_a_bijoux", 9, 9, 1);
    }

    @Override
    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
        super.eventReceived(state, worldIn, pos, eventID, eventParam);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        if (state.getValue(FACING) == EnumFacing.SOUTH) {
            return AXIS_ALIGNED_BB_SOUTH;
        } else if (state.getValue(FACING) == EnumFacing.NORTH) {
            return AXIS_ALIGNED_BB_NORTH;
        } else if (state.getValue(FACING) == EnumFacing.EAST) {
            return AXIS_ALIGNED_BB_EAST;
        } else if (state.getValue(FACING) == EnumFacing.WEST) {
            return AXIS_ALIGNED_BB_WEST;
        }
        return AXIS_ALIGNED_BB_NORTH;
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntity tileentity = world.getTileEntity(pos);
        if (tileentity instanceof ContainerBlockInventory)
            InventoryHelper.dropInventoryItems(world, pos, (ContainerBlockInventory) tileentity);
        world.removeTileEntity(pos);
        super.breakBlock(world, pos, state);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        } else {
            playerIn.openGui(ArcheMod.INSTANCE, 5, worldIn, pos.getX(), pos.getY(), pos.getZ());

            return true;
        }
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        TileEntity tile = worldIn.getTileEntity(pos);
        if (tile instanceof TileEntityTable) {
            if (stack.hasDisplayName()) {
                ((TileEntityTable) tile).setCustomName(stack.getDisplayName());
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    protected net.minecraft.block.state.BlockStateContainer createBlockState() {
        return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
                                            EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
        return BlockFaceShape.UNDEFINED;
    }

    @Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        return false;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }
}
