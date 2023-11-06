package fr.archemod.items;

import fr.archemod.ArcheMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemInventory extends ItemBase {
    private int modGuild;

    public ItemInventory(String name, int guiNumberForGuiHandlerCase) {
        super(name);
        setMaxStackSize(1);
        this.modGuild = guiNumberForGuiHandlerCase;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(handIn == EnumHand.MAIN_HAND) playerIn.openGui(ArcheMod.INSTANCE, modGuild, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}