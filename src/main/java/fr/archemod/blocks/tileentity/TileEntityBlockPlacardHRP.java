package fr.archemod.blocks.tileentity;

import fr.archemod.util.Reference;

public class TileEntityBlockPlacardHRP extends TileEntityBlockInventoryVisible {

    public TileEntityBlockPlacardHRP() { super(); }

    @Override
    public int getSizeInventory() {
        return 9;
    }

    @Override
    public int getInventoryStackLimit() {
        return 50;
    }

    @Override
    public int getSlotInRow() {
        return 3;
    }

    @Override
    public String getGuiID() {
        return Reference.MOD_ID + ":placard_hrp";
    }

    @Override
    public String getName() {
        return "Placard HRP";
    }
}
