package fr.archemod.blocks.agriculture;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockPlanLin extends BlockCrops {

    private final Item seed;
    private final Item crop;


    public BlockPlanLin(String name, Item seed, Item crop) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        this.seed = seed;
        this.crop = crop;

        ModBlocks.BLOCKS.add(this);
    }

    @Override
    protected Item getSeed() {
        return this.seed;
    }

    @Override
    protected Item getCrop() {
        return this.crop;
    }
}
