package fr.archemod.chat.network.indicator;

import fr.archemod.chat.capabilities.indicator.ArcheChat;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class PacketArcheChat implements IMessage {

    public ArcheChat archeChat;
    public int playerId;

    public PacketArcheChat() {
    }

    public PacketArcheChat(ArcheChat archeChat) {
        this.archeChat = archeChat;
        this.playerId = 0;
    }

    public PacketArcheChat(ArcheChat archeChat, int playerId) {
        this.archeChat = archeChat;
        this.playerId = playerId;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        int packetMessage = buf.readInt();
        archeChat = new ArcheChat();
        archeChat.setIndicator(packetMessage);
        playerId = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(archeChat.getIndicator());
        buf.writeInt(playerId);
    }

    public static class ServerHandler implements IMessageHandler<PacketArcheChat, IMessage> {
        @Override
        public IMessage onMessage(PacketArcheChat message, MessageContext ctx) {
            if (ctx.side != Side.SERVER)
                return null;
            final EntityPlayerMP sendingPlayer = ctx.getServerHandler().player;
            if (sendingPlayer == null)
                return null;
            //System.out.println(String.format("Received %s from %s (%s)", message.archeChat, sendingPlayer.getDisplayName(), sendingPlayer.getEntityId()));
            ctx.getServerHandler().player.server.addScheduledTask(new ScheduledArcheChatPacketTaskOnServer(sendingPlayer, message));
            return null;
        }
    }

    public static class ClientHandler implements IMessageHandler<PacketArcheChat, IMessage> {
        @Override
        public IMessage onMessage(PacketArcheChat message, MessageContext ctx) {
            if (ctx.side != Side.CLIENT)
                return null;
            //System.out.println(String.format("Received %s and %s from server", message.archeChat, message.playerId));
            Minecraft.getMinecraft().addScheduledTask(new ScheduledArcheChatPacketTaskOnClient(message));
            return null;
        }
    }


}
