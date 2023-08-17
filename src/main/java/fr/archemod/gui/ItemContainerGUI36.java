package fr.archemod.gui;

import fr.archemod.items.inventory.ContainerInventory;
import fr.archemod.items.inventory.ContainerSlot;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ItemContainerGUI36 extends GuiContainer {
    private ResourceLocation texture;
    protected ContainerInventory inv;
    protected InventoryPlayer playerInv;
    public int rows;

    public ItemContainerGUI36(InventoryPlayer playerInv, ContainerInventory inv, ResourceLocation pathGUI) {
        super(new ContainerSlot(playerInv, inv));
        this.texture = pathGUI;
        this.playerInv = playerInv;
        this.inv = inv;
        this.allowUserInput = false;
        // Calculate the number of rows
        this.rows = inv.getSizeInventory() / inv.getSlotInRow();
        // Height of the GUI using the number of rows
        this.ySize = 114 + this.rows * 18;
    }

    public ResourceLocation getTexture() { return texture; }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        //this.fontRenderer.drawString(I18n.format(this.inv.getName(), new Object[0]), 26, 6, 4210752);
        //this.fontRenderer.drawString(this.playerInv.hasCustomName() ? this.playerInv.getName() : I18n.format(this.playerInv.getName(), new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float prt, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);

        // Centering GUI
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;

        // Drawing the first part of the GUI (slots of the backpack)
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.rows * 18 + 17);
        // And after the slots from the player's inventory
        this.drawTexturedModalRect(k, l + this.rows * 18 + 17, 0, 123, this.xSize, 96);
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
}
