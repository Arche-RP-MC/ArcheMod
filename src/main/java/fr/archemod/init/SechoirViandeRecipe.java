package fr.archemod.init;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import net.minecraft.item.ItemStack;

import java.util.Map;

public class SechoirViandeRecipe
{

    private static final SechoirViandeRecipe INSTANCE = new SechoirViandeRecipe();
    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static SechoirViandeRecipe getInstance()
    {
        return  INSTANCE;
    }

    private SechoirViandeRecipe()
    {
        //ajout des recette ici sous forme  addSechoirViandeRecipe(new ItemStack(ITEM 1), new ItemStack(COMBUSTIBLE), new ItemStack(RESULTAT), EXPERIENCE GAGNE 0.0F);
        addSechoirViandeRecipe(new ItemStack(ModItems.VIANDE_CRUE), new ItemStack(ModItems.SEL), new ItemStack(ModItems.LAMBEAU_DE_VIANDE_SECHEE), 0.0F);


    }

    public void addSechoirViandeRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience)
    {
        if(getSechoirResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.put(input1, input2, result);
        this.experienceList.put(result,Float.valueOf(experience));
    }

    public ItemStack getSechoirResult(ItemStack input1, ItemStack input2)
    {
        for(Map.Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet())
        {
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
            {
                for(Map.Entry<ItemStack,ItemStack> ent : entry.getValue().entrySet())
                {
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                    {
                        return (ItemStack) ent.getValue();
                    }

                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
    {
        return this.smeltingList;
    }

public float getSechoirExperience(ItemStack stack)
{
    for (Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet())
    {
        if(this.compareItemStacks(stack, (ItemStack) entry.getKey()))
        {
            return ((Float)entry.getValue()).floatValue();
        }
    }
    return 0.0F;
}

}
