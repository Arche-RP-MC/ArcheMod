package fr.archemod.items;

import net.minecraft.item.ItemStack;

public class ItemIngrediant extends ItemBase {
    public ItemIngrediant(String name, int durability) {
        super(name);
        setNoRepair();
        setMaxStackSize(1);
        setMaxDamage(durability);
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
