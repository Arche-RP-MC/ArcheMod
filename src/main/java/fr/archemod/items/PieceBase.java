package fr.archemod.items;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.item.Item;

public class PieceBase extends Item implements IHasModel {

    public PieceBase(String name){
        setTranslationKey(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(this,0,"inventory");
    }

}
