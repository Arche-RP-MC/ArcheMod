package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.itemblock.ItemBlockDoor;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public class BlockPorte extends BlockDoor implements IHasModel{

  public BlockPorte(String name, Material materialIn, SoundType sound, float hardness) {
    super(materialIn);
    setSoundType(sound);
    setHardness(hardness);
    setTranslationKey(name);
    setRegistryName(name);
    setCreativeTab(ArcheMod.archeCreativeTabs);

    ModBlocks.BLOCKS.add(this);
    ModItems.ITEMS.add(new ItemBlockDoor(this).setRegistryName(this.getRegistryName()));

  }

  @Override
  public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    return Item.getItemFromBlock(this);
  }

  @Override
  public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
    return new ItemStack(this);
  }

  public void registerModels() {
      ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
  }
}