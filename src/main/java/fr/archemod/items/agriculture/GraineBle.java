package fr.archemod.items.agriculture;

import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class GraineBle extends ItemBase {

    public GraineBle(String name) {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if(!worldIn.isRemote && handIn==EnumHand.MAIN_HAND){
            playerIn.getHeldItem(handIn).shrink(1);
            int rnd = (int)(Math.random()*1);
            switch (rnd){
                case 0:
                    playerIn.dropItem(ModItems.FIBRE_VEGETALE,3);
                    break;


            }
            playerIn.dropItem(Items.WHEAT_SEEDS,20);
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
