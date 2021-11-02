package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityFourSechoir;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockFourSechoir extends BlockContainer
{
   /* @SubscribeEvent

    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(ModBlocks.FourSechoir);

    }*/


    public BlockFourSechoir(String name, Material material, float hardness, float resistance, SoundType soundType){
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setSoundType(soundType);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));}

    @Override
    public boolean hasTileEntity(){

        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileEntityFourSechoir();
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof TileEntityFourSechoir) {
            InventoryHelper.dropInventoryItems(worldIn, pos,
                    (TileEntityFourSechoir) tileentity);
        }

        super.breakBlock(worldIn, pos, state);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            return true;
        } else {
            TileEntity tileentity = world.getTileEntity(pos);

            if (tileentity instanceof TileEntityFourSechoir) {
                player.openGui(ArcheMod.INSTANCE, 0, world, pos.getX(),
                        pos.getY(), pos.getZ());
            }

            return true;
        }
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        if (stack.hasDisplayName()) {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityFourSechoir) {
                ((TileEntityFourSechoir) tileentity).setCustomName(stack
                        .getDisplayName());
            }
        }
    }

}
