package fr.archemod.items.sciure;

import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Sciure_Sapin extends ItemBase {

    public Sciure_Sapin(String name) {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if (!worldIn.isRemote && handIn == EnumHand.MAIN_HAND) {
            playerIn.getHeldItem(handIn).shrink(1);
            int rnd = (int) (Math.random() * 1);
            if (rnd == 0) {
                playerIn.dropItem(ModItems.SCIURE, 1);
            }
            playerIn.dropItem(ModItems.PLANCHE_SAPIN, 1);
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
