package fr.archemod;


import fr.archemod.blocks.tileentity.TileEntityBarril;
import fr.archemod.blocks.tileentity.TileEntityFourSechoir;
//import fr.archemod.blocks.tileentity.TileEntityFourSechoir2;
import fr.archemod.chat.GuiChatListener;
import fr.archemod.chat.capabilities.description.Description;
import fr.archemod.chat.capabilities.description.DescriptionStorage;
import fr.archemod.chat.capabilities.description.IDescription;
import fr.archemod.chat.capabilities.indicator.ArcheChat;
import fr.archemod.chat.capabilities.indicator.ArcheChatStorage;
import fr.archemod.chat.capabilities.indicator.IArcheChat;
import fr.archemod.chat.network.indicator.PacketArcheChat;
import fr.archemod.cmd.HRPCommand;
import fr.archemod.init.ModRecipes;
import fr.archemod.init.SechoirViandeRecipe;
import fr.archemod.network.ArcheNetwork;
import fr.archemod.proxy.CommonProxy;
import fr.archemod.util.ArcheCreativeTabs;
import fr.archemod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Mod(
        modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION
)
public class ArcheMod {


    /** This is used to keep track of GUIs that we make*/
    public static int modGuiIndex = 0;

    /** Set our custom inventory Gui index to the next available Gui index */
    public static final int GUI_ITEM_INV = modGuiIndex++;
    public static CreativeTabs archeCreativeTabs = new ArcheCreativeTabs("arche_creative_tabs");
    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(Reference.MOD_ID)
    public static ArcheMod INSTANCE;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static Logger logger ;


    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ArcheNetwork.init();

        logger = event.getModLog();

        MinecraftForge.EVENT_BUS.register(GuiChatListener.class);

        CapabilityManager.INSTANCE.register(IArcheChat.class, new ArcheChatStorage(), ArcheChat::new);
        CapabilityManager.INSTANCE.register(IDescription.class, new DescriptionStorage(), Description::new);


        ArcheNetwork.NETWORK.registerMessage(PacketArcheChat.ServerHandler.class, PacketArcheChat.class, 5, Side.SERVER);
        ArcheNetwork.NETWORK.registerMessage(PacketArcheChat.ClientHandler.class, PacketArcheChat.class, 6, Side.CLIENT);
        //networkDescription.registerMessage(PacketDescription.ServerHandler.class, PacketDescription.class, 4, Side.SERVER);
        //networkDescription.registerMessage(PacketDescription.ClientHandler.class, PacketDescription.class, 5, Side.CLIENT);
        //GameRegistry.registerTileEntity(TileEntityFourSechoir2.class,"am:TileEntityFourSechoir2");
        GameRegistry.registerTileEntity(TileEntityBarril.class,"am:TileEntityBarril");

    }
    @Mod.EventHandler
    public void init(FMLServerStartingEvent event)
    {
        logger.info("initalise FMLServerStartingEvent :" + Reference.MOD_NAME);
        event.registerServerCommand(new HRPCommand());




    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ArcheNetwork.init();
        ModRecipes.instance.initRecipes();

    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
    public static Logger getLogger() {
        return logger;
    }

    public void registerItemRenderer(Item item, int meta, String id) {}
}