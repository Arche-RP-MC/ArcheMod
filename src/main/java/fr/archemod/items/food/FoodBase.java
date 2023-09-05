package fr.archemod.items.food;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.util.IHasModel;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
        super(amount, saturation, isAnimalFood);
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
