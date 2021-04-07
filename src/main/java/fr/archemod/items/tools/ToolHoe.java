package fr.archemod.items.tools;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;

public class ToolHoe extends ItemHoe implements IHasModel {

    public ToolHoe(String name, ToolMaterial material){
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(this,0,"inventory");
    }
}
