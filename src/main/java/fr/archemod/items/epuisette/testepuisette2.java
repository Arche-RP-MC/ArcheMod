package fr.archemod.items.epuisette;

import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class testepuisette2 extends ItemBase {

    public testepuisette2(String name) {
        super(name);
   
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        if(!worldIn.isRemote && handIn==EnumHand.MAIN_HAND){

                playerIn.getHeldItem(handIn).shrink(1);
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


        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
