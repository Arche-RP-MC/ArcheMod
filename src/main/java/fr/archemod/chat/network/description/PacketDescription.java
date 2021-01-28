package fr.archemod.chat.network.description;

import fr.archemod.chat.capabilities.description.Description;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PacketDescription implements IMessage {

    public Description description;

    public PacketDescription() {
    }

    public PacketDescription(Description description){
        this.description = description;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        String packetMessage = ByteBufUtils.readUTF8String(buf);
        description = new Description();
        description.setDescription(packetMessage);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeUTF8String(buf,description.getDescription());
    }

    public static class ServerHandler implements IMessageHandler<PacketDescription,IMessage>{

        @Override
        public IMessage onMessage(PacketDescription message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", message.description, ctx.getServerHandler().player.getDisplayName()));
            Minecraft.getMinecraft().addScheduledTask(new ScheduledDescriptionPacketTask(ctx.getServerHandler().player,message));
            return null;
        }
    }

    @SideOnly(Side.CLIENT)
    public static class ClientHandler implements IMessageHandler <PacketDescription, IMessage>{

        @Override
        public IMessage onMessage(PacketDescription message, MessageContext ctx) {
            System.out.println(String.format("Received %s from server", message.description));
            Minecraft.getMinecraft().addScheduledTask(new ScheduledDescriptionPacketTask(null,message));
            return null;
        }
    }


}
