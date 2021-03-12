package fr.archemod.gui;

import fr.archemod.blocks.container.ContainerBaril;
import fr.archemod.blocks.tileentity.TileEntityBaril;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;

public class GuiBaril extends GuiContainer
{
    private static final ResourceLocation background = new ResourceLocation("am","textures/gui/container/baril.png");
    private TileEntityBaril tile;

    public GuiBaril(TileEntityBaril tile, InventoryPlayer playerInv, EntityPlayer player)
    {
        super(new ContainerBaril( playerInv, tile));
        this.tile = tile;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        int centerWidth = (this.width - this.xSize)/2;
        int centerHeight = (this.height - this.ySize)/2;
        this.drawDefaultBackground();
        this.mc.getTextureManager().bindTexture(background);
        this.drawTexturedModalRect(centerWidth, centerHeight, 0, 0, this.xSize, this.ySize);

        int timePassed = this.tile.getField(1);
        int textureWidth = (int) (24f / 200f * timePassed);

        this.drawTexturedModalRect(centerWidth + 67, centerHeight + 35, 176, 15, textureWidth, 17);
        int fuelWidth = (int)(this.tile.getField(2) / 14);
        this.drawTexturedModalRect(centerWidth + 49, centerHeight + 65, 176, 33, fuelWidth, 14);

        this.fontRenderer.drawString(this.tile.getDisplayName().getUnformattedText(), centerWidth + 20, centerHeight + 5, 0x000);
        //this.fontRenderer.drawString(this.tile.getPercent() + "%", centerWidth + 66, centerHeight + 64, 0x000);
    }

    /*  x, y -> Sur le screen ; minU, minV maxU, maxV -> Sur .png*/
    @Override
    public void drawTexturedModalRect(float x, float y, int minU, int minV, int maxU, int maxV)
    {

    }
}