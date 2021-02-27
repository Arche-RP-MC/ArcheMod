package fr.archemod.items.huitre;

import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Huitre extends ItemBase {

    public Huitre(String name) {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if(!worldIn.isRemote && handIn==EnumHand.MAIN_HAND){
            playerIn.getHeldItem(handIn).shrink(1);
            int rnd = (int)(Math.random()*5);
            switch (rnd){
                case 0:
                    playerIn.dropItem(ModItems.PERLE_NATURELLE,1);
                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

            }
            playerIn.dropItem(ModItems.HUITRE_OUVERTE,1);
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
