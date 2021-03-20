package fr.archemod.util.handlers;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.*;
import fr.archemod.chat.capabilities.description.DescriptionCapability;
import fr.archemod.chat.capabilities.indicator.ArcheChatCapability;
import fr.archemod.gui.GuiHandler;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
//import fr.archemod.items.epuisette.ItemList;
import fr.archemod.network.ArcheNetwork;
import fr.archemod.util.IHasModel;
import fr.archemod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
 */
@Mod.EventBusSubscriber
public class RegistryHandler {

    public static final ResourceLocation CAPABILITY_ARCHE_CHAT_LOCATION = new ResourceLocation(Reference.MOD_ID,"archechat");
    public static final ResourceLocation CAPABILITY_DESCRIPTION_LOCATION = new ResourceLocation(Reference.MOD_ID,"description");

    @SubscribeEvent
    public static void attachCapabilityToPlayer(AttachCapabilitiesEvent<Entity> event){
        if(event.getObject() instanceof EntityPlayer){
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

        GameRegistry.registerTileEntity(TileEntityPlacardHRP.class, new ResourceLocation(Reference.MOD_ID,"TileEntityPlacardHRP"));
        GameRegistry.registerTileEntity(TileEntityTable.class, new ResourceLocation(Reference.MOD_ID,"TileEntityTable"));
        GameRegistry.registerTileEntity(TileEntityEcrinABijoux.class, new ResourceLocation(Reference.MOD_ID,"TileEntityEcrinABijoux"));
        GameRegistry.registerTileEntity(TileEntityLightBlock.class, new ResourceLocation(Reference.MOD_ID,"TileEntityLightBlock"));
        GameRegistry.registerTileEntity(TileEntityFishCase.class, new ResourceLocation(Reference.MOD_ID, "TileEntityFishCase"));
        GameRegistry.registerTileEntity(TileEntityBaril.class, new ResourceLocation(Reference.MOD_ID, "TileEntityBaril"));
        GameRegistry.registerTileEntity(TileEntityBlockBaril.class, new ResourceLocation(Reference.MOD_ID, "TileEntityBlockBaril"));

        ModBlocks.init();
        ModBlocks.register();


    }


    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item item : ModItems.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : ModBlocks.BLOCKS){
            if(block instanceof IHasModel){
                ((IHasModel)block).registerModels();
            }
        }
    }



}

