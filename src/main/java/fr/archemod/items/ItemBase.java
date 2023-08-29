package fr.archemod.items;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setMaxStackSize(50);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        ModItems.ITEMS.add(this);
    }

    public ItemBase(String name, boolean showCreativeTab) {
        setMaxStackSize(50);
        setTranslationKey(name);
        setRegistryName(name);
        if(showCreativeTab) setCreativeTab(ArcheMod.archeCreativeTabs);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
