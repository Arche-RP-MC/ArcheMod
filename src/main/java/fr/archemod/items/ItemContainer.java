package fr.archemod.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemContainer extends ItemFoodBase {
    private Item emptyItem;
    private boolean isFood;

    public ItemContainer(String name, int amount, float saturation, boolean isAnimalFood, Item emptyItem, int durability) {
        super(name, amount, saturation, isAnimalFood);
        setMaxDamage(durability);
        setMaxStackSize(1);

        this.emptyItem = emptyItem;
    }

    public ItemContainer(String name, int amount, float saturation, boolean isAnimalFood, Item emptyItem, int durability, boolean isFood) {
        super(name, amount, saturation, isAnimalFood);
        setMaxDamage(durability);
        setMaxStackSize(1);

        this.emptyItem = emptyItem;
        this.isFood = isFood;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer) entityLiving;
            entityplayer.getFoodStats().addStats(this, stack);
            worldIn.playSound(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));

            if (entityplayer instanceof EntityPlayerMP) {
                CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP) entityplayer, stack);
            }
        }

        if(stack.isItemStackDamageable()) {
            stack.damageItem(1, entityLiving);
            if(!stack.isEmpty()) return stack;
        }
        return new ItemStack(emptyItem);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        if(isFood) return EnumAction.EAT;
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

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }
}
