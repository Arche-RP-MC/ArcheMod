package fr.archemod.items.food;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Bol extends FoodBase {

    public Bol(String name, int amount, float saturation, boolean isAnimalFood) {
        super(name, amount, saturation, isAnimalFood);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }
    /*@Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        if (!worldIn.isRemote)
        {
            player.dropItem(Items.BOWL,1);

        }

    }*/
}
