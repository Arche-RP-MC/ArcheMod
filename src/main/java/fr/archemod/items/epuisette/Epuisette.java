package fr.archemod.items.epuisette;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModItems;
import fr.archemod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
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

public class Epuisette extends ItemBase {
    public Epuisette(String name) {
        super(name);
        setNoRepair();
        setMaxStackSize(1);
        setMaxDamage(0);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {

        RayTraceResult raytraceresult = player.rayTrace(1, 0);

        IBlockState state = world.getBlockState(raytraceresult.getBlockPos());

        if(state.getBlock() == Blocks.WATER){

            int nombreAleatoire = 1 + (int)(Math.random() * (ItemList.values().length - 1));
            player.addItemStackToInventory(new ItemStack(ItemList.values()[nombreAleatoire].getItem()));
        }

        return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }

}



