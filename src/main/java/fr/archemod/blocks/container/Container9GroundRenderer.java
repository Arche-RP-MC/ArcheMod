package fr.archemod.blocks.container;

import fr.archemod.blocks.tileentity.TileEntityBlockInventory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;

public class Container9GroundRenderer extends TileEntitySpecialRenderer<TileEntityBlockInventory> {
    @Override
    public void render(TileEntityBlockInventory te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {

        if(te.isEmpty()) return;

        int rotation = te.getBlockMetadata();

        GlStateManager.pushMatrix();

        GlStateManager.translate(x,y,z);
        GlStateManager.translate(0.5, 0.5, 0.5);
        GlStateManager.rotate(rotation * -90F + 180F, 0, 1, 0);
        GlStateManager.translate(-0.5, -0.5, -0.5);
        GlStateManager.rotate(-90F, 1, 0, 0);
        GlStateManager.rotate(-180F, 0, 0, 1);
        GlStateManager.translate(-0.5, 0.4, 0);

        GlStateManager.translate(-0.25, 0.3, 0.01);
        GlStateManager.scale(0.6, 0.6, 0.6);

        int ambLight = getWorld().getCombinedLight(te.getPos().up(), 0);
        int lu = ambLight % 65536;
        int lv = ambLight / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)lu / 1.0F, (float)lv / 1.0F);

        //Slot 1
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(0).copy()), ItemCameraTransforms.TransformType.GROUND);

        //Slot 2
        GlStateManager.translate(0.425, 0, 0);
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(1).copy()), ItemCameraTransforms.TransformType.GROUND);

        //Slot 3
        GlStateManager.translate(0.425, 0, 0);
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(2).copy()), ItemCameraTransforms.TransformType.GROUND);

        //Slot 4
        GlStateManager.translate(-0.85, -0.525, 0);
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(3).copy()), ItemCameraTransforms.TransformType.GROUND);

        //Slot 5
        GlStateManager.translate(0.425, 0, 0);
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(4).copy()), ItemCameraTransforms.TransformType.GROUND);

        //Slot 6
        GlStateManager.translate(0.425, 0, 0);
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(5).copy()), ItemCameraTransforms.TransformType.GROUND);

        //Slot 7
        GlStateManager.translate(-0.85, -0.525, 0);
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(6).copy()), ItemCameraTransforms.TransformType.GROUND);

        //Slot 8
        GlStateManager.translate(0.425, 0, 0);
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(7).copy()), ItemCameraTransforms.TransformType.GROUND);

        //Slot 9
        GlStateManager.translate(0.425, 0, 0);
        Minecraft.getMinecraft().getRenderItem().renderItem(setTo1(te.getStackInSlot(8).copy()), ItemCameraTransforms.TransformType.GROUND);

        GlStateManager.popMatrix();

    }

    private static ItemStack setTo1(ItemStack stack) {
        stack.setCount(1);
        return stack;
    }
}
