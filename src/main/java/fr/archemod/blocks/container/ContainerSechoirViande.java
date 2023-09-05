/*package fr.archemod.blocks.container;

import fr.archemod.blocks.slot.SlotSechoirViandeFuel;
import fr.archemod.blocks.slot.SlotSechoirViandeOutput;
import fr.archemod.blocks.tileentity.TileEntityFourSechoir2;
import fr.archemod.init.SechoirViandeRecipe;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerSechoirViande extends Container

{
private final TileEntityFourSechoir2 tileentity;
private  int cookTime, totalCookTime, burnTime, currentBurnTime;

public ContainerSechoirViande(InventoryPlayer player, TileEntityFourSechoir2 tileentity)
{
    this.tileentity = tileentity;
// pour le GUI dans le (new Slot(tileentity, correspond au n° du Slot en commencant par 0, correspond au nombre de pixel depuis le bord gauche au bord droit de la case, correspond au nombre de pixel du haut au haut de la case));
    this.addSlotToContainer(new Slot(tileentity, 0, burnTime, burnTime));
    this.addSlotToContainer(new Slot(tileentity, 1, burnTime, burnTime));
    this.addSlotToContainer(new SlotSechoirViandeFuel(tileentity, 2, burnTime, burnTime));
    this.addSlotToContainer(new SlotSechoirViandeOutput(player.player, tileentity, 2, burnTime, burnTime));

    for (int y = 0; y < 3; y++)
    {
        for (int x = 0; x < 9; x++)
        {
            this.addSlotToContainer(new Slot(player, x + y * 9 + 9, 8+x*18,84+y*18));
        }
    }

    for (int x=0; x<9;x++)
    {
        this.addSlotToContainer(new Slot(player,x,8+x*18,142));
    }

}
@Override
    public void addListener(IContainerListener listener)
{
    super.addListener(listener);
    listener.sendAllWindowProperties(this, this.tileentity);
}

@Override
    public void detectAndSendChanges()
{
    super.detectAndSendChanges();

    for(int i = 0; i < this.listeners.size(); ++i)
    {
        IContainerListener listener= (IContainerListener) this.listeners.get(i);



        if(this.cookTime != this.tileentity.getField(2)) listener.sendWindowProperty(this, 2 , this.tileentity.getField(2));
        if(this.burnTime != this.tileentity.getField(0)) listener.sendWindowProperty(this, 0 , this.tileentity.getField(2));
        if(this.currentBurnTime != this.tileentity.getField(1)) listener.sendWindowProperty(this, 1 , this.tileentity.getField(2));
        if(this.totalCookTime != this.tileentity.getField(3)) listener.sendWindowProperty(this, 3 , this.tileentity.getField(2));
    }

    this.cookTime = this.tileentity.getField(2);
    this.burnTime = this.tileentity.getField(0);
    this.currentBurnTime = this.tileentity.getField(1);
    this.totalCookTime = this.tileentity.getField(3);



}

@Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
{
    this.tileentity.setField(id, data);
}

@Override
    public boolean canInteractWith(EntityPlayer playerIn)
{
    return this.tileentity.isUsableByPlayer((playerIn));
}

@Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
{
    ItemStack stack = ItemStack.EMPTY;
    Slot slot = (Slot) this.inventorySlots.get(index);

    if (slot != null && slot.getHasStack())
    {
        ItemStack stack1 = slot.getStack();
        stack = stack1.copy();

        if(index == 3)
        {
            if(!this.mergeItemStack(stack1, 4, 40 , true)) return ItemStack.EMPTY;
            slot.onSlotChange(stack1, stack);
        }
        else if(index !=2 && index != 1 && index != 0)
        {
            Slot slot1 = (Slot) this.inventorySlots.get(index + 1);

            if(SechoirViandeRecipe.getInstance().getSechoirResult(stack1, slot1.getStack()).isEmpty())
            {
                if(!this.mergeItemStack(stack1,0,2,false))
                {
                    return ItemStack.EMPTY;

                }
                else if (TileEntityFourSechoir2.isItemFuel(stack1))
                {
                    if(!this.mergeItemStack(stack1,2,3,false)) return ItemStack.EMPTY;
                }
                else if (TileEntityFourSechoir2.isItemFuel(stack1))
                {
                    if(!this.mergeItemStack(stack1,2,3,false)) return ItemStack.EMPTY;
                }
                else if (TileEntityFourSechoir2.isItemFuel(stack1))
                {
                    if(!this.mergeItemStack(stack1,2,3,false)) return ItemStack.EMPTY;
                }
                else if(index >=4 && index <31)
                {
                    if(!this.mergeItemStack(stack1,31,40,false)) return ItemStack.EMPTY;
                }
                else if(index >= 31 && index < 40 && !this.mergeItemStack(stack1,4,31,false))
                {
                    return ItemStack.EMPTY;
                }
            }
        }
        else  if (!this.mergeItemStack(stack1,4,40,false))
        {
            return ItemStack.EMPTY;
        }
        if(stack1.isEmpty())
        {
            slot.putStack(ItemStack.EMPTY);
        }
        else
            {
            slot.onSlotChanged();
        }
        if(stack1.getCount() == stack.getCount()) return ItemStack.EMPTY;
        slot.onTake(playerIn, stack1);
    }
    return stack;
}








}
*/