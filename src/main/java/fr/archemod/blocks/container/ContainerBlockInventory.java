package fr.archemod.blocks.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.NonNullList;

public class ContainerBlockInventory extends TileEntityLockableLoot {

    private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(9, ItemStack.EMPTY);
    private String id;
    private int size;
    private int slotInRow;
    private int invStackLimit;

    public ContainerBlockInventory(String id, int size, int slotInRow, int invStackLimit) {
        this.id = id;
        this.size = size;
        this.slotInRow = slotInRow;
        this.invStackLimit = invStackLimit;
    }

    @Override
    public int getSizeInventory() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        for (ItemStack itemstack : this.stacks)
            if (!itemstack.isEmpty())
                return false;
        return true;
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return stacks.get(slot);
    }

    @Override
    public String getName() {
        return "Conteneur";
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.stacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
        if (!this.checkLootAndRead(compound))
            ItemStackHelper.loadAllItems(compound, this.stacks);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        if (!this.checkLootAndWrite(compound))
            ItemStackHelper.saveAllItems(compound, this.stacks);
        return compound;
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(this.pos, 0, this.getUpdateTag());
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public void handleUpdateTag(NBTTagCompound tag) {
        this.readFromNBT(tag);
    }

    @Override
    public int getInventoryStackLimit() {
        return this.invStackLimit;
    }

    @Override
    public String getGuiID() {
        return this.id;
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerBlockSlot(playerInventory, this);
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.stacks;
    }

    public int getSlotInRow() { return slotInRow; }

    public Slot getNewSlot(ContainerBlockInventory inv, int index, int x, int y) { return new Slot(inv, index, x, y); }
}
