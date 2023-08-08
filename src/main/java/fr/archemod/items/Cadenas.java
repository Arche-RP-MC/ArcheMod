package fr.archemod.items;

import fr.archemod.ArcheMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class Cadenas extends ItemBase {

    public Cadenas(String name) {
        super(name);
        setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        RayTraceResult target = Minecraft.getMinecraft().objectMouseOver;
        if(target.typeOfHit == RayTraceResult.Type.BLOCK) {
            Block targetBlock = worldIn.getBlockState(target.getBlockPos()).getBlock();
            if(targetBlock.getRegistryName().toString().contains("door")) {
                BlockDoor porte = (BlockDoor) targetBlock;
                porte.setBlockUnbreakable();
            }
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
