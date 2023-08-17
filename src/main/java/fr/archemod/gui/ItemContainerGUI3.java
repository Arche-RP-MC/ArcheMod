package fr.archemod.gui;

import fr.archemod.items.inventory.ContainerInventory;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ItemContainerGUI3 extends ItemContainerGUI36 {

    public ItemContainerGUI3(InventoryPlayer playerInv, ContainerInventory inv, ResourceLocation pathGUI) {
        super(playerInv, inv, pathGUI);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float prt, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(getTexture());

        // Centering GUI
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;

        // Drawing the first part of the GUI (slots of the backpack)
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.rows * 18 + 17);
        // And after the slots from the player's inventory
        this.drawTexturedModalRect(k, l + this.rows * 18 + 17, 0, 123, this.xSize, 96);
    }
}
