package fr.archemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockLustreTest extends BlockBase2
{

       public BlockLustreTest (String name, Material material) {
        super(name, material, 3F, 3F, SoundType.STONE);
        setHarvestLevel("pickaxe",2);
        setLightLevel(0.9F);
        }

        }
