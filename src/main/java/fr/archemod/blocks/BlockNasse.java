package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityNasse;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockNasse extends BlockBase implements ITileEntityProvider {


    public BlockNasse(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
        setLightLevel(0F);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityNasse();
    }

    @Override
    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
        super.eventReceived(state, worldIn, pos, eventID, eventParam);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
    }


    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntity tileentity = world.getTileEntity(pos);
        if (tileentity instanceof TileEntityNasse)
            InventoryHelper.dropInventoryItems(world, pos, (TileEntityNasse) tileentity);
        world.removeTileEntity(pos);
        super.breakBlock(world, pos, state);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        BlockPos upNeighbor = new BlockPos(pos).add(0, 1, 0);
        Block water = worldIn.getBlockState(upNeighbor).getBlock();
        if (!water.getRegistryName().toString().contains("water")) {
            if (worldIn.isRemote) playerIn.sendMessage(new TextComponentString("Il faut immerger la nasse pour la rendre fonctionnelle.").setStyle(new Style().setColor(TextFormatting.RED)));
        }
        else playerIn.openGui(ArcheMod.INSTANCE, 21, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }


    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {}


    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
        worldIn.setBlockToAir(pos);
    }

    @Override

    public EnumBlockRenderType getRenderType(IBlockState state) {

        return EnumBlockRenderType.MODEL;

    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }


    @Override
    public boolean isTranslucent(IBlockState state) {
        return true;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemStack.EMPTY.getItem();
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }
}