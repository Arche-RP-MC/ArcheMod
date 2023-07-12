package fr.archemod.fiche.container;

import fr.archemod.fiche.inventory.InventoryFichePersonnage;
import fr.archemod.fiche.slot.SlotInventoryFichePersonnage;
import fr.archemod.items.Bourse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;

public class ContainerFichePersonnage extends Container {
    public InventoryFichePersonnage inventoryFichePersonnage;
    public int rows;

    public ContainerFichePersonnage(InventoryPlayer playerInv, InventoryFichePersonnage inv) {
        this.inventoryFichePersonnage = inv;
        this.rows = inv.getSizeInventory() / 3;
        this.rows = 6;
        int i = (this.rows - 4) * 18;
        int j;
        int k;

        //Adding fiche personnage slot
        for (j = 0; j < this.rows; ++j) {
            for (k = 0; k < 3; ++k) {
                this.addSlotToContainer(new SlotInventoryFichePersonnage(inv, k + j * 9, 8 + k * 18, 18 + j * 18));
            }
        }

        // Adding player's slots
        for (j = 0; j < 3; ++j) {
            for (k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(playerInv, k + j * 9 + 9, 8 + k * 18, 103 + j * 18 + i));
            }
        }

        for (j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(playerInv, j, 8 + j * 18, 161 + i));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    public void writeToNBT(ItemStack stack) {
        if (!stack.hasTagCompound()) stack.setTagCompound(new NBTTagCompound());
        inventoryFichePersonnage.writeToNBT(stack.getTagCompound());
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = (Slot) this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // Prevents backpack-ception (backpack inside backpack) with
            // shift-click
            if (itemstack.getItem() instanceof Bourse) return ItemStack.EMPTY;

            if (index < this.inventoryFichePersonnage.getSizeInventory()) {
                if (!this.mergeItemStack(itemstack1, this.inventoryFichePersonnage.getSizeInventory(), this.inventorySlots.size(), true))
                    return ItemStack.EMPTY;
            } else if (!this.mergeItemStack(itemstack1, 0, this.inventoryFichePersonnage.getSizeInventory(), false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.getCount() == 0)
                slot.putStack(ItemStack.EMPTY);
            else
                slot.onSlotChanged();
        }

        return itemstack;
    }

    //FLAG == 2 --> SWAP?
    @Override
    public ItemStack slotClick(int slotId, int dragType, ClickType clickTypeIn, EntityPlayer player) {
        // Prevents from removing current backpack
        if (clickTypeIn == ClickType.SWAP && dragType == player.inventory.currentItem) return ItemStack.EMPTY;
        if (slotId - this.inventoryFichePersonnage.getSizeInventory() - 27 == player.inventory.currentItem)
            return ItemStack.EMPTY;
        return super.slotClick(slotId, dragType, clickTypeIn, player);
    }

    /**
     * Used to save content
     */
    @Override
    public void onContainerClosed(EntityPlayer player) {
        this.writeToNBT(player.getHeldItem(EnumHand.MAIN_HAND));
        super.onContainerClosed(player);
    }

}
