/*package fr.archemod.blocks;


import fr.archemod.blocks.tileentity.TileEntityLightBlock2;
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

import java.util.Random;

public class BlockLustre extends BlockBase implements ITileEntityProvider {



    public final boolean burning;


    public BlockLustre(String name, boolean burning, Material material, float hardness, float resistance, SoundType soundType) {
        super(name + (!burning ? "_off" : ""), material, hardness, resistance, soundType);

        if (burning) {
            setLightLevel(0.875F);
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
            worldIn.setBlockState(pos, ModBlocks.LUSTRE_ETEINT.getDefaultState());
        } else if (playerIn.getHeldItemMainhand() != ItemStack.EMPTY
                &&
                playerIn.getHeldItemMainhand().getItem() == ModItems.BOUGIE) {
            if (!playerIn.isCreative())
                playerIn.getHeldItemMainhand().shrink(1);
            worldIn.setBlockState(pos, ModBlocks.LUSTRE_ALUME.getDefaultState());
            ((TileEntityLightBlock2)worldIn.getTileEntity(pos)).setDate();
        }
        return true;
    }



    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (canPlaceBlockAt(worldIn, pos))
            super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
    }



    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this);
    }



    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return (TileEntity)new TileEntityLightBlock2();
    }

    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        return BlockFaceShape.UNDEFINED;
    }


}
*/