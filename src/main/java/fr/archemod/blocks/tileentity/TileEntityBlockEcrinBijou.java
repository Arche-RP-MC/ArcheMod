package fr.archemod.blocks.tileentity;

import fr.archemod.util.Reference;

public class TileEntityBlockEcrinBijou extends TileEntityBlockInventory {
    public TileEntityBlockEcrinBijou() { super(); }

    @Override
    public int getSizeInventory() {
        return 9;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public int getSlotInRow() {
        return 9;
    }

    @Override
    public String getGuiID() {
        return Reference.MOD_ID + ":ecrin_bijou";
    }

    @Override
    public String getName() {
        return "Écrin à Bijoux";
    }
}
