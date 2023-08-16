package fr.archemod.items.inventory;

import fr.archemod.items.BijouSerti;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBijouSerti extends Slot {
    public SlotBijouSerti(IInventory inv, int index, int x, int y) {
        super(inv, index, x, y);
    }

    /**
     * Method used to prevent backpack-ception (backpacks inside backpacks)
     */
    @Override
    public boolean isItemValid(ItemStack stack) {
        return !(stack.getItem() instanceof BijouSerti);
    }
}
