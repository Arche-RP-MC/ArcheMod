/*package fr.archemod.gui;


import fr.archemod.blocks.container.ContainerSechoirViande;
import fr.archemod.blocks.tileentity.TileEntityFourSechoir;
import fr.archemod.blocks.tileentity.TileEntityFourSechoir2;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiFourSechoir extends GuiContainer

{

    private static final ResourceLocation TEXTURES = new ResourceLocation("am", "textures/gui/container/custom_furnace.png");
    private final InventoryPlayer player;
    private final TileEntityFourSechoir2 tileentity;

    public GuiFourSechoir(InventoryPlayer player, TileEntityFourSechoir2 tileentity) {
        super(new ContainerSechoirViande(player, tileentity));
        this.tileentity = tileentity;
        this.player =player;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String tileName = this.tileentity.getDisplayName().getUnformattedText();
        this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2) + 3, 8, 4210752);
        this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 122, this.ySize - 96 + 2, 4210752);

    }



    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0f,1.0f,1.0f);
        this.mc.getTextureManager().bindTexture(TEXTURES);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop,0,0, this.xSize,this.ySize);

        if(TileEntityFourSechoir2.isBurning(tileentity))
        {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(this.guiLeft + 8, this.guiTop+54+12- k,176,12- k,14,k +1);
        }
    int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(this.guiLeft+44,this.guiTop+36,176,14,l+1,16);

    }

    private int getBurnLeftScaled(int pixels)
    {
        int i = this.tileentity.getField(1);
        if(i ==0) i=200;
        return this.tileentity.getField(0) * pixels / i ;
    }

    private int getCookProgressScaled (int pixels)
    {
        int i = this.tileentity.getField(2);
        int j = this.tileentity.getField(3);
        return j != 0 && i != 0 ? i*pixels / j :0;
    }


}
*/