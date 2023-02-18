package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockVerre extends BlockBreakable
{
    public BlockVerre(Material materialIn, boolean ignoreSimilarity, String name, float hardness, float resistance)
    {
        super(materialIn, ignoreSimilarity);
        setTranslationKey(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(ArcheMod.archeCreativeTabs);

    ModBlocks.BLOCKS.add(this);
    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
}


    public int quantityDropped(Random random)
    {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
}



