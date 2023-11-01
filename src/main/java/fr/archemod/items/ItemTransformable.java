package fr.archemod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.ArrayList;

public class ItemTransformable extends ItemBase {
    private ArrayList<Item> drops;

    public ItemTransformable(String name, ArrayList<Item> itemDrops) {
        super(name);
        drops = itemDrops;
    }

    public ArrayList<Item> getDrops() {
        return drops;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote && handIn == EnumHand.MAIN_HAND) {
            playerIn.getHeldItem(handIn).shrink(1);
            for(int i=0; i<drops.size(); i++) {
                playerIn.dropItem(drops.get(i), 1);
            }
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
