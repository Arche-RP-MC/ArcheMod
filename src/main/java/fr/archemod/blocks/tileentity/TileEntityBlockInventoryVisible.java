package fr.archemod.blocks.tileentity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public abstract class TileEntityBlockInventoryVisible extends TileEntityBlockInventory {
    public TileEntityBlockInventoryVisible() {
        super();
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        ItemStack stack = super.removeStackFromSlot(index);
        sendUpdates();
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, @Nullable ItemStack stack) {
        super.setInventorySlotContents(index, stack);
        sendUpdates();
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack stack = super.decrStackSize(index, count);
        sendUpdates();
        return stack;
    }

    @Override
    public void clear() {
        super.clear();
        sendUpdates();
    }

    private void sendUpdates() {
        world.markBlockRangeForRenderUpdate(pos, pos);
        world.notifyBlockUpdate(pos, getState(), getState(), 3);
        world.scheduleBlockUpdate(pos,this.getBlockType(),0,0);
        markDirty();
    }

    private IBlockState getState() {
        return world.getBlockState(pos);
    }
}
