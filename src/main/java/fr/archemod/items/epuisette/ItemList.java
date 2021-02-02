package fr.archemod.items.epuisette;

import fr.archemod.init.ModItems;
import net.minecraft.item.Item;

public enum ItemList {
    POULPE(ModItems.PELUCHE_POULPE),
    CREVETTE(ModItems.CREVETTE_ROSE),
    HIPPOCAMPE(ModItems.HIPPOCAMPE),
    ECREVISSE(ModItems.ECREVISSE);

    Item item;


    ItemList(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}