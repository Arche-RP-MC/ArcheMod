package fr.archemod.blocks.tileentity;

import fr.archemod.util.Reference;

public class TileEntityBlockPorteManteau extends TileEntityBlockInventory {

    public TileEntityBlockPorteManteau() { super(); }

    @Override
    public int getSizeInventory() {
        return 12;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public int getSlotInRow() {
        return 6;
    }

    @Override
    public String getGuiID() {
        return Reference.MOD_ID + ":porte_manteau";
    }

    @Override
    public String getName() {
        return "Porte Manteau";
    }
}