package fr.archemod.blocks.plante;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMushroom extends Block {
    public static final PropertyInteger LUMINOSITY = PropertyInteger.create("luminosity", 0, 15);

    public BlockMushroom(String name) {
        super(Material.WOOD);
        setDefaultState(blockState.getBaseState().withProperty(LUMINOSITY, 0));
        setSoundType(SoundType.PLANT);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] { LUMINOSITY });
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(LUMINOSITY, meta);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(LUMINOSITY);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        int luminosity = state.getValue(LUMINOSITY);
        luminosity = (luminosity + 1) % 16;
        world.setBlockState(pos, state.withProperty(LUMINOSITY, luminosity));
        return true;
    }

    @Override
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer player) {
        IBlockState state = world.getBlockState(pos);
        int luminosity = state.getValue(LUMINOSITY);
        luminosity = (luminosity + 1) % 16;
        world.setBlockState(pos, state.withProperty(LUMINOSITY, luminosity));
    }
}