/*package fr.archemod.blocks;

import fr.archemod.init.ModBlocks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.Random;

public abstract class BlockDalleWoolColoredMagenta extends BlockSlab {

	public static final PropertyEnum<EnumVariant> VARIANT = PropertyEnum.<EnumVariant>create("variant", EnumVariant.class);

	public BlockDalleWoolColoredMagenta(String name, float hardness, float resistance, Material materialIn, SoundType sound) {
		super(materialIn);

		setTranslationKey(name);
		setRegistryName(name);
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);

		IBlockState state = this.blockState.getBaseState().withProperty(VARIANT, EnumVariant.DEFAULT);
		if (!this.isDouble()) {
			state = state.withProperty(BlockSlab.HALF, EnumBlockHalf.BOTTOM);
		}
		setDefaultState(state);
		this.useNeighborBrightness = !this.isDouble();
	}


	protected BlockStateContainer createBlockState() {
		return this.isDouble() ? new BlockStateContainer(this, new IProperty[]{VARIANT}) : new BlockStateContainer(this, new IProperty[]{HALF, VARIANT});
	}

	@Override
	@Nonnull
	public String getTranslationKey(final int meta) {
		return this.getTranslationKey();
	}

	@Override
	@Nonnull
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	@Nonnull
	public Comparable<?> getTypeForItem(final ItemStack stack) {
		return EnumVariant.DEFAULT;
	}

	public enum EnumVariant implements IStringSerializable {
		DEFAULT();

		@Override
		@Nonnull
		public String getName() {
			return "default";
		}
	}

	@Override
	public int getMetaFromState(final IBlockState state) {
		if (this.isDouble()) {
			return 0;
		} else {
			return state.getValue(HALF).ordinal();
		}
	}

	@Override
	@Nonnull
	public IBlockState getStateFromMeta(final int meta) {
		if (this.isDouble()) {
			return this.getDefaultState();
		} else {
			// % 2 to be nice & not crash if somehow there's a higher number than 1
			return this.getDefaultState().withProperty(HALF, BlockSlab.EnumBlockHalf.values()[meta % 2]);
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.WOOL_COLORED_MAGENTA_HALF_SLAB);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(ModBlocks.WOOL_COLORED_MAGENTA_HALF_SLAB);
	}

	public static class Double extends BlockDalleWoolColoredMagenta {

		public Double(String name, float hardness, float resistance, Material materialIn, SoundType sound) {
			super(name, hardness, resistance, materialIn, sound);
		}

		@Override
		public boolean isDouble() {
			return true;
		}

	}

	public static class Half extends BlockDalleWoolColoredMagenta {

		public Half(String name, float hardness, float resistance, Material materialIn, SoundType sound) {
			super(name, hardness, resistance, materialIn, sound);
		}

		@Override
		public boolean isDouble() {
			return false;
		}

	}

}

 */