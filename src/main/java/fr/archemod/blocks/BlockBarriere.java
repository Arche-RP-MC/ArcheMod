package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBarriere  extends BlockFence implements IHasModel {

  public BlockBarriere(String name, Material materialIn, MapColor mapColorIn, float hardness, float resistance) {
    super(materialIn, mapColorIn);
    setTranslationKey(name);
    setRegistryName(name);
    setHardness(hardness);
    setResistance(resistance);
    setCreativeTab(ArcheMod.archeCreativeTabs);

    ModBlocks.BLOCKS.add(this);
    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
  }
  

  public void registerModels() {
      ArcheMod.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
  }
}