package fr.archemod.blocks.agriculture;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


public class BlockPlanLin2 extends BlockCrops {

    private Item seed;
    private Item crop;
    private int dropsWhenMature;
    private int dropsWhenRightClicked;
    private int dropsWhenBroken;

    public BlockPlanLin2 (String name, Item seed, Item crop, int dropsWhenMature, int dropsWhenRightClicked, int dropsWhenBroken) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        this.seed = seed;
        this.crop = crop;
        this.dropsWhenMature = dropsWhenMature;
        this.dropsWhenRightClicked = dropsWhenRightClicked;
        this.dropsWhenBroken = dropsWhenBroken;

        ModBlocks.BLOCKS.add(this);
    }

    @Override
    protected Item getSeed() {
        return this.seed;
    }

    @Override
    protected Item getCrop() {
        return this.crop;
    }

    @Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        super.getDrops(drops, world, pos, state, fortune);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        if (age >= getMaxAge()) {
            drops.add(new ItemStack(seed, dropsWhenMature + rand.nextInt(dropsWhenBroken + 1), 0));
            drops.add(new ItemStack(crop, dropsWhenMature + rand.nextInt(dropsWhenBroken + 1), 0));
        }
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack heldItem = player.getHeldItem(hand);

        if (heldItem.getItem() == ModItems.SERPE_EN_FER || heldItem.getItem() == ModItems.SERPE_EN_ACIER) {
            if (!worldIn.isRemote) {
                int age = getAge(state);
                if (age >= getMaxAge()) {
                    worldIn.setBlockState(pos, withAge(0));
                    spawnAsEntity(worldIn, pos, new ItemStack(crop, dropsWhenRightClicked));
                }
            }

            heldItem.damageItem(1, player);
            return true;
        }

        return super.onBlockActivated(worldIn, pos, state, player, hand, facing, hitX, hitY, hitZ);
    }







}