package fr.archemod.gui;

import fr.archemod.blocks.container.ContainerCasierPoisson;
import fr.archemod.blocks.tileentity.TileEntityCasierPoisson;
import fr.archemod.util.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class CasierPoissonGUI extends GuiContainer {

    public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID,"textures/gui/container/casier_poisson.png");
    protected TileEntityCasierPoisson inv;
    protected InventoryPlayer playerInv;
    public int rows;

    public CasierPoissonGUI(InventoryPlayer playerInv, TileEntityCasierPoisson inv) {
        super(new ContainerCasierPoisson(playerInv, inv));
        this.playerInv = playerInv;
        this.inv = inv;
        this.allowUserInput = false;
        // Calculate the number of rows
        this.rows = inv.getSizeInventory() / 9;
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

        // Drawing the first part of the GUI (slots of the backpack)
        this.drawTexturedModalRect(k, l+11, 0, 101, this.xSize, this.rows * 18 + 17);
        // And after the slots from the player's inventory
        this.drawTexturedModalRect(k, l + this.rows * 18 + 17, 0, 126, this.xSize, 96);
    }
}
