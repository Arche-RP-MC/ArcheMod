package fr.archemod.blocks.bloc3D;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlocChaise2 extends Block implements IHasModel {


    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    private static final AxisAlignedBB AXIS_ALIGNED_BB_SOUTH = new AxisAlignedBB(0.25D, 0.0D, 0.17D, 0.75D, 0.4D, 0.67D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_NORTH = new AxisAlignedBB(0.25D, 0.0D, 0.37D, 0.75D, 0.4D, 0.87D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_EAST = new AxisAlignedBB(0.17D, 0.0D, 0.25D, 0.67D, 0.4D, 0.75D); //OK
    private static final AxisAlignedBB AXIS_ALIGNED_BB_WEST = new AxisAlignedBB(0.37D, 0.0D, 0.25D, 0.87D, 0.4D, 0.75D); //OK


    public BlocChaise2(String name, Material material, float hardness, float resistance, SoundType soundType) {
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
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
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
}