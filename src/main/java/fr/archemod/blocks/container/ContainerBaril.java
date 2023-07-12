package fr.archemod.blocks.container;

import fr.archemod.blocks.slot.SlotOutput;
import fr.archemod.blocks.slot.SlotSingleItem;
import fr.archemod.blocks.tileentity.TileEntityBaril;
import fr.archemod.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Arrays;

public class ContainerBaril extends Container {

    private TileEntityBaril tile;
    private int timePassed = 0;
    private int burnTimeLeft = 0;
    private int fuel = 0;

    public ContainerBaril(InventoryPlayer playerInventory, TileEntityBaril tile) {
        this.tile = tile;

        int i;
        for (i = 0; i < 1; i++) {
            this.addSlotToContainer(new Slot(tile, i, 48 + i * 18, 7 * 3 + 2));
        }
        for (i = 0; i < 1; i++) {
            this.addSlotToContainer(new SlotSingleItem(tile, i + 1, 42 + 6, 40 + i * 18 + 6, Arrays.asList(new Item[]{ModItems.LEVURE})));
        }
        this.addSlotToContainer(new SlotOutput(tile, 2, 98, 34));

        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return tile.isUsableByPlayer(player);
    }


    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return ItemStack.EMPTY;
    }

    @Override
    public void addListener(IContainerListener listener) {
        super.addListener(listener);
        listener.sendAllWindowProperties(this, this.tile);
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < this.listeners.size(); ++i) {
            IContainerListener icontainerlistener = (IContainerListener) this.listeners
                    .get(i);

            if (this.burnTimeLeft != this.tile.getField(0)) {
                icontainerlistener.sendWindowProperty(this, 0,
                        this.tile.getField(0));
            }

            if (this.timePassed != this.tile.getField(1)) {
                icontainerlistener.sendWindowProperty(this, 1,
                        this.tile.getField(1));
            }
            if (this.fuel != this.tile.getField(2)) {
                icontainerlistener.sendWindowProperty(this, 2,
                        this.tile.getField(2));
            }
        }

        this.burnTimeLeft = this.tile.getField(0);
        this.timePassed = this.tile.getField(1);
        this.fuel = this.tile.getField(2);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data) {
        this.tile.setField(id, data);

    }


}