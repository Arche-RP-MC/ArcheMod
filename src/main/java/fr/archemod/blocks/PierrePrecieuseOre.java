package fr.archemod.blocks;

import fr.archemod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class PierrePrecieuseOre extends BlockBase {

    public PierrePrecieuseOre(String name, Material material) {
        super(name, material, 3F, 3F, SoundType.STONE);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        int max = 3;
        int min = 1;
        int random = rand.nextInt(max) + min;
        switch (random) {
            case 1:
                return ModItems.PETITE_GEMME_INCONNUE;
            case 2:
                return ModItems.GEMME_INCONNUE;
            case 3:
                return ModItems.GROSSE_GEMME_INCONNUE;
        }
        return ModItems.GEMME_INCONNUE;
    }

    @Override
    public int quantityDropped(Random rand) {
        return 1;
    }
}
