package fr.archemod.gui;

import fr.archemod.blocks.tileentity.TileEntityFut;
import fr.archemod.blocks.container.ContainerFutSlot;
import fr.archemod.init.ModItems;
import fr.archemod.util.Reference;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        if(!inv.getContenu().equals("empty")) this.drawTexturedModalRect(k + 64, l + 3 + (15 - inv.getCharge())*3, getXSize(inv.getContenu()), getYSize(inv.getContenu()) - inv.getCharge()*3, 48, 256 - (256 - inv.getCharge()*3));
    }

    private int getYSize(String contenu) {
        switch(contenu) {
            case "am:seau_de_rhum":
            case "am:seau_de_rhum_en_bois":
            case "am:seau_jagermeister":
            case "am:seau_jagermeister_en_bois":
            case "am:seau_jus_de_fruit_vert":
            case "am:seau_jus_de_fruit_vert_en_bois":
            case "am:seau_de_vin_rouge":
            case "am:seau_de_vin_rouge_en_bois":
            case "am:seau_jus_de_fruit_rouge":
            case "am:seau_jus_de_fruit_rouge_en_bois":
            case "am:seau_de_biere_brune":
            case "am:seau_de_biere_brune_en_bois":
            case "am:seau_rye":
            case "am:seau_rye_en_bois":
            case "am:seau_de_bierre_blonde":
            case "am:seau_de_bierre_blonde_en_bois":
            case "am:seau_de_hydromel":
            case "am:seau_de_hydromel_en_bois":
            case "am:seau_de_vin_blanc":
            case "am:seau_de_vin_blanc_en_bois":
            case "am:seau_jus_de_fruit_jaune":
            case "am:seau_jus_de_fruit_jaune_en_bois":
                return 211;
            case "am:seau_hypocras":
            case "am:seau_hypocras_en_bois":
            case "minecraft:water_bucket":
            case "am:seau_d_eau_en_bois":
            case "am:seau_de_biere_rousse":
            case "am:seau_de_biere_rousse_en_bois":
            case "am:seau_jus_de_fruit_orange":
            case "am:seau_jus_de_fruit_orange_en_bois":
            case "minecraft:milk_bucket":
            case "am:seau_de_lait_en_bois":
            case "am:seau_alcool_pur":
            case "am:seau_alcool_pur_en_bois":
            case "am:seau_viperine":
            case "am:seau_viperine_en_bois":
            case "am:seau_nigorizake":
            case "am:seau_nigorizake_en_bois":
            case "am:seau_liqueur_fruit":
            case "am:seau_liqueur_fruit_en_bois":
            case "am:seau_jus_de_fruit_blanc":
            case "am:seau_jus_de_fruit_blanc_en_bois":
                return 256;
        }
        return 0;
    }

    private int getXSize(String contenu) {
        switch(contenu) {
            case "minecraft:water_bucket":
            case "am:seau_d_eau_en_bois":
            case "am:seau_de_rhum":
            case "am:seau_de_rhum_en_bois":
            case "am:seau_jagermeister":
            case "am:seau_jagermeister_en_bois":
            case "am:seau_jus_de_fruit_vert":
            case "am:seau_jus_de_fruit_vert_en_bois":
                return 0;
            case "am:seau_hypocras":
            case "am:seau_hypocras_en_bois":
            case "am:seau_de_vin_rouge":
            case "am:seau_de_vin_rouge_en_bois":
            case "am:seau_jus_de_fruit_rouge":
            case "am:seau_jus_de_fruit_rouge_en_bois":
                return 48;
            case "am:seau_de_biere_brune":
            case "am:seau_de_biere_brune_en_bois":
            case "am:seau_de_biere_rousse":
            case "am:seau_de_biere_rousse_en_bois":
            case "am:seau_rye":
            case "am:seau_rye_en_bois":
            case "am:seau_jus_de_fruit_orange":
            case "am:seau_jus_de_fruit_orange_en_bois":
                return 96;
            case "minecraft:milk_bucket":
            case "am:seau_de_lait_en_bois":
            case "am:seau_alcool_pur":
            case "am:seau_alcool_pur_en_bois":
            case "am:seau_de_bierre_blonde":
            case "am:seau_de_bierre_blonde_en_bois":
            case "am:seau_de_hydromel":
            case "am:seau_de_hydromel_en_bois":
            case "am:seau_de_vin_blanc":
            case "am:seau_de_vin_blanc_en_bois":
            case "am:seau_viperine":
            case "am:seau_viperine_en_bois":
            case "am:seau_nigorizake":
            case "am:seau_nigorizake_en_bois":
            case "am:seau_liqueur_fruit":
            case "am:seau_liqueur_fruit_en_bois":
            case "am:seau_jus_de_fruit_blanc":
            case "am:seau_jus_de_fruit_blanc_en_bois":
            case "am:seau_jus_de_fruit_jaune":
            case "am:seau_jus_de_fruit_jaune_en_bois":
                return 144;
        }
        return 0;
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void renderHoveredToolTip(int p_191948_1_, int p_191948_2_) {
        super.renderHoveredToolTip(p_191948_1_, p_191948_2_);

        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        List<String> message = Arrays.asList("\u00A74Contenu :", "\u00A76" + getName(inv.getContenu()), "\u00A74Quantit\u00E9 :", "\u00A76" + inv.getCharge() + " unit\u00E9s");

        if(p_191948_1_ > k+64 && p_191948_1_ < k+64+48 && p_191948_2_ > l+3 && p_191948_2_ < l+3+45)
            this.drawHoveringText(message, p_191948_1_, p_191948_2_, fontRenderer);
    }

    private String getName(String contenu) {
        switch (contenu) {
            case "minecraft:water_bucket":
            case "am:seau_d_eau_en_bois":
                return "Eau";
            case "am:seau_de_rhum":
            case "am:seau_de_rhum_en_bois":
                return "Rhum";
            case "am:seau_jagermeister":
            case "am:seau_jagermeister_en_bois":
                return "Jagermeister";
            case "am:seau_jus_de_fruit_vert":
            case "am:seau_jus_de_fruit_vert_en_bois":
                return "Jus de fruit vert";
            case "am:seau_hypocras":
            case "am:seau_hypocras_en_bois":
                return "Hypocras";
            case "am:seau_de_vin_rouge":
            case "am:seau_de_vin_rouge_en_bois":
                return "Vin rouge";
            case "am:seau_jus_de_fruit_rouge":
            case "am:seau_jus_de_fruit_rouge_en_bois":
                return "Jus de fruit rouge";
            case "am:seau_de_biere_brune":
            case "am:seau_de_biere_brune_en_bois":
                return "Bi\u00E9re brune";
            case "am:seau_de_biere_rousse":
            case "am:seau_de_biere_rousse_en_bois":
                return "Bi\u00E9re rousse";
            case "am:seau_rye":
            case "am:seau_rye_en_bois":
                return "Rye";
            case "am:seau_jus_de_fruit_orange":
            case "am:seau_jus_de_fruit_orange_en_bois":
                return "Jus de fruit orange";
            case "minecraft:milk_bucket":
            case "am:seau_de_lait_en_bois":
                return "Lait";
            case "am:seau_alcool_pur":
            case "am:seau_alcool_pur_en_bois":
                return "Alcool pur";
            case "am:seau_de_bierre_blonde":
            case "am:seau_de_bierre_blonde_en_bois":
                return "Bi\u00E9re blonde";
            case "am:seau_de_hydromel":
            case "am:seau_de_hydromel_en_bois":
                return "Hydromel";
            case "am:seau_de_vin_blanc":
            case "am:seau_de_vin_blanc_en_bois":
                return "Vin blanc";
            case "am:seau_viperine":
            case "am:seau_viperine_en_bois":
                return "Viperine";
            case "am:seau_nigorizake":
            case "am:seau_nigorizake_en_bois":
                return "Nigorizake";
            case "am:seau_liqueur_fruit":
            case "am:seau_liqueur_fruit_en_bois":
                return "Liqueur de fruit";
            case "am:seau_jus_de_fruit_blanc":
            case "am:seau_jus_de_fruit_blanc_en_bois":
                return "Jus de fruit blanc";
            case "am:seau_jus_de_fruit_jaune":
            case "am:seau_jus_de_fruit_jaune_en_bois":
                return "Jus de fruit jaune";
        }
        return "Liquide inconnu";
    }
}
