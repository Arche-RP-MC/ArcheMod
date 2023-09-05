package fr.archemod.items.peche;

import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public class CustomFishingRod extends ItemBase {

    private static final int NUM_ITEMS = 29;
    private static final int DURABILITY = 100;

    public CustomFishingRod(String name) {
        super(name);
        setMaxDamage(DURABILITY);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        if (!worldIn.isRemote) {
            RayTraceResult raytraceresult = rayTrace(worldIn, playerIn, true);
            if (raytraceresult != null && raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK) {
                int x = raytraceresult.getBlockPos().getX();
                int y = raytraceresult.getBlockPos().getY();
                int z = raytraceresult.getBlockPos().getZ();
                if (worldIn.getBlockState(raytraceresult.getBlockPos()).getBlock() == Blocks.WATER) {
                    Random rand = new Random();
                    int itemIndex = rand.nextInt(NUM_ITEMS);
                    switch (itemIndex) {
                        case 0:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CALAMAR, 1));
                            break;
                        case 1:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.POULPE, 1));
                            break;
                        case 2:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.ANGE_ROYAL, 1));
                            break;
                        case 3:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CARPE, 1));
                            break;
                        case 4:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CARPE_KOI, 1));
                            break;
                        case 5:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CARCASSE_DE_POISSON, 1));
                            break;
                        case 6:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHIRURGIEN_BLEU, 1));
                            break;
                        case 7:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHIRURGIEN_NOIR, 1));
                            break;
                        case 8:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHROMIS_VIRIDIS, 1));
                            break;
                        case 9:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.COMBATTANT_NOIR, 1));
                            break;
                        case 10:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.COMBATTANT_ROUGE, 1));
                            break;
                        case 11:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CROISSANT_A_QUEUE_JAUNE, 1));
                            break;
                        case 12:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.DEMOISELLE_RAYEE, 1));
                            break;
                        case 13:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.DORADE, 1));
                            break;
                        case 14:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.DORE_JAUNE, 1));
                            break;
                        case 15:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.GOURAMI_MIEL, 1));
                            break;
                        case 16:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.ANGUILLE, 1));
                            break;
                        case 17:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.GRAMMA_LORETO, 1));
                            break;
                        case 18:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.GUPPY, 1));
                            break;
                        case 19:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.MEROU, 1));
                            break;
                        case 20:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.NAPOLEON, 1));
                            break;
                        case 21:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.POISSON_CHAT, 1));
                            break;
                        case 22:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.POISSON_CHIRURGIEN, 1));
                            break;
                        case 23:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.POISSON_CLOWN_NOIR, 1));
                            break;
                        case 24:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.POISSON_LUNE, 1));
                            break;
                        case 25:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.POISSON_PERROQUET, 1));
                            break;
                        case 26:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.ROUGET, 1));
                            break;
                        case 27:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.ZANCLUS_CORNUTUS, 1));
                            break;

                        case 28:
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.LABIDO_JAUNE, 1));
                            break;
                    }
                    itemstack.damageItem(1, playerIn);
                }
            }
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 72000;
    }
}
