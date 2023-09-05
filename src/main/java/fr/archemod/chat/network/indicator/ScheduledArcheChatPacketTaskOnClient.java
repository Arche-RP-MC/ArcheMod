package fr.archemod.chat.network.indicator;

import fr.archemod.chat.capabilities.indicator.ArcheChatStorage;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class ScheduledArcheChatPacketTaskOnClient implements Runnable {

    private PacketArcheChat message;

    public ScheduledArcheChatPacketTaskOnClient(PacketArcheChat message) {
        this.message = message;
    }

    @Override
    public void run() {
        //System.out.println("ENTITY ID RECEIVED : "+message.playerId);
        EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().world.getEntityByID(message.playerId);
        if (player == null)
            return;
        player.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY, null).setIndicator(message.archeChat.getIndicator());
    }

}
