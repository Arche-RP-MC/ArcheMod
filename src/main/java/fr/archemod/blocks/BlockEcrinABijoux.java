package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityBlockEcrinBijou;
import fr.archemod.blocks.tileentity.TileEntityBlockInventory;
import fr.archemod.blocks.tileentity.TileEntityTable;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
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

public class BlockEcrinABijoux extends BlockBaseOriented implements ITileEntityProvider {
    private static final AxisAlignedBB AXIS_ALIGNED_BB_SOUTH = new AxisAlignedBB(0.25D, 0.0D, 0.17D, 0.75D, 0.4D, 0.67D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_NORTH = new AxisAlignedBB(0.25D, 0.0D, 0.37D, 0.75D, 0.4D, 0.87D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_EAST = new AxisAlignedBB(0.17D, 0.0D, 0.25D, 0.67D, 0.4D, 0.75D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_WEST = new AxisAlignedBB(0.37D, 0.0D, 0.25D, 0.87D, 0.4D, 0.75D); //OK

    public BlockEcrinABijoux(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityBlockEcrinBijou();
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
        if (tileentity instanceof TileEntityBlockInventory)
            InventoryHelper.dropInventoryItems(world, pos, (TileEntityBlockInventory) tileentity);
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

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}