package fr.archemod.items.agriculture;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ItemGraine extends ItemSeeds {
    public ItemGraine(String name, Block crops, Block soil) {
        super(crops, soil);
        setTranslationKey(name);
        setRegistryName(name);
        //A REGISTER DANS MODBLOCK CAR DOIT ETRE REGISTER APRES LE CROP
    }
}
