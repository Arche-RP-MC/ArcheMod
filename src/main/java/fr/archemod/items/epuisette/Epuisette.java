package fr.archemod.items.epuisette;

import fr.archemod.ArcheMod;
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
        setMaxDamage(0);
    }



    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        RayTraceResult raytraceresult = player.rayTrace(1, 0);

        IBlockState state = world.getBlockState(raytraceresult.getBlockPos());

        if(state.getBlock() == Blocks.WATER){


            int nombreAleatoire = (int)(Math.random() * 5);

            switch (nombreAleatoire){
                case 1:
                    player.dropItem(ModItems.PELUCHE_POULPE, 1);
                    break;
                case 2:
                    player.dropItem(ModItems.CREVETTE_ROSE, 1);
                    break;
                case 3:
                    player.dropItem(ModItems.HIPPOCAMPE, 1);
                    break;
                case 4:
                    player.dropItem(ModItems.ECREVISSE, 1);
                    break;
            }

        }

        return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }

}



