/*package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockFlowerPot extends BlockContainer implements IHasModel {
    public static final PropertyInteger LEGACY_DATA = PropertyInteger.create("legacy_data", 0, 15);
    public static final PropertyEnum<EnumFlowerType> CONTENTS = PropertyEnum.<EnumFlowerType>create("contents", EnumFlowerType.class);
    protected static final AxisAlignedBB FLOWER_POT_AABB = new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D);

    public BlockFlowerPot(String name)
    {
        super(Material.CIRCUITS);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);
        setDefaultState(this.blockState.getBaseState().withProperty((IProperty)CONTENTS, EnumFlowerType.EMPTY).withProperty((IProperty)LEGACY_DATA, Integer.valueOf(0)));

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
    }

    @Override
    public String getTranslationKey() {
        return super.getTranslationKey();
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return FLOWER_POT_AABB;
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = playerIn.getHeldItem(hand);
        TileEntityFlowerPot tileentityflowerpot = this.getTileEntity(worldIn, pos);

        if (tileentityflowerpot == null)
        {
            return false;
        }
        else
        {
            ItemStack itemstack1 = tileentityflowerpot.getFlowerItemStack();

            if (itemstack1.isEmpty())
            {
                if (!this.canBePotted(itemstack))
                {
                    return false;
                }

                tileentityflowerpot.setItemStack(itemstack);
                playerIn.addStat(StatList.FLOWER_POTTED);

                if (!playerIn.capabilities.isCreativeMode)
                {
                    itemstack.shrink(1);
                }
            }
            else
            {
                if (itemstack.isEmpty())
                {
                    playerIn.setHeldItem(hand, itemstack1);
                }
                else if (!playerIn.addItemStackToInventory(itemstack1))
                {
                    playerIn.dropItem(itemstack1, false);
                }

                tileentityflowerpot.setItemStack(ItemStack.EMPTY);
            }

            tileentityflowerpot.markDirty();
            worldIn.notifyBlockUpdate(pos, state, state, 3);
            return true;
        }
    }

    private boolean canBePotted(ItemStack stack)
    {
        Block block = Block.getBlockFromItem(stack.getItem());

        if (block != Blocks.YELLOW_FLOWER && block != Blocks.RED_FLOWER && block != Blocks.CACTUS && block != Blocks.BROWN_MUSHROOM && block != Blocks.RED_MUSHROOM && block != Blocks.SAPLING && block != Blocks.DEADBUSH)
        {
            int i = stack.getMetadata();
            return ((block == Blocks.TALLGRASS && i == BlockTallGrass.EnumType.FERN.getMeta()) || block instanceof BlockPlante);
        }
        else
        {
            return true;
        }
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        TileEntityFlowerPot tileentityflowerpot = this.getTileEntity(worldIn, pos);

        if (tileentityflowerpot != null)
        {
            ItemStack itemstack = tileentityflowerpot.getFlowerItemStack();

            if (!itemstack.isEmpty())
            {
                return itemstack;
            }
        }

        return new ItemStack(Item.getItemFromBlock(ModBlocks.FLOWER_POT));
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        IBlockState downState = worldIn.getBlockState(pos.down());
        return super.canPlaceBlockAt(worldIn, pos) && (downState.isTopSolid() || downState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID);
    }

    @Override
    public void onNeighborChange(IBlockAccess world, BlockPos pos, BlockPos neighbor)
    {
        IBlockState downState = world.getBlockState(pos.down());
        if (!downState.isTopSolid() && downState.getBlockFaceShape(world, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID)
        {
            this.dropBlockAsItem((World)world, pos, world.getBlockState(pos), 0);
            ((World)world).setBlockToAir(pos);
        }
    }

    public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
    {
        super.breakBlock(worldIn, pos, state);
    }

    public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        super.onBlockHarvested(worldIn, pos, state, player);

        if (player.capabilities.isCreativeMode)
        {
            TileEntityFlowerPot tileentityflowerpot = this.getTileEntity(worldIn, pos);

            if (tileentityflowerpot != null)
            {
                tileentityflowerpot.setItemStack(ItemStack.EMPTY);
            }
        }
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.FLOWER_POT);
    }

    @Nullable
    private TileEntityFlowerPot getTileEntity(World worldIn, BlockPos pos)
    {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity instanceof TileEntityFlowerPot ? (TileEntityFlowerPot)tileentity : null;
    }

    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        Block block = null;
        int i = 0;

        switch (meta)
        {
            case 1:
                block = Blocks.RED_FLOWER;
                i = BlockFlower.EnumFlowerType.POPPY.getMeta();
                break;
            case 2:
                block = Blocks.YELLOW_FLOWER;
                break;
            case 3:
                block = Blocks.SAPLING;
                i = BlockPlanks.EnumType.OAK.getMetadata();
                break;
            case 4:
                block = Blocks.SAPLING;
                i = BlockPlanks.EnumType.SPRUCE.getMetadata();
                break;
            case 5:
                block = Blocks.SAPLING;
                i = BlockPlanks.EnumType.BIRCH.getMetadata();
                break;
            case 6:
                block = Blocks.SAPLING;
                i = BlockPlanks.EnumType.JUNGLE.getMetadata();
                break;
            case 7:
                block = Blocks.RED_MUSHROOM;
                break;
            case 8:
                block = Blocks.BROWN_MUSHROOM;
                break;
            case 9:
                block = Blocks.CACTUS;
                break;
            case 10:
                block = Blocks.DEADBUSH;
                break;
            case 11:
                block = Blocks.TALLGRASS;
                i = BlockTallGrass.EnumType.FERN.getMeta();
                break;
            case 12:
                block = Blocks.SAPLING;
                i = BlockPlanks.EnumType.ACACIA.getMetadata();
                break;
            case 13:
                block = Blocks.SAPLING;
                i = BlockPlanks.EnumType.DARK_OAK.getMetadata();
        }

        return new TileEntityFlowerPot(Item.getItemFromBlock(block), i);
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer((Block)this, new IProperty[] { (IProperty)CONTENTS, (IProperty)LEGACY_DATA });
    }



    public int getMetaFromState(IBlockState state) {
        return ((Integer)state.getValue((IProperty)LEGACY_DATA)).intValue();
    }



    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        EnumFlowerType blockflowerpot$enumflowertype = EnumFlowerType.EMPTY;
        TileEntity tileentity = worldIn instanceof ChunkCache ? ((ChunkCache)worldIn).getTileEntity(pos, Chunk.EnumCreateEntityType.CHECK) : worldIn.getTileEntity(pos);

        if (tileentity instanceof TileEntityFlowerPot)
        {
            TileEntityFlowerPot tileentityflowerpot = (TileEntityFlowerPot)tileentity;
            Item item = tileentityflowerpot.getFlowerPotItem();

            if (item instanceof ItemBlock) {
                int i = tileentityflowerpot.getFlowerPotData();
                Block block = Block.getBlockFromItem(item);
                if(block instanceof BlockPlante){
                    if(block == ModBlocks.BASILIC){
                        blockflowerpot$enumflowertype = EnumFlowerType.BASILIC;
                    }
                } else if (block == Blocks.SAPLING) {
                    switch (BlockPlanks.EnumType.byMetadata(i))
                    {
                        case OAK:
                            blockflowerpot$enumflowertype = EnumFlowerType.OAK_SAPLING;
                            break;
                        case SPRUCE:
                            blockflowerpot$enumflowertype = EnumFlowerType.SPRUCE_SAPLING;
                            break;
                        case BIRCH:
                            blockflowerpot$enumflowertype = EnumFlowerType.BIRCH_SAPLING;
                            break;
                        case JUNGLE:
                            blockflowerpot$enumflowertype = EnumFlowerType.JUNGLE_SAPLING;
                            break;
                        case ACACIA:
                            blockflowerpot$enumflowertype = EnumFlowerType.ACACIA_SAPLING;
                            break;
                        case DARK_OAK:
                            blockflowerpot$enumflowertype = EnumFlowerType.DARK_OAK_SAPLING;
                            break;
                        default:
                            blockflowerpot$enumflowertype = EnumFlowerType.EMPTY;
                    }
                }
                else if (block == Blocks.TALLGRASS)
                {
                    switch (i)
                    {
                        case 0:
                            blockflowerpot$enumflowertype = EnumFlowerType.DEAD_BUSH;
                            break;
                        case 2:
                            blockflowerpot$enumflowertype = EnumFlowerType.FERN;
                            break;
                        default:
                            blockflowerpot$enumflowertype = EnumFlowerType.EMPTY;
                    }
                }
                else if (block == Blocks.YELLOW_FLOWER)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.DANDELION;
                }
                else if (block == Blocks.RED_FLOWER)
                {
                    switch (BlockFlower.EnumFlowerType.getType(BlockFlower.EnumFlowerColor.RED, i))
                    {
                        case POPPY:
                            blockflowerpot$enumflowertype = EnumFlowerType.POPPY;
                            break;
                        case BLUE_ORCHID:
                            blockflowerpot$enumflowertype = EnumFlowerType.BLUE_ORCHID;
                            break;
                        case ALLIUM:
                            blockflowerpot$enumflowertype = EnumFlowerType.ALLIUM;
                            break;
                        case HOUSTONIA:
                            blockflowerpot$enumflowertype = EnumFlowerType.HOUSTONIA;
                            break;
                        case RED_TULIP:
                            blockflowerpot$enumflowertype = EnumFlowerType.RED_TULIP;
                            break;
                        case ORANGE_TULIP:
                            blockflowerpot$enumflowertype = EnumFlowerType.ORANGE_TULIP;
                            break;
                        case WHITE_TULIP:
                            blockflowerpot$enumflowertype = EnumFlowerType.WHITE_TULIP;
                            break;
                        case PINK_TULIP:
                            blockflowerpot$enumflowertype = EnumFlowerType.PINK_TULIP;
                            break;
                        case OXEYE_DAISY:
                            blockflowerpot$enumflowertype = EnumFlowerType.OXEYE_DAISY;
                            break;
                        default:
                            blockflowerpot$enumflowertype = EnumFlowerType.EMPTY;
                    }
                }
                else if (block == Blocks.RED_MUSHROOM)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.MUSHROOM_RED;
                }
                else if (block == Blocks.BROWN_MUSHROOM)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.MUSHROOM_BROWN;
                }
                else if (block == Blocks.DEADBUSH)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.DEAD_BUSH;
                }
                else if (block == Blocks.CACTUS)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.CACTUS;
                }
            }
        }

        return state.withProperty(CONTENTS, blockflowerpot$enumflowertype);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }


    ============================FORGE START=====================================
    @Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        super.getDrops(drops, world, pos, state, fortune);
        TileEntityFlowerPot te = world.getTileEntity(pos) instanceof TileEntityFlowerPot ? (TileEntityFlowerPot)world.getTileEntity(pos) : null;
        if (te != null && te.getFlowerPotItem() != null)
            drops.add(new ItemStack(te.getFlowerPotItem(), 1, te.getFlowerPotData()));
    }
    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
    {
        if (willHarvest) return true; //If it will harvest, delay deletion of the block until after getDrops
        return super.removedByPlayer(state, world, pos, player, willHarvest);
    }
    @Override
    public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack tool)
    {
        super.harvestBlock(world, player, pos, state, te, tool);
        world.setBlockToAir(pos);
    }
    ===========================FORGE END==========================================

    public static enum EnumFlowerType implements IStringSerializable
    {
        EMPTY("empty"),
        POPPY("rose"),
        BLUE_ORCHID("blue_orchid"),
        ALLIUM("allium"),
        HOUSTONIA("houstonia"),
        RED_TULIP("red_tulip"),
        ORANGE_TULIP("orange_tulip"),
        WHITE_TULIP("white_tulip"),
        PINK_TULIP("pink_tulip"),
        OXEYE_DAISY("oxeye_daisy"),
        DANDELION("dandelion"),
        OAK_SAPLING("oak_sapling"),
        SPRUCE_SAPLING("spruce_sapling"),
        BIRCH_SAPLING("birch_sapling"),
        JUNGLE_SAPLING("jungle_sapling"),
        ACACIA_SAPLING("acacia_sapling"),
        DARK_OAK_SAPLING("dark_oak_sapling"),
        MUSHROOM_RED("mushroom_red"),
        MUSHROOM_BROWN("mushroom_brown"),
        DEAD_BUSH("dead_bush"),
        FERN("fern"),
        CACTUS("cactus"),
        BASILIC("basilic");

        private final String name;

        private EnumFlowerType(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return this.name;
        }

        public String getName()
        {
            return this.name;
        }
    }
}
*/