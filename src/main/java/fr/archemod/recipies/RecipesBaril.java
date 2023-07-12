package fr.archemod.recipies;

import fr.archemod.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RecipesBaril {

    /* Map <Ingrédients - Résultats > */
    private static final HashMap<ItemStack[], ItemStack> recipes = new HashMap<ItemStack[], ItemStack>();
    private static final RecipesBaril inst = new RecipesBaril();


    public static RecipesBaril instance() {
        return inst;
    }

    private RecipesBaril() {
        addRecipes(Items.IRON_INGOT, 3, Items.IRON_NUGGET, 12, ModItems.LEVURE, 8);
    }

    private void addRecipes(Item ingredient, int ingredientCount, Item result, int resultCount, Item fuel, int fuelCount) {
        addRecipes(new ItemStack(ingredient, ingredientCount), new ItemStack(result, resultCount), new ItemStack(fuel, fuelCount));
    }

    private void addRecipes(ItemStack ingredient, ItemStack resultat, ItemStack fuel) {
        recipes.put(new ItemStack[]{ingredient, resultat}, fuel);
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