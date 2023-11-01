package fr.archemod.items;

import fr.archemod.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.ArrayList;

public class ItemTransformableProbability extends ItemTransformable {
    private ArrayList<Item> itemDropsProba;
    private int proba = 0;

    public ItemTransformableProbability(String name, ArrayList<Item> itemDrops) {
        super(name, itemDrops);
        this.itemDropsProba = new ArrayList() {{ add(ItemStack.EMPTY.getItem()); }};
    }

    public ItemTransformableProbability(String name, ArrayList<Item> itemDrops, ArrayList<Item> itemDropsProba) {
        super(name, itemDrops);
        this.itemDropsProba = itemDropsProba;
    }

    public ItemTransformableProbability(String name, ArrayList<Item> itemDrops, ArrayList<Item> itemDropsProba, int proba) {
        super(name, itemDrops);
        this.itemDropsProba = itemDropsProba;
        this.proba = proba;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote && handIn == EnumHand.MAIN_HAND) {
            playerIn.getHeldItem(handIn).shrink(1);
            int rnd;
            if(proba == 0) rnd = (int) (Math.random() * itemDropsProba.size());
            else rnd = (int) (Math.random() * proba);
            for(int i=0; i<itemDropsProba.size(); i++) {
                if(i == rnd) {
                    playerIn.dropItem(itemDropsProba.get(i), 1);
                }
            }
            if(!getDrops().get(0).equals(ItemStack.EMPTY.getItem())) {
                for(int i=0; i<getDrops().size(); i++) {
                    playerIn.dropItem(getDrops().get(i), 1);
                }
            }
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
