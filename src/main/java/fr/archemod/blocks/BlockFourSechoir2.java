/*package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityFourSechoir2;
import fr.archemod.init.ModBlocks;
import fr.archemod.util.Reference;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockFourSechoir2 extends BlockBase3 implements ITileEntityProvider
{

public static final PropertyDirection FACING = BlockHorizontal.FACING;
public static final PropertyBool BURNING = PropertyBool.create("burning");

    public BlockFourSechoir2(String name)
    {
        super(name, Material.ROCK);
        setSoundType(SoundType.STONE);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(BURNING, false));
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)

    {

        return Item.getItemFromBlock(ModBlocks.SECHOIR_VIANDE);

    }

  @Override
    public ItemStack getItem(World worlIn, BlockPos pos, IBlockState state)
  {
      return new ItemStack(ModBlocks.SECHOIR_VIANDE);
  }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote)
        {
            playerIn.openGui(ArcheMod.INSTANCE, Reference.GUI_FOUR_SECHOIR, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }
        return true;
    }


    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        if(!worldIn.isRemote)
        {
            IBlockState north = worldIn.getBlockState(pos.north());
            IBlockState south = worldIn.getBlockState(pos.south());
            IBlockState west = worldIn.getBlockState(pos.west());
            IBlockState east = worldIn.getBlockState(pos.east());
            EnumFacing face = (EnumFacing)state.getValue(FACING);

            if (face == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock()) face = EnumFacing.SOUTH;
            else if (face == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock()) face = EnumFacing.NORTH;
            else if (face == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock()) face = EnumFacing.EAST;
            else if (face == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock()) face = EnumFacing.WEST;
            worldIn.setBlockState(pos, state.withProperty(FACING, face),2);
        }
    }


    public static void setState(boolean active, World worldIn, BlockPos pos)

    {
        IBlockState state = worldIn.getBlockState(pos);
        TileEntity tileEntity = worldIn.getTileEntity(pos);

        if (active)
            worldIn.setBlockState(pos, ModBlocks.SECHOIR_VIANDE.getDefaultState().withProperty(FACING, state.getValue(FACING)).withProperty(BURNING, true), 3);
        else
            worldIn.setBlockState(pos, ModBlocks.SECHOIR_VIANDE.getDefaultState().withProperty(FACING, state.getValue(FACING)).withProperty(BURNING, false), 3);

        if (tileEntity != null)
        {
            tileEntity.validate();
            worldIn.setTileEntity(pos, tileEntity);
        }
    }
        @Override
         public TileEntity createNewTileEntity(World worldIn, int meta)
        {
            return new TileEntityFourSechoir2();
        }

        @Override
        public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand)
        {
            return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
        }

        @Override

        public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
        {
            worldIn.setBlockState(pos, this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()),2);

        }


    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
    {
        TileEntityFourSechoir2 tileentity = (TileEntityFourSechoir2)worldIn.getTileEntity(pos);
        super.breakBlock(worldIn, pos, state);
    }

    @Override

        public EnumBlockRenderType getRenderType(IBlockState state)
        {
            return EnumBlockRenderType.MODEL;
        }

        @Override

        public IBlockState withRotation(IBlockState state, Rotation rot)

        {
            return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
        }

        @Override
        public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
        {
            return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
        }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[]{BURNING,FACING});
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing facing = EnumFacing.byIndex(meta);
        if(facing.getAxis() == EnumFacing.Axis.Y) facing = EnumFacing.NORTH;
        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }



}

*/