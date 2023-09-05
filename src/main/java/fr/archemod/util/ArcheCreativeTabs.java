package fr.archemod.util;

import fr.archemod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ArcheCreativeTabs extends CreativeTabs {
    public ArcheCreativeTabs(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.PETIT_CHEVAL_EN_BOIS);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}