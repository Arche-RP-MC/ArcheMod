package fr.archemod.fiche.slot;

import fr.archemod.items.Bourse;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotArmorFichePersonnage extends Slot {
    public SlotArmorFichePersonnage(IInventory inv, int index, int x, int y) {
        super(inv, index, x, y);
    }

    /**
     * Method used to prevent backpack-ception (backpacks inside backpacks)
     */
    @Override
    public boolean isItemValid(ItemStack stack) {
        return !(stack.getItem() instanceof Bourse);
    }
}
