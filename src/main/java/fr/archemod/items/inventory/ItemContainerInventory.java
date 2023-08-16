package fr.archemod.items.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.util.Constants;

public class ItemContainerInventory implements IInventory {
    private int size;
    private int slotInRow;
    private final NonNullList<ItemStack> content;
    private String name = "Conteneur";
    private int inventoryStackLimit = 50;

    public ItemContainerInventory(ItemStack container, int size) {
        this.size = size;
        this.content = NonNullList.withSize(size, ItemStack.EMPTY);
        if (!container.hasTagCompound()) container.setTagCompound(new NBTTagCompound());
        this.readFromNBT(container.getTagCompound());
    }

    public ItemContainerInventory(ItemStack container, int size, String name, int inventoryStackLimit, int slotInRow) {
        this.slotInRow = slotInRow;
        this.inventoryStackLimit = inventoryStackLimit;
        this.name = name;
        this.size = size;
        this.content = NonNullList.withSize(size, ItemStack.EMPTY);
        if (!container.hasTagCompound()) container.setTagCompound(new NBTTagCompound());
        this.readFromNBT(container.getTagCompound());
    }

    public void readFromNBT(NBTTagCompound comp) {
        NBTTagList nbtlist = comp.getTagList("Inventory", Constants.NBT.TAG_COMPOUND);
        for (int i = 0; i < nbtlist.tagCount(); i++) {
            NBTTagCompound comp1 = nbtlist.getCompoundTagAt(i);
            int slot = comp1.getInteger("Slot");
            this.content.set(slot, new ItemStack(comp1));
        }
    }

    public void writeToNBT(NBTTagCompound comp) {
        NBTTagList nbtlist = new NBTTagList();

        for (int i = 0; i < this.size; i++) {
            NBTTagCompound comp1 = new NBTTagCompound();
            comp1.setInteger("Slot", i);
            this.content.get(i).writeToNBT(comp1);
            nbtlist.appendTag(comp1);
        }
        comp.setTag("Inventory", nbtlist);
    }

    public Slot getNewSlot(IInventory inv, int index, int x, int y) {
        return new Slot(inv, index, x, y);
    }

    public int getSlotInRow() { return slotInRow; }

    @Override
    public boolean isEmpty() {
        for (ItemStack itemstack : this.content) {
            if (!itemstack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack getStackInSlot(int index) { return this.content.get(index); }

    @Override
    public ItemStack decrStackSize(int index, int amount) {
        ItemStack stack = getStackInSlot(index);
        if (stack != null) {
            if (stack.getCount() > amount) {
                stack = stack.splitStack(amount);
                if (stack.getCount() == 0) this.content.set(index, ItemStack.EMPTY);
            } else {
                this.content.set(index, ItemStack.EMPTY);
            }
        }
        return stack;
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        ItemStack ret = this.content.get(index);
        this.content.set(index, ItemStack.EMPTY);
        return ret;
    }

    @Override
    public ITextComponent getDisplayName() { return this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName(), new Object[0]); }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) { this.content.set(index, stack); }

    @Override
    public boolean hasCustomName() { return false; }

    @Override
    public void markDirty() {}

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) { return true; }

    @Override
    public void openInventory(EntityPlayer player) {}

    @Override
    public void closeInventory(EntityPlayer player) {}

    @Override
    public int getSizeInventory() { return this.size; }

    @Override
    public int getFieldCount() { return 0; }

    @Override
    public int getField(int id) { return 0; }

    @Override
    public void setField(int id, int value) {}

    @Override
    public void clear() { this.content.clear(); }

    @Override
    public int getInventoryStackLimit() {
        return this.inventoryStackLimit;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) { return true; }
}
