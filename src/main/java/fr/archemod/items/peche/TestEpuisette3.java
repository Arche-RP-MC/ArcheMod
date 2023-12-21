package fr.archemod.items.peche;

import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class TestEpuisette3 extends ItemBase {

    public TestEpuisette3(String name) {
        super(name);
        setMaxDamage(8);
        setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        RayTraceResult result = rayTrace(worldIn, playerIn, true);
        if (result != null && result.typeOfHit == RayTraceResult.Type.BLOCK) {
            BlockPos pos = result.getBlockPos();
            IBlockState state = worldIn.getBlockState(pos);
            Block block = state.getBlock();
            if (block == Blocks.WATER) {
                if (!worldIn.isRemote && handIn == EnumHand.MAIN_HAND) {
                    if (playerIn.getHeldItem(handIn).getItemDamage() >= playerIn.getHeldItem(handIn).getMaxDamage()) {
                        playerIn.setHeldItem(handIn, ItemStack.EMPTY);
                    }
                    ItemStack itemStack = playerIn.getHeldItem(handIn);
                    itemStack.setItemDamage(itemStack.getItemDamage() + 1);
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
        return new ActionResult<>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
