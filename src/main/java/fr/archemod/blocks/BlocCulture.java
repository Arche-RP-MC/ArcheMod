package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;


public class BlocCulture extends BlockCrops {

    public static Item[] serpes = new Item[]{ModItems.SERPE_EN_FER, ModItems.SERPE_EN_ACIER};
    public static Item[] faux = new Item[]{ModItems.FAUX};
    public static Item[] cisailles = new Item[]{ModItems.PETITE_CISAILLE, Items.SHEARS};
    public static Item[] fourche = new Item[]{ModItems.FOURCHE_EN_FER, Items.IRON_SHOVEL, Items.IRON_HOE};
    public static Item[] main = new Item[]{ModItems.COUTEAU_EN_FER, ModItems.COUTEAU_ACIER};//TODO : faire fonctionner pour la récolte sans outil, pas encore trouvé

    private final Item seed;
    private final Item crop;
    private final Item[] tools;
    private final int dropsWhenMature;
    private final int dropsWhenRightClicked;
    private final int dropsWhenBroken;

    public BlocCulture(String name, Item seed, Item crop, Item[] tools, int dropsWhenMature, int dropsWhenRightClicked, int dropsWhenBroken) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcheMod.archeCreativeTabs);

        this.seed = seed;
        this.crop = crop;
        this.tools = tools; //Outils de récolte : faux, serpe, petite cisaille, pelle, bêche etc...
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
        Random rand = world instanceof World ? ((World) world).rand : new Random();

        if (age >= getMaxAge()) {
            drops.add(new ItemStack(seed, dropsWhenMature /*+ rand.nextInt(dropsWhenRightClicked + 1)*/, 0));
            drops.add(new ItemStack(crop, dropsWhenMature /*+ rand.nextInt(dropsWhenRightClicked + 1)*/, 0));
        }
    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack heldItem = player.getHeldItem(hand);

        for (Item tool : tools) {
            if (heldItem.getItem() == tool) {
                if (!worldIn.isRemote) {
                    int age = getAge(state);
                    if (age >= getMaxAge()) {
                        worldIn.setBlockState(pos, withAge(0));
                        spawnAsEntity(worldIn, pos, new ItemStack(crop, dropsWhenRightClicked));
                        heldItem.damageItem(1, player);
                    }
                }
                return true;
            }
        }

        return super.onBlockActivated(worldIn, pos, state, player, hand, facing, hitX, hitY, hitZ);
    }


}