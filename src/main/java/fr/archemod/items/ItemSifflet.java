package fr.archemod.items;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.init.ModSounds;
import fr.archemod.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemSifflet extends Item implements IHasModel {

    public ItemSifflet(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        ModItems.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack heldItem = player.getHeldItem(hand);

        if (!world.isRemote) {
            // Jouer le son du sifflet sur le serveur
            //world.playSound(null, player.getPosition(), ModSounds.SIFFLET, player.getSoundCategory(), 1.0F, 1.0F);
        }

        return new ActionResult<>(EnumActionResult.SUCCESS, heldItem);
    }

    @Override
    public void registerModels() {
        ArcheMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}