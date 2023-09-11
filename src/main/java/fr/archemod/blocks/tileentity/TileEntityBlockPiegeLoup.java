package fr.archemod.blocks.tileentity;

import fr.archemod.util.Reference;

public class TileEntityBlockPiegeLoup extends TileEntityBlockInventory {
    public TileEntityBlockPiegeLoup() { super(); }

    @Override
    public int getSizeInventory() {
        return 3;
    }

    @Override
    public int getInventoryStackLimit() {
        return 3;
    }

    @Override
    public int getSlotInRow() {
        return 3;
    }

    @Override
    public String getGuiID() {
        return Reference.MOD_ID + ":piege_loup";
    }

    @Override
    public String getName() {
        return "Piège à Loup";
    }
}
