package fr.archemod.items;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModSounds;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class PorteClef extends ItemBase {
    public PorteClef(String name) {
        super(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.openGui(ArcheMod.INSTANCE, 13, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
        worldIn.playSound(playerIn, playerIn.getPosition(), ModSounds.ADD_KEY_KEYRING, SoundCategory.PLAYERS, 1f, 1f);
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

    /*@Override
    public ActionResultType useOn(ItemUseContext ctx)
    {
        World world = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        IItemHandler inv = ctx.getItemInHand().getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).orElse(null);
        List<Lockable> intersect = LocksUtil.intersecting(world, pos).collect(Collectors.toList());
        if(intersect.isEmpty())
            return ActionResultType.PASS;
        for(int a = 0; a < inv.getSlots(); ++a)
        {
            int id = LockingItem.getOrSetId(inv.getStackInSlot(a));
            List<Lockable> match = intersect.stream().filter(lkb -> lkb.lock.id == id).collect(Collectors.toList());
            if(match.isEmpty())
                continue;
            world.playSound(ctx.getPlayer(), pos, LocksSoundEvents.LOCK_OPEN.get(), SoundCategory.BLOCKS, 1f, 1f);
            if(world.isClientSide)
                return ActionResultType.SUCCESS;
            for(Lockable lkb : match)
                lkb.lock.setLocked(!lkb.lock.isLocked());
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.SUCCESS;
    }*/
}
