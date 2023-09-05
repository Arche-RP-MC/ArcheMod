package fr.archemod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemConsomable extends ItemBase {
    public ItemConsomable(String name, int durability) {
        super(name);
        setNoRepair();
        setMaxStackSize(1);
        setMaxDamage(durability);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote && handIn == EnumHand.MAIN_HAND) {
            if (playerIn.getHeldItem(handIn).getItemDamage() == playerIn.getHeldItem(handIn).getMaxDamage()) {
                playerIn.setHeldItem(handIn, ItemStack.EMPTY);
            }
            playerIn.getHeldItem(handIn).damageItem(1, playerIn);
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
