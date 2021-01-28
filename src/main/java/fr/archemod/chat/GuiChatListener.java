package fr.archemod.chat;

import fr.archemod.gui.GuiChatArche;
import net.minecraft.client.gui.GuiChat;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiChatListener {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    @SideOnly(Side.CLIENT)
    public static void onGuiTchatIsOpen(GuiOpenEvent event) {
        if (event.getGui() instanceof GuiChat) {
            event.setGui(new GuiChatArche());
        }

    }

}
