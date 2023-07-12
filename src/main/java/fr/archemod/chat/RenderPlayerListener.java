package fr.archemod.chat;

import fr.archemod.chat.capabilities.indicator.ArcheChatStorage;
import fr.archemod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class RenderPlayerListener {

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onPlayerRender(RenderPlayerEvent.Pre event) {

        if (event.getEntityPlayer().hasCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY, null)) {
            int indicator = event.getEntityPlayer().getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY, null).getIndicator();
            if (indicator != 0) {
                EntityPlayer player = event.getEntityPlayer();
                boolean isThirdPersonFrontal = ((event.getRenderer().getRenderManager()).options.thirdPersonView == 2);
                FontRenderer fontRendererIn = event.getRenderer().getFontRendererFromRenderManager();

                GlStateManager.pushMatrix();
                GlStateManager.translate(event.getX(), event.getY() + (double) event.getEntity().height + 0.5D, event.getZ());
                GlStateManager.glNormal3f(0.0F, 1.0F, 0.0F);
                GlStateManager.rotate(-event.getRenderer().getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
                GlStateManager.rotate((float) (isThirdPersonFrontal ? -1 : 1) * (event.getRenderer().getRenderManager().playerViewX), 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(-0.025F, -0.025F, 0.025F);
                GlStateManager.disableLighting();
                GlStateManager.disableTexture2D();
                Tessellator tessellator = Tessellator.getInstance();
                BufferBuilder vertexBuffer = tessellator.getBuffer();
                switch (indicator) {
                    case 1:
                        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/icones/icone_speaking.png"));
                        break;
                    case 2:
                        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/icones/icone_emote.png"));
                        break;
                    case 3:
                        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/icones/icone_hrp.png"));
                        break;
                }
                vertexBuffer.begin(7, DefaultVertexFormats.POSITION_TEX_NORMAL);
                vertexBuffer.pos(-12.0D, -12.0D, 0.0D).tex(0.0D, 0.0D).color(255, 255, 255, 100).endVertex();
                vertexBuffer.pos(-12.0D, 12.0D, 0.0D).tex(0.0D, 1.0D).color(255, 255, 255, 100).endVertex();
                vertexBuffer.pos(12.0D, 12.0D, 0.0D).tex(1.0D, 1.0D).color(255, 255, 255, 100).endVertex();
                vertexBuffer.pos(12.0D, -12.0D, 0.0D).tex(1.0D, 0.0D).color(255, 255, 255, 100).endVertex();
                GlStateManager.enableTexture2D();
                tessellator.draw();
                if (!player.isSneaking()) {
                    GlStateManager.enableDepth();
                }
                GlStateManager.enableLighting();
                GlStateManager.disableBlend();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                GlStateManager.popMatrix();
            }
        }
    }

    /*
    @SubscribeEvent
    public static void onTest(BlockEvent.PlaceEvent event){
        System.out.println("Place Event stp passe");
        if(!event.getWorld().isRemote && event.getEntity() instanceof EntityPlayer){
            EntityPlayer entityPlayer = (EntityPlayer)event.getEntity();
            if(entityPlayer.hasCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null)){
                System.out.println("Has Capab");
                if(event.getPlacedBlock().getBlock() == Blocks.COAL_ORE){
                    entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).setDescription("SPEAKING");
                    entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).sync(entityPlayer);
                    System.out.println("SPEAKING CAPA ON");
                }
                if(event.getPlacedBlock().getBlock() == Blocks.IRON_ORE){
                    entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).setDescription("EMOTE");
                    entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).sync(entityPlayer);
                    System.out.println("EMOTE CAPA ON");
                }
                if(event.getPlacedBlock().getBlock() == Blocks.DIAMOND_ORE){
                    entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).setDescription("HRP");
                    entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).sync(entityPlayer);
                    System.out.println("HRP CAPA ON");
                }
                if(event.getPlacedBlock().getBlock() == Blocks.DIAMOND_BLOCK){
                    //TODO : Open Fiche de moi même
                    entityPlayer.openGui(ArcheMod.INSTANCE, 4, entityPlayer.world, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onTest(BlockEvent.BreakEvent event){
        System.out.println("Break Event");
        if(!event.getWorld().isRemote && event.getPlayer().hasCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null)){
            EntityPlayer entityPlayer = event.getPlayer();
            if(event.getState().getBlock() == Blocks.COAL_ORE){
                entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).setDescription("");
                entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).sync(entityPlayer);
                System.out.println("SPEAKING CAPA OFF");
            }
            if(event.getState().getBlock() == Blocks.IRON_ORE){
                entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).setDescription("");
                entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).sync(entityPlayer);
                System.out.println("EMOTE CAPA OFF");
            }
            if(event.getState().getBlock() == Blocks.DIAMOND_ORE){
                entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).setDescription("");
                entityPlayer.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY,null).sync(entityPlayer);
                System.out.println("HRP CAPA OFF");
            }
        }
    }
    
     */


}
