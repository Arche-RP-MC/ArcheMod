package fr.archemod.items.food;

import fr.archemod.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class VerrePlein extends FoodBase{

    public VerrePlein(String name, int amount, float saturation, boolean isAnimalFood) {
        super(name, amount, saturation, isAnimalFood);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        if (!worldIn.isRemote)
        {
            player.dropItem(ModItems.VERRE_A_PIED,1);
        }
    }
    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        if(itemStack.getItemDamage()==itemStack.getMaxDamage()){
            return ItemStack.EMPTY;
        }
        ItemStack itemCopy = itemStack.copy();
        itemCopy.setItemDamage(itemCopy.getItemDamage()+1);
        return itemCopy;
    }
}
