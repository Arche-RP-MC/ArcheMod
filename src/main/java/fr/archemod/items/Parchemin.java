package fr.archemod.items;

import fr.archemod.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Parchemin extends ItemBase {

    public Parchemin(String name) {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if(!worldIn.isRemote && handIn==EnumHand.MAIN_HAND){
            playerIn.getHeldItem(handIn).shrink(1);
            int rnd = (int)(Math.random()*1);
            switch (rnd){
                case 0:
                    playerIn.dropItem(ModItems.PARCHEMIN_DESCELLE,1);
                    break;


            }

        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
