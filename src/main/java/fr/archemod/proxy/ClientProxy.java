package fr.archemod.proxy;

import fr.archemod.blocks.container.Container9GroundRenderer;
import fr.archemod.blocks.tileentity.TileEntityBlockInventoryVisible;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    @Override
    public void init() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockInventoryVisible.class, new Container9GroundRenderer());
    }
}
