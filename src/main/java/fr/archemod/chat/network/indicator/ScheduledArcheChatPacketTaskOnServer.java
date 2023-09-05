package fr.archemod.chat.network.indicator;

import fr.archemod.chat.capabilities.indicator.ArcheChatStorage;
import fr.archemod.network.ArcheNetwork;
import net.minecraft.entity.player.EntityPlayerMP;

public class ScheduledArcheChatPacketTaskOnServer implements Runnable {
    private EntityPlayerMP player;
    private PacketArcheChat message;

    public ScheduledArcheChatPacketTaskOnServer(EntityPlayerMP player, PacketArcheChat message) {
        this.player = player;
        this.message = message;
    }

    @Override
    public void run() {
        //System.out.println("ENTITY ID SEND : "+player.getEntityId());
        ArcheNetwork.NETWORK.sendToAll(new PacketArcheChat(message.archeChat, player.getEntityId()));
        player.getCapability(ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY, null).setIndicator(message.archeChat.getIndicator());
    }

}
