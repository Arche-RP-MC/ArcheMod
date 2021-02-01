package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityFishCase;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.util.Reference;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Random;

public class BlockFishCase extends BlockBase implements ITileEntityProvider {


    public BlockFishCase(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
        setLightLevel(0F);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityFishCase();
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
        if (tileentity instanceof TileEntityFishCase)
            InventoryHelper.dropInventoryItems(world, pos, (TileEntityFishCase) tileentity);
        world.removeTileEntity(pos);
        super.breakBlock(world, pos, state);
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {

        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            playerIn.openGui(ArcheMod.INSTANCE, 6, worldIn, pos.getX(), pos.getY(), pos.getZ());

            TileEntity tile = worldIn.getTileEntity(pos);

            long date = Long.parseLong(tile.getTileData().getString("time"));
            //date 10H apres la date enregistré
            long dateAfter = date + 5 * 3600000L;


            if(dateAfter >= date){

                int nombreAleatoire = 1 + (int)(Math.random() * (ItemList.values().length - 1));
                tile.serializeNBT();

                ItemList itemList = ItemList.values()[nombreAleatoire];

                ((TileEntityFishCase)tile).addItem(
                        new ItemStack(
                                Objects.requireNonNull(itemList.getItem())),
                        itemList.getStackSize());
            }


            return true;
        }
    }


    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        TileEntity tile = worldIn.getTileEntity(pos);
        if(tile instanceof TileEntityFishCase)
        {

            tile.serializeNBT();
            //ArcheMod.LOGGER.info(tile.getTileData().getString("time"));
            if(stack.hasDisplayName())
            {
                ((TileEntityFishCase)tile).setCustomName(stack.getDisplayName());

            }
        }
    }



    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
        worldIn.setBlockToAir(pos);
    }

    @Override

    public EnumBlockRenderType getRenderType(IBlockState state)

    {

        return EnumBlockRenderType.MODEL;

    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }


    @Override
    public boolean isTranslucent(IBlockState state){
        return true;
    }


    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.FISH_CASE);
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 1;
    }
}

enum ItemList{
    COQUILLE_SAINT_JACQUES(4, ModItems.COQUILLE_SAINT_JACQUES),
    CRABE(1, ModItems.CRABE),
    HOMARD(1, ModItems.HOMARD),
    HUITRE(3, ModItems.HUITRE),
    NAUTILE(2, ModItems.NAUTILE),
    ORMEAUX(2, ModItems.ORMEAUX),
    PALOURDE(4, ModItems.PALOURDE),
    CARPE(1, ModItems.CARPE),
    DORADE(1, ModItems.DORADE),
    DORE_JAUNE(1, ModItems.DORE_JAUNE),
    GOURAMI_MIEL(1, ModItems.GOURAMI_MIEL),
    MEROU(1, ModItems.MEROU),
    NAPOLEON(1,ModItems.NAPOLEON),
    POISSON_CHAT(1, ModItems.POISSON_CHAT),
    POISSON_PERROQUET(1, ModItems.POISSON_PERROQUET),
    ROUGET(1, ModItems.ROUGET),
    SARDINE(2, ModItems.SARDINE),
    THON(1, ModItems.THON);

    int stackSize;
    Item item;

    ItemList(int stackSize, Item item){
        this.stackSize = stackSize;
        this.item = item;
    }

    public int getStackSize(){
        return stackSize;
    }

    public Item getItem(){
        return item;
    }

}