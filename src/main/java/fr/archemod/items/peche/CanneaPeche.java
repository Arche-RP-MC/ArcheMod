package fr.archemod.items.peche;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class CanneaPeche extends ItemFishingRod {
    public CanneaPeche(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);
        ModItems.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        int rnd = (int) (Math.random() * 6);
        switch (rnd) {
            case 0:
                playerIn.dropItem(ModItems.CREVETTE_GRISE, 1);
                break;
            case 1:
                playerIn.dropItem(ModItems.CREVETTE_ROSE, 1);
                break;
            case 2:
                playerIn.dropItem(ModItems.HIPPOCAMPE, 1);
                break;
            case 3:
                playerIn.dropItem(ModItems.ECREVISSE, 1);
                break;
            case 4:
                playerIn.dropItem(ModItems.ECREVISSE_ORANGE, 1);
                break;
            case 5:
                playerIn.dropItem(ModItems.POULPE, 1);
                break;
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
