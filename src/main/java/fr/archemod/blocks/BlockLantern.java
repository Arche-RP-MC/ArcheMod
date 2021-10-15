package fr.archemod.blocks;

import fr.archemod.blocks.tileentity.TileEntityLightBlock;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Date;
import java.util.Random;

public class BlockLantern extends BlockBase implements ITileEntityProvider {

    public static final PropertyInteger ORIENTATION = PropertyInteger.create("orientation", 0, 3);

    public static final PropertyEnum<EnumPosition> POSITION = PropertyEnum.create("position", EnumPosition.class);

    public final boolean burning;


    public BlockLantern(String name, boolean burning, Material material, float hardness, float resistance, SoundType soundType) {
        super(name + (!burning ? "_off" : ""), material, hardness, resistance, soundType);
        setDefaultState(this.blockState.getBaseState().withProperty((IProperty)ORIENTATION, Integer.valueOf(0)).withProperty((IProperty)POSITION, EnumPosition.BOTTOM));

        if (burning) {
            setLightLevel(1.2F);
        }

        this.burning = burning;
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        super.updateTick(worldIn, pos, state, rand);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (this.burning && playerIn.getHeldItemMainhand().getItem() == Item.getByNameOrId("water_bucket")) {
            int slot = playerIn.inventory.getSlotFor(new ItemStack(Item.getByNameOrId("water_bucket")));
            playerIn.inventory.setInventorySlotContents(slot, new ItemStack(Item.getByNameOrId("bucket")));
            worldIn.setBlockState(pos, ModBlocks.LANTERNE_JAUNE_ETEINTE.getDefaultState().withProperty((IProperty)ORIENTATION, state.getValue((IProperty)ORIENTATION)).withProperty((IProperty)POSITION, state.getValue((IProperty)POSITION)));
        } else if (playerIn.getHeldItemMainhand() != ItemStack.EMPTY
                &&
                playerIn.getHeldItemMainhand().getItem() == ModItems.BOUGIE) {
            if (!playerIn.isCreative())
                playerIn.getHeldItemMainhand().shrink(1);
            worldIn.setBlockState(pos, ModBlocks.LANTERNE_JAUNE_ALLUMEE.getDefaultState().withProperty((IProperty)ORIENTATION, state.getValue((IProperty)ORIENTATION)).withProperty((IProperty)POSITION, state.getValue((IProperty)POSITION)));
            ((TileEntityLightBlock)worldIn.getTileEntity(pos)).setDate();
        }
        return true;
    }

    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        EnumPosition position = EnumPosition.fromFacing(facing);
        int face = position.isOnWall() ? facing.getHorizontalIndex() : getFacingIndex(placer);
        return super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty((IProperty)POSITION, position).withProperty((IProperty)ORIENTATION, Integer.valueOf(face));
    }

    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (canPlaceBlockAt(worldIn, pos))
            super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
    }

    private int getFacingIndex(EntityLivingBase placer) {
        int rotation = MathHelper.floor(((placer.rotationYaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 0xF;
        if (rotation == 0 || rotation == 8)
            return 0;
        if (rotation == 4 || rotation == 12)
            return 1;
        if ((rotation >= 1 && rotation <= 3) || (rotation >= 9 && rotation <= 11))
            return 2;
        return 3;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        double f = 0.25D, h = 0.5D;
        if (state.getValue((IProperty)POSITION) == EnumPosition.BOTTOM)
            return new AxisAlignedBB(h - f, 0.0D, h - f, h + f, 0.5625D, h + f);
        if (state.getValue((IProperty)POSITION) == EnumPosition.TOP)
            return new AxisAlignedBB(h - f, 0.4375D, h - f, h + f, 1.0D, h + f);
        switch (((Integer)state.getValue((IProperty)ORIENTATION)).intValue()) {
            case 0:
                return new AxisAlignedBB(h - f, 0.2D, 0.0D, h + f, 0.8D, h);
            case 1:
                return new AxisAlignedBB(h, 0.2D, h - f, 1.0D, 0.8D, h + f);
            case 2:
                return new AxisAlignedBB(h - f, 0.2D, h, h + f, 0.8D, 1.0D);
            case 3:
                return new AxisAlignedBB(0.0D, 0.2D, h - f, h, 0.8D, h + f);
        }
        return NULL_AABB;
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] { (IProperty)POSITION, (IProperty)ORIENTATION });
    }

    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty((IProperty)ORIENTATION, Integer.valueOf(meta & 0x3)).withProperty((IProperty)POSITION, EnumPosition.fromIndex((meta & 0xC) >> 2));
    }

    public int getMetaFromState(IBlockState state) {
        return ((EnumPosition)state.getValue((IProperty)POSITION)).ordinal() << 2 | ((Integer)state.getValue((IProperty)ORIENTATION)).intValue() & 0x3;
    }

    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return (TileEntity)new TileEntityLightBlock();
    }

    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        return BlockFaceShape.UNDEFINED;
    }

    private enum EnumPosition implements IStringSerializable {
        BOTTOM("bottom"),
        WALL("wall"),
        TOP("top");

        private final String name;

        EnumPosition(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public boolean isOnWall() {
            return (this == WALL);
        }

        public static EnumPosition fromFacing(EnumFacing facing) {
            if (facing == EnumFacing.DOWN)
                return TOP;
            if (facing == EnumFacing.UP)
                return BOTTOM;
            return WALL;
        }

        public static EnumPosition fromIndex(int index) {
            return values()[index % (values()).length];
        }
    }
}

