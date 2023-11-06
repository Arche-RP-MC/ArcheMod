package fr.archemod.gui;

import fr.archemod.blocks.container.ContainerNasse;
import fr.archemod.blocks.tileentity.TileEntityNasse;
import fr.archemod.util.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class NasseGUI extends GuiContainer {

    public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID,"textures/gui/container/recolte.png");
    protected TileEntityNasse inv;
    protected InventoryPlayer playerInv;
    public int rows;

    public NasseGUI(InventoryPlayer playerInv, TileEntityNasse inv) {
        super(new ContainerNasse(playerInv, inv));
        this.playerInv = playerInv;
        this.inv = inv;
        this.allowUserInput = false;
        // Calculate the number of rows
        this.rows = 1;
        // Height of the GUI using the number of rows
        this.ySize = 114 + this.rows * 18;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float prt, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);

        // Centering GUI
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;

        this.drawTexturedModalRect(k, l, 0, 101, this.xSize, 116);
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
}
