package fr.archemod.network;

import fr.archemod.chat.network.indicator.PacketArcheChat;
import fr.archemod.network.client.MessageUpdateSign;
import fr.archemod.network.server.GuiOpensignPaket;
import fr.archemod.proxy.CommonProxy;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class ArcheNetwork {

    public final static SimpleNetworkWrapper NETWORK;

    static {
        NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel("am");
    }

    public static void init() {
        registerServerPackets();
        registerClientPackets();
    }

    private static void registerClientPackets() {


        ArcheNetwork.NETWORK.registerMessage(PacketArcheChat.ServerHandler.class, PacketArcheChat.class, 5, Side.SERVER);
        NETWORK.registerMessage(MessageUpdateSign.Handler.class, MessageUpdateSign.class, 2, Side.SERVER);
    }

    private static void registerServerPackets() {


        NETWORK.registerMessage(GuiOpensignPaket.Handler.class, GuiOpensignPaket.class, 1, Side.CLIENT);
        ArcheNetwork.NETWORK.registerMessage(PacketArcheChat.ClientHandler.class, PacketArcheChat.class, 6, Side.CLIENT);

    }
}

