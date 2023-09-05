package fr.archemod.items;

import net.minecraft.item.ItemStack;

public class OutilsEnBronze extends ItemBase {

    public OutilsEnBronze(String name) {
        super(name);
        setNoRepair();
        setMaxStackSize(1);
        setMaxDamage(80);
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        if (itemStack.getItemDamage() == itemStack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        ItemStack itemCopy = itemStack.copy();
        itemCopy.setItemDamage(itemCopy.getItemDamage() + 1);
        return itemCopy;
    }

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack) {
        return false;
    }

}
