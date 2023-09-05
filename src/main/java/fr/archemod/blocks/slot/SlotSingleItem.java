package fr.archemod.blocks.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class SlotSingleItem extends Slot {

    private List<Item> validItems;

    public SlotSingleItem(IInventory inventoryIn, int index, int xPosition, int yPosition, List<Item> validItems) {
        super(inventoryIn, index, xPosition, yPosition);
        this.validItems = validItems;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        for (Item item : validItems) {

            if (stack.getItem().equals(item)) {
                return true;
            }
        }
        return false;

    }
}