package fr.archemod.gui;

import fr.archemod.blocks.container.ContainerFourSechoir;
import fr.archemod.blocks.tileentity.TileEntityFourSechoir;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiFourSechoir extends GuiContainer
{

    private static final ResourceLocation background = new ResourceLocation("am","textures/gui/container/custom_furnace.png");
    private TileEntityFourSechoir tile;

    public GuiFourSechoir(TileEntityFourSechoir tile, InventoryPlayer playerInv) {
        super(new ContainerFourSechoir(tile, playerInv));
        this.tile = tile;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawDefaultBackground();
        this.mc.getTextureManager().bindTexture(background);
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);

        int timePassed = this.tile.getField(1);
        int textureWidth = (int) (23f / 200f * timePassed);
        this.drawTexturedModalRect(i + 81, j + 24, 177, 18, textureWidth, 7);

        if (this.tile.isBurning()) {
            int burningTime = this.tile.getField(0);
            int textureHeight = (int) (12f / this.tile.getFullBurnTime() * burningTime);
            this.drawTexturedModalRect(i + 37, j + 26 + 12 - textureHeight,
                    177, 12 - textureHeight, 27, textureHeight);
        }

        this.fontRenderer.drawString(this.tile.getName(), i + 80, j + 45, 0xFFFFFF);
    }

    public class GuiHandler implements IGuiHandler {

        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
            if(te instanceof TileEntityFourSechoir) {
                return new ContainerFourSechoir((TileEntityFourSechoir) te, player.inventory);
            }
            return null;
        }

        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
            if(te instanceof TileEntityFourSechoir) {
                return new GuiFourSechoir((TileEntityFourSechoir)te, player.inventory);
            }
            return null;
        }
    }


}
