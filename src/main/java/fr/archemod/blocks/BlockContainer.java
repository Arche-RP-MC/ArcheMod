package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityBlockInventory;
import fr.archemod.blocks.tileentity.TileEntityBlockInventoryVisible;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public abstract class BlockContainer extends BlockBase implements ITileEntityProvider {
    private AxisAlignedBB BOUNDING_BOX;
    private String id;
    private int size;
    private int slotInRow;
    private int invStackLimit;
    private int modGuiId;
    private boolean visibleInventory;

    public BlockContainer(String name, Material material, float hardness, float resistance, SoundType soundType, String id, int size, int slotInRow, int invStackLimit, AxisAlignedBB boundingBox, int modGuiId, boolean visibleInventory) {
        super(name, material, hardness, resistance, soundType);
        BOUNDING_BOX = boundingBox;
        this.id = id;
        this.size = size;
        this.slotInRow = slotInRow;
        this.invStackLimit = invStackLimit;
        this.modGuiId = modGuiId;
        this.visibleInventory = visibleInventory;
        this.setLightOpacity(0);
    }

    @Override
    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
        System.out.println("Ici");
        super.eventReceived(state, worldIn, pos, eventID, eventParam);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntity tileentity = world.getTileEntity(pos);
        if (tileentity instanceof TileEntityBlockInventory)
            InventoryHelper.dropInventoryItems(world, pos, (TileEntityBlockInventory) tileentity);
        world.removeTileEntity(pos);
        super.breakBlock(world, pos, state);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        } else {
            playerIn.openGui(ArcheMod.INSTANCE, modGuiId, worldIn, pos.getX(), pos.getY(), pos.getZ());

            return true;
        }
    }


    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        TileEntity tile = worldIn.getTileEntity(pos);
        if (tile instanceof TileEntityBlockInventory) {
            if (stack.hasDisplayName()) {
                ((TileEntityBlockInventory) tile).setCustomName(stack.getDisplayName());
            }
        }
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
        worldIn.setBlockToAir(pos);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return super.getRenderType(state);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }


    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BOUNDING_BOX;
    }


    @Override
    public boolean isTranslucent(IBlockState state) {
        return true;
    }

    private boolean checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (!this.canPlaceBlockAt(worldIn, pos)) {
            worldIn.setBlockToAir(pos);
            return false;
        } else {
            return true;
        }
    }
}
