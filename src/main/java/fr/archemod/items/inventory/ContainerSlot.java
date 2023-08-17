package fr.archemod.items.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;

public class ContainerSlot extends Container {
    private ContainerInventory inv;
    private int rows;
    private int offset;

    public ContainerSlot(InventoryPlayer playerInv, ContainerInventory inv) {
        this.inv = inv;
        this.rows = inv.getSizeInventory() / inv.getSlotInRow();
        int i = (this.rows - 4) * 18;
        int j;
        int k;

        switch(inv.getSlotInRow()) {
            case 3:
                offset = 62;
                break;
            case 9:
                offset = 0;
                break;
            default:
                offset = 35;
        }

        // Adding slots to the backpack
        for (j = 0; j < this.rows; ++j) {
            for (k = 0; k < inv.getSlotInRow(); ++k) {
                this.addSlotToContainer(inv.getNewSlot(inv, k + j * inv.getSlotInRow(), offset + k * 18, 18 + j * 18));
            }
        }

        // Adding player's slots
        for (j = 0; j < 3; ++j) {
            for (k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(playerInv, k + j * 9 + 9, 8 + k * 18, 106 + j * 18 + i));
            }
        }

        for (j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(playerInv, j, 8 + j * 18, 164 + i));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    public void writeToNBT(ItemStack stack) {
        if (!stack.hasTagCompound()) stack.setTagCompound(new NBTTagCompound());
        inv.writeToNBT(stack.getTagCompound());
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
            if (itemstack.getItem() instanceof fr.archemod.items.ItemContainer) return ItemStack.EMPTY;

            if (index < this.inv.getSizeInventory()) {
                if (!this.mergeItemStack(itemstack1, this.inv.getSizeInventory(), this.inventorySlots.size(), true))
                    return ItemStack.EMPTY;
            } else if (!this.mergeItemStack(itemstack1, 0, this.inv.getSizeInventory(), false)) {
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
        if (slotId - this.inv.getSizeInventory() - 27 == player.inventory.currentItem) return ItemStack.EMPTY;
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
