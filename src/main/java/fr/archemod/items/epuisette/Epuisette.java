package fr.archemod.items.epuisette;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import fr.archemod.items.tools.ToolSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;

public class Epuisette extends ToolSword {
    public Epuisette(String name, ToolMaterial material) {
        super(name, material);
        setNoRepair();
        setMaxStackSize(1);
        setMaxDamage(64);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        RayTraceResult raytraceresult = playerIn.rayTrace(1, 0);

        IBlockState state = worldIn.getBlockState(raytraceresult.getBlockPos());
        if (!worldIn.isRemote && handIn == EnumHand.MAIN_HAND)
            if (state.getBlock() == Blocks.WATER) {

                playerIn.getHeldItem(handIn).shrink(1);
                int nombreAleatoire = (int) (Math.random() * 6);

                switch (nombreAleatoire) {
                    case 1:
                        playerIn.dropItem(ModItems.CREVETTE_GRISE, 1);
                        break;
                    case 2:
                        playerIn.dropItem(ModItems.CREVETTE_ROSE, 1);
                        break;
                    case 3:
                        playerIn.dropItem(ModItems.HIPPOCAMPE, 1);
                        break;
                    case 4:
                        playerIn.dropItem(ModItems.ECREVISSE, 1);
                        break;
                    case 5:
                        playerIn.dropItem(ModItems.ECREVISSE_ORANGE, 1);
                        break;
                    case 6:
                        playerIn.dropItem(ModItems.POULPE, 1);
                        break;

                }

            }

            return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
        }

    }



