package fr.archemod.items;

import fr.archemod.ArcheMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Enveloppe extends ItemBase {
    public Enveloppe(String name) {
        super(name);
        setMaxStackSize(1);
    }

    /**
     * Used to open the gui
     */
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.openGui(ArcheMod.INSTANCE, 14, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
