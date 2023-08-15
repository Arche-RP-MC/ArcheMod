package fr.archemod.items.inventory.slot;

import fr.archemod.items.Clef;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPorteClef extends Slot {
    public SlotPorteClef(IInventory inv, int index, int x, int y) {
        super(inv, index, x, y);
    }

    /**
     * Method used to prevent backpack-ception (backpacks inside backpacks)
     */
    @Override
    public boolean isItemValid(ItemStack stack) { return stack.getItem() instanceof Clef; }
}
