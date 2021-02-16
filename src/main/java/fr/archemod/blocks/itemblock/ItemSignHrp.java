package fr.archemod.blocks.itemblock;



import fr.archemod.ArcheMod;
import fr.archemod.blocks.signhrp.SignStandingSign;
import fr.archemod.blocks.tileentity.TileEntitySignHrp;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.network.ArcheNetwork;
import fr.archemod.network.server.GuiOpensignPaket;
import fr.archemod.util.IHasModel;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockWallSign;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemSignHrp extends Item implements IHasModel {


    public ItemSignHrp() {
        this.maxStackSize = 16;
        setRegistryName("sign_hrp");
        setTranslationKey("sign_hrp");

        this.setCreativeTab(CreativeTabs.COMBAT);
        ModItems.ITEMS.add(this);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        boolean flag = iblockstate.getBlock().isReplaceable(worldIn, pos);

        if (facing != EnumFacing.DOWN && (iblockstate.getMaterial().isSolid() || flag) && (!flag || facing == EnumFacing.UP)) {
            pos = pos.offset(facing);
            ItemStack itemstack = player.getHeldItem(hand);

            if (player.canPlayerEdit(pos, facing, itemstack) && ModBlocks.standing_sign_hrp.canPlaceBlockAt(worldIn, pos)) {


                if (!worldIn.isRemote) {
                    pos = flag ? pos.down() : pos;

                    if (facing == EnumFacing.UP) {
                        int i = MathHelper.floor((double) ((player.rotationYaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
                        worldIn.setBlockState(pos,  ModBlocks.standing_sign_hrp.getDefaultState().withProperty(SignStandingSign.ROTATION, Integer.valueOf(i)), 11);
                    } else {
                        worldIn.setBlockState(pos,  ModBlocks.wall_sign_hrp.getDefaultState().withProperty(BlockWallSign.FACING, facing), 11);
                    }

                    TileEntity tileEntity = worldIn.getTileEntity(pos);
                    if (tileEntity instanceof TileEntitySignHrp && !ItemBlock.setTileEntityNBT(worldIn, player, pos, itemstack)) {

                        TileEntitySignHrp te = (TileEntitySignHrp) tileEntity;

                        te.setPlayer(player);
                        ArcheNetwork.NETWORK.sendTo(new GuiOpensignPaket((TileEntitySignHrp) tileEntity), (EntityPlayerMP) player);
                    }
                    if (player instanceof EntityPlayerMP) {
                        CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP) player, pos, itemstack);
                    }

                    itemstack.shrink(1);


                }



                return EnumActionResult.SUCCESS;


            } else {
                return EnumActionResult.FAIL;
            }
        } else {
            return EnumActionResult.FAIL;
        }

    }
    @Override
    public void registerModels(){
        ArcheMod.proxy.registerItemRenderer(this, 0, "inventory");}
}

