package fr.archemod.gui;

import fr.archemod.blocks.tileentity.TileEntityFut;
import fr.archemod.blocks.container.ContainerFutSlot;
import fr.archemod.util.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class FutGUI extends GuiContainer {
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/fut.png");
    protected TileEntityFut inv;
    protected InventoryPlayer playerInv;

    public FutGUI(InventoryPlayer playerInv, TileEntityFut inv) {
        super(new ContainerFutSlot(playerInv, inv));
        this.playerInv = playerInv;
        this.inv = inv;
        this.allowUserInput = false;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);

        // Centering GUI
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;

        this.drawTexturedModalRect(k, l, 0, 23, this.xSize, 138);
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
}
