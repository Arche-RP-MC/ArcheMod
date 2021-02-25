package fr.archemod.network;

import fr.archemod.network.client.MessageUpdateSign;
import fr.archemod.network.server.GuiOpensignPaket;
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



        NETWORK.registerMessage(MessageUpdateSign.Handler.class, MessageUpdateSign.class, 2, Side.SERVER);
    }

    private static void registerServerPackets() {





        NETWORK.registerMessage(GuiOpensignPaket.Handler.class, GuiOpensignPaket.class, 1, Side.CLIENT);

    }
}

