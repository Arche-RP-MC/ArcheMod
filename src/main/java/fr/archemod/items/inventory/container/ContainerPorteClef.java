package fr.archemod.items.inventory.container;

import fr.archemod.items.PorteClef;
import fr.archemod.items.inventory.InventoryPorteClef;
import fr.archemod.items.inventory.slot.SlotPorteClef;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.inventory.Container;

public class ContainerPorteClef extends Container {
    public InventoryPorteClef invPorteClef;
    public int rows;

    public ContainerPorteClef(InventoryPlayer playerInv, InventoryPorteClef inv) {
        this.invPorteClef = inv;
        this.rows = inv.getSizeInventory() / 6;
        int i = (this.rows - 4) * 18;
        int j;
        int k;

        // Adding slots to the backpack //26 ou 25
        for (j = 0; j < this.rows; ++j) {
            for (k = 0; k < 6; ++k) {
                this.addSlotToContainer(new SlotPorteClef(inv, k + j * 6, 26 + k * 18, 18 + j * 18));
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
        invPorteClef.writeToNBT(stack.getTagCompound());
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // Prevents backpack-ception (backpack inside backpack) with
            // shift-click
            if (itemstack.getItem() instanceof PorteClef) return ItemStack.EMPTY;

            if (index < this.invPorteClef.getSizeInventory()) {
                if (!this.mergeItemStack(itemstack1, this.invPorteClef.getSizeInventory(), this.inventorySlots.size(), true))
                    return ItemStack.EMPTY;
            } else if (!this.mergeItemStack(itemstack1, 0, this.invPorteClef.getSizeInventory(), false)) {
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
        if (slotId - this.invPorteClef.getSizeInventory() - 27 == player.inventory.currentItem) return ItemStack.EMPTY;
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