package fr.archemod.items;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood implements IHasModel {

    public ItemFoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
        super(amount, saturation, isAnimalFood);
        setMaxStackSize(50);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        setAlwaysEdible();
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
