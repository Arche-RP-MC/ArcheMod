package fr.archemod.items.tools;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

    public ToolAxe(String name, ToolMaterial material){
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);
        attackDamage = 6.0F;
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(this,0,"inventory");
    }
}
