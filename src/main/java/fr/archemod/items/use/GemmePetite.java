package fr.archemod.items.use;

import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class GemmePetite extends ItemBase {

    public GemmePetite(String name) {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if (!worldIn.isRemote && handIn == EnumHand.MAIN_HAND) {
            playerIn.getHeldItem(handIn).shrink(1);
            int rnd = (int) (Math.random() * 15);
            switch (rnd) {
                case 0:
                    playerIn.dropItem(ModItems.PETITE_GEODE_AIGUE_MARINE, 1);
                    break;
                case 1:
                    playerIn.dropItem(ModItems.PETITE_GEODE_AMETHYSTE, 1);
                    break;
                case 2:
                    playerIn.dropItem(ModItems.PETITE_GEODE_CORNALINE, 1);
                    break;
                case 3:
                    playerIn.dropItem(ModItems.PETITE_GEODE_DIAMANT, 1);
                    break;
                case 4:
                    playerIn.dropItem(ModItems.PETITE_GEODE_EMERAUDE, 1);
                    break;
                case 5:
                    playerIn.dropItem(ModItems.PETITE_GEODE_FLUORINE, 1);
                    break;
                case 6:
                    playerIn.dropItem(ModItems.PETITE_GEODE_HEMATITE, 1);
                    break;
                case 7:
                    playerIn.dropItem(ModItems.PETITE_GEODE_JADE, 1);
                    break;
                case 8:
                    playerIn.dropItem(ModItems.PETITE_GEODE_OEIL_DE_TIGRE, 1);
                    break;
                case 9:
                    playerIn.dropItem(ModItems.PETITE_GEODE_ONYX, 1);
                    break;
                case 10:
                    playerIn.dropItem(ModItems.PETITE_GEODE_OPALE, 1);
                    break;
                case 11:
                    playerIn.dropItem(ModItems.PETITE_GEODE_RUBIS, 1);
                    break;
                case 12:
                    playerIn.dropItem(ModItems.PETITE_GEODE_SAPHIR, 1);
                    break;
                case 13:
                    playerIn.dropItem(ModItems.PETITE_GEODE_SPINELLE, 1);
                    break;
                case 14:
                    playerIn.dropItem(ModItems.PETITE_GEODE_TURQUOISE, 1);
                    break;
            }
            playerIn.dropItem(ModItems.POUSSIERE_MINERALE, 1);
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
