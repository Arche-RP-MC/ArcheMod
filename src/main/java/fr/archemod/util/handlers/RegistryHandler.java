package fr.archemod.util.handlers;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityBlockInventory;
import fr.archemod.blocks.tileentity.TileEntityBlockInventoryVisible;
import fr.archemod.blocks.tileentity.TileEntityFut;
import fr.archemod.blocks.tileentity.*;
import fr.archemod.chat.capabilities.description.DescriptionCapability;
import fr.archemod.chat.capabilities.indicator.ArcheChatCapability;
import fr.archemod.gui.GuiHandler;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import fr.archemod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
 */
@Mod.EventBusSubscriber
public class RegistryHandler {

    public static final ResourceLocation CAPABILITY_ARCHE_CHAT_LOCATION = new ResourceLocation(Reference.MOD_ID, "archechat");
    public static final ResourceLocation CAPABILITY_DESCRIPTION_LOCATION = new ResourceLocation(Reference.MOD_ID, "description");

    @SubscribeEvent
    public static void attachCapabilityToPlayer(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer) {
            event.addCapability(CAPABILITY_ARCHE_CHAT_LOCATION, new ArcheChatCapability());
            event.addCapability(CAPABILITY_DESCRIPTION_LOCATION, new DescriptionCapability());
        }
    }

    /**
     * Listen for the register event for creating custom items
     */
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    /**
     * Listen for the register event for creating custom blocks
     */


    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
        NetworkRegistry.INSTANCE.registerGuiHandler(ArcheMod.INSTANCE, new GuiHandler());

        GameRegistry.registerTileEntity(TileEntityBlockPorteManteau.class, new ResourceLocation(Reference.MOD_ID, "porte_manteau"));
        GameRegistry.registerTileEntity(TileEntityBlockPlacardHRP.class, new ResourceLocation(Reference.MOD_ID, "placard_hrp"));
        GameRegistry.registerTileEntity(TileEntityBlockPiegeLoup.class, new ResourceLocation(Reference.MOD_ID, "piege_loup"));
        GameRegistry.registerTileEntity(TileEntityBlockEcrinBijou.class, new ResourceLocation(Reference.MOD_ID, "ecrin_bijou"));

        GameRegistry.registerTileEntity(TileEntityFut.class, new ResourceLocation(Reference.MOD_ID, "Fut"));

        GameRegistry.registerTileEntity(TileEntityTable.class, new ResourceLocation(Reference.MOD_ID, "TileEntityTable"));
        GameRegistry.registerTileEntity(TileEntityLightBlock.class, new ResourceLocation(Reference.MOD_ID, "TileEntityLightBlock"));
        //GameRegistry.registerTileEntity(TileEntityLightBlock2.class, new ResourceLocation(Reference.MOD_ID,"TileEntityLightBlock2"));
        GameRegistry.registerTileEntity(TileEntityFishCase.class, new ResourceLocation(Reference.MOD_ID, "TileEntityFishCase"));
        //GameRegistry.registerTileEntity(TileEntityFourSechoir2.class, new ResourceLocation(Reference.MOD_ID, "TileEntityFourSechoir2"));

        ModBlocks.init();
        ModBlocks.register();
    }


    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ModItems.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }

        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }
        }
    }


}

