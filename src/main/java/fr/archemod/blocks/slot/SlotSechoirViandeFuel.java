package fr.archemod.blocks.slot;

import fr.archemod.blocks.tileentity.TileEntityFourSechoir2;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSechoirViandeFuel  extends Slot
{
public SlotSechoirViandeFuel(IInventory inventory, int index, int x, int y)
{
    super(inventory, index,x,y);
}

@Override
    public boolean isItemValid(ItemStack stack)
{
    return TileEntityFourSechoir2.isItemFuel(stack);
}
@Override
    public int getItemStackLimit(ItemStack stack)
{
    return super.getItemStackLimit(stack);
}
}
