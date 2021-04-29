/*package fr.archemod.items;

import net.minecraft.block.BlockBed;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityBed;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class Vetement extends ItemBase

{
    EnumDyeColor color;

    public Vetement (String name, EnumDyeColor color) {
        super (name);
        this.color = color;
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) {
        RayTraceResult raytraceresult = rayTrace(worldIn, player, true);
        if (raytraceresult != null) {
            BlockPos pos = raytraceresult.getBlockPos();
            if (worldIn.getTileEntity(pos) instanceof TileEntityBed) {
                IBlockState state = worldIn.getBlockState(pos);
                EnumDyeColor previousColor = ((TileEntityBed)worldIn.getTileEntity(pos)).getColor();
                BlockPos posCompl = null;
                switch ((EnumFacing)worldIn.getBlockState(pos).getValue((IProperty) BlockBed.FACING)) {
                    case NORTH:
                        posCompl = (state.getValue((IProperty)BlockBed.PART) == BlockBed.EnumPartType.FOOT) ? pos.north() : pos.south();
                        break;
                    case SOUTH:
                        posCompl = (state.getValue((IProperty)BlockBed.PART) == BlockBed.EnumPartType.FOOT) ? pos.south() : pos.north();
                        break;
                    case WEST:
                        posCompl = (state.getValue((IProperty)BlockBed.PART) == BlockBed.EnumPartType.FOOT) ? pos.west() : pos.east();
                        break;
                    case EAST:
                        posCompl = (state.getValue((IProperty)BlockBed.PART) == BlockBed.EnumPartType.FOOT) ? pos.east() : pos.west();
                        break;
                }
                ((TileEntityBed)worldIn.getTileEntity(pos)).setColor(this.color);
                ((TileEntityBed)worldIn.getTileEntity(posCompl)).setColor(this.color);
                player.inventory.addItemStackToInventory(new ItemStack((Item)Item.REGISTRY.getObject(new ResourceLocation("am", "cloth_sheet_" + previousColor
                        .getName().toLowerCase())), 1, 0));
                return new ActionResult(EnumActionResult.SUCCESS, new ItemStack(this, player
                        .getHeldItem(hand).getCount() - 1, 0));
            }
        }
        return new ActionResult(EnumActionResult.FAIL, new ItemStack(this, player.getHeldItem(hand).getCount(), 0));
    }
}*/