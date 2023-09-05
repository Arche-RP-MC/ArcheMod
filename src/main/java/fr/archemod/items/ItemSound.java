package fr.archemod.items;

import fr.archemod.init.ModSounds;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class ItemSound extends ItemBase {
    private SoundEvent sound;

    public ItemSound(String name, SoundEvent sound) {
        super(name);
        this.sound = sound;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        worldIn.playSound(playerIn, playerIn.getPosition(), ModSounds.SIFFLET, SoundCategory.PLAYERS, 1f, 1f);
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
