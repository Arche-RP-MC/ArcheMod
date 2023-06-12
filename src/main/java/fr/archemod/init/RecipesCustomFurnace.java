package fr.archemod.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RecipesCustomFurnace {

    private static final HashMap<ItemStack[], ItemStack> recipes = new HashMap<ItemStack[], ItemStack>();

    static {
        addRecipe(ModItems.LAMBEAU_DE_VIANDE_CRUE, ModItems.PLANTES_SECHEES, ModItems.LAMBEAU_DE_VIANDE_SECHEE);
    }


    private static void addRecipe(Item ingredient1, Item ingredient2, Item resultat1) {
        addRecipe(new ItemStack(ingredient1), new ItemStack(ingredient2), new ItemStack(resultat1));
    }

    private static void addRecipe(ItemStack ingredient1, ItemStack ingredient2, ItemStack resultat1) {
        recipes.put(new ItemStack[]{ingredient1, ingredient2}, resultat1);
    }

    private static boolean areKeysEqual(ItemStack[] key1, ItemStack[] key2) {
        if (key1.length != key2.length) return false;

        for (int i = 0; i < key1.length; i++) {
            ItemStack s1 = key1[i];
            ItemStack s2 = key2[i];
            if (s1.isEmpty() && !s2.isEmpty()) return false;
            if (!s1.isEmpty() && s2.isEmpty()) return false;
            if (s1.getItem() != s2.getItem()) return false;
            if (s1.getItemDamage() != s2.getItemDamage()) return false;
        }
        return true;
    }

    public static ItemStack getRecipeResult(ItemStack[] ingredients) {
        Iterator<Map.Entry<ItemStack[], ItemStack>> it = recipes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<ItemStack[], ItemStack> entry = it.next();
            if (areKeysEqual(entry.getKey(), ingredients)) {
                return entry.getValue();
            }
        }
        return null;
    }
}
