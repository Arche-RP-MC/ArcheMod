package fr.archemod.items.food;

import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Poisson extends ItemBase {

    public Poisson(String name) {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if(!worldIn.isRemote && handIn==EnumHand.MAIN_HAND){
            playerIn.getHeldItem(handIn).shrink(1);
            int rnd = (int)(Math.random()*1);
            switch (rnd){
                case 0:
                    playerIn.dropItem(ModItems.MORCEAU_DE_POISSON_CRU,1);
                    break;


            }
            playerIn.dropItem(ModItems.CARCASSE_DE_POISSON,1);
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
