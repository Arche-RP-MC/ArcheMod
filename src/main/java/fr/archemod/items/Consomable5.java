package fr.archemod.items;

import net.minecraft.item.ItemStack;

public class Consomable5 extends ItemBase {

    public Consomable5(String name) {
        super(name);
        setNoRepair();
        setMaxStackSize(1);
        setMaxDamage(7);
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
}
