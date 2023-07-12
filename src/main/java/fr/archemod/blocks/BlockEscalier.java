package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockEscalier extends BlockStairs implements IHasModel {

    public BlockEscalier(String name, float hardness, float resistance, SoundType soundType, IBlockState modelState) {
        super(modelState);
        setTranslationKey(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(soundType);
        setCreativeTab(ArcheMod.archeCreativeTabs);
        this.useNeighborBrightness = true;

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
