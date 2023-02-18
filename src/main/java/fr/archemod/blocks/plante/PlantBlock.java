package fr.archemod.blocks.plante;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class PlantBlock extends Block {
    private int ticksBetweenDuplication;

    public PlantBlock(String name, Material material, int ticksBetweenDuplication) {
        super(material);
        this.ticksBetweenDuplication = ticksBetweenDuplication;

        setSoundType(SoundType.PLANT);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
        super.updateTick(world, pos, state, rand);

        if (!world.isRemote) {
            if (rand.nextInt(ticksBetweenDuplication) == 0) {
                BlockPos[] adjacentPositions = {pos.north(), pos.south(), pos.east(), pos.west()};
                BlockPos targetPos = adjacentPositions[rand.nextInt(adjacentPositions.length)];
                IBlockState targetState = world.getBlockState(targetPos);

                if (targetState.getBlock() == Blocks.GRASS) {
                    world.setBlockState(targetPos, this.getDefaultState());
                }
            }
        }
    }
}