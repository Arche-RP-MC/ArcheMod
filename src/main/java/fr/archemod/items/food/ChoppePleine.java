package fr.archemod.items.food;

import fr.archemod.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ChoppePleine extends FoodBase {

    public ChoppePleine(String name, int amount, float saturation, boolean isAnimalFood) {
        super(name, amount, saturation, isAnimalFood);
    }

    /*@Override
     protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
         super.onFoodEaten(stack, worldIn, player);
         if (!worldIn.isRemote)
         {
             player.dropItem(ModItems.CHOPPE_EN_VERRE,1);
         }
     }*/
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(ModItems.CHOPPE_EN_VERRE);
    }


    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        if (itemStack.getItemDamage() == itemStack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        ItemStack itemCopy = itemStack.copy();
        itemCopy.setItemDamage(itemCopy.getItemDamage() + 1);
        return itemCopy;
    }
}
