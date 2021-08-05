package fr.archemod.blocks.gateau;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.BlockBase;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class Fromage extends BlockCake {
    public Fromage(String name, float hardness, float resistance, SoundType soundType) {

        setTranslationKey(name);
        setRegistryName(name);
        setSoundType(soundType);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        int i = ((Integer) state.getValue((IProperty) BITES)).intValue();
        if (i < 6) {
            worldIn.setBlockState(pos, state.withProperty((IProperty) BITES, Integer.valueOf(i + 1)), 3);
        } else {
            worldIn.setBlockToAir(pos);
        }
        playerIn.addItemStackToInventory(new ItemStack((Item) ModItems.TRANCHE_DE_FROMAGE));
        return true;
    }



}
