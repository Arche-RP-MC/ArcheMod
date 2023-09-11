package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntityFut;
import fr.archemod.init.ModItems;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockFut extends BlockBaseOriented implements ITileEntityProvider {

    public BlockFut(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        TileEntityFut te = (TileEntityFut) worldIn.getTileEntity(pos);
        if(playerIn.getHeldItem(EnumHand.MAIN_HAND).isEmpty()) {
            playerIn.openGui(ArcheMod.INSTANCE, 20, worldIn, pos.getX(), pos.getY(), pos.getZ());
            return true;
        }

        ItemStack itemStack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
        String name = itemStack.getItem().getRegistryName().toString();
        String contenu = te.getContenu();

        if((itemStack.getItem() == Items.WATER_BUCKET || itemStack.getItem() == Items.MILK_BUCKET ||
                itemStack.getItem() == ModItems.SEAU_D_EAU_EN_BOIS || itemStack.getItem() == ModItems.SEAU_DE_LAIT_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_ALCOOL_PUR || itemStack.getItem() == ModItems.SEAU_ALCOOL_PUR_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_DE_BIERRE_BLONDE || itemStack.getItem() == ModItems.SEAU_DE_BIERRE_BLONDE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_DE_BIERE_BRUNE || itemStack.getItem() == ModItems.SEAU_DE_BIERE_BRUNE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_DE_BIERE_ROUSSE || itemStack.getItem() == ModItems.SEAU_DE_BIERE_ROUSSE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_DE_HYDROMEL || itemStack.getItem() == ModItems.SEAU_DE_HYDROMEL_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_HYPOCRAS || itemStack.getItem() == ModItems.SEAU_HYPOCRAS_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_DE_RHUM || itemStack.getItem() == ModItems.SEAU_DE_RHUM_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_DE_VIN_BLANC || itemStack.getItem() == ModItems.SEAU_DE_VIN_BLANC_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_DE_VIN_ROUGE || itemStack.getItem() == ModItems.SEAU_DE_VIN_ROUGE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_JAGERMEISTER || itemStack.getItem() == ModItems.SEAU_JAGERMEISTER_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_VIPERINE || itemStack.getItem() == ModItems.SEAU_VIPERINE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_RYE || itemStack.getItem() == ModItems.SEAU_RYE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_NIGORIZAKE || itemStack.getItem() == ModItems.SEAU_NIGORIZAKE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_LIQUEUR_FRUIT || itemStack.getItem() == ModItems.SEAU_LIQUEUR_FRUIT_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_BLANC || itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_BLANC_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_JAUNE || itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_JAUNE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_ORANGE || itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_ORANGE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_ROUGE || itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_ROUGE_EN_BOIS ||
                itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_VERT || itemStack.getItem() == ModItems.SEAU_JUS_DE_FRUIT_VERT_EN_BOIS
        ) && te.getContenu().equals("empty")) {
            te.setContenu(name);
            te.setCharge(15);
            playerIn.setHeldItem(EnumHand.MAIN_HAND, getItemStack(name, contenu));
            itemStack.shrink(1);
        }
        if((itemStack.getItem() == ModItems.CHOPPE_EN_VERRE || itemStack.getItem() == ModItems.CHOPPE_EN_ARGILE || itemStack.getItem() == ModItems.VERRE_A_PIED) && te.getCharge() > 0 && !te.getContenu().contains("alcool_pur")) {
            te.setCharge(te.getCharge()-1);
            if(te.getCharge() == 0) te.setContenu("empty");

            itemStack.shrink(1);
            if(playerIn.getHeldItem(EnumHand.MAIN_HAND).isEmpty()) playerIn.setHeldItem(EnumHand.MAIN_HAND, getItemStack(name, contenu));
            else playerIn.inventory.addItemStackToInventory(getItemStack(name, contenu));
        }
        if(itemStack.getItem() == ModItems.BOUTEILLE_VIDE && te.getCharge() > 4) {
            te.setCharge(te.getCharge()-5);
            if(te.getCharge() == 0) te.setContenu("empty");

            itemStack.shrink(1);
            if(playerIn.getHeldItem(EnumHand.MAIN_HAND).isEmpty()) playerIn.setHeldItem(EnumHand.MAIN_HAND, getItemStack(name, contenu));
            else playerIn.inventory.addItemStackToInventory(getItemStack(name, contenu));
        }
        return true;
    }

    private ItemStack getItemStack(String item, String contenu) {
        switch(item) {
            //Ajout de volume
            case "minecraft:water_bucket":
            case "minecraft:milk_bucket":
                return new ItemStack(Items.BUCKET);
            //Retrait de volume
            case "am:choppe_en_verre":
                switch(contenu) {
                    case "minecraft:water_bucket":
                    case "am:seau_d_eau_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_EAU);
                    case "minecraft:milk_bucket":
                    case "am:seau_de_lait_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_LAIT);
                    case "am:seau_de_bierre_blonde":
                    case "am:seau_de_bierre_blonde_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERRE_BLONDE);
                    case "am:seau_de_biere_brune":
                    case "am:seau_de_biere_brune_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERE_BRUNE);
                    case "am:seau_de_biere_rousse":
                    case "am:seau_de_biere_rousse_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERE_ROUSSE);
                    case "am:seau_de_hydromel":
                    case "am:seau_de_hydromel_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_HYDROMEL);
                    case "am:seau_hypocras":
                    case "am:seau_hypocras_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_HYPOCRAS);
                    case "am:seau_de_rhum":
                    case "am:seau_de_rhum_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_RHUM);
                    case "am:seau_de_vin_blanc":
                    case "am:seau_de_vin_blanc_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_VIN_BLANC);
                    case "am:seau_de_vin_rouge":
                    case "am:seau_de_vin_rouge_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_VIN_ROUGE);
                    case "am:seau_jagermeister":
                    case "am:seau_jagermeister_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_JAGERMEISTER);
                    case "am:seau_viperine":
                    case "am:seau_viperine_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_VIPERINE);
                    case "am:seau_rye":
                    case "am:seau_rye_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_RYE);
                    case "am:seau_nigorizake":
                    case "am:seau_nigorizake_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_NIGORIZAKE);
                    case "am:seau_liqueur_fruit":
                    case "am:seau_liqueur_fruit_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_LIQUEUR_FRUIT);
                    case "am:seau_jus_de_fruit_blanc":
                    case "am:seau_jus_de_fruit_blanc_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_JUS_DE_FRUIT_BLANC);
                    case "am:seau_jus_de_fruit_jaune":
                    case "am:seau_jus_de_fruit_jaune_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_JUS_DE_FRUIT_JAUNE);
                    case "am:seau_jus_de_fruit_orange":
                    case "am:seau_jus_de_fruit_orange_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_JUS_DE_FRUIT_ORANGE);
                    case "am:seau_jus_de_fruit_rouge":
                    case "am:seau_jus_de_fruit_rouge_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_JUS_DE_FRUIT_ROUGE);
                    case "am:seau_jus_de_fruit_vert":
                    case "am:seau_jus_de_fruit_vert_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_VERRE_JUS_DE_FRUIT_VERT);
                }
            case "am:choppe_en_argile":
                switch(contenu) {
                    case "minecraft:water_bucket":
                    case "am:seau_d_eau_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_EAU);
                    case "minecraft:milk_bucket":
                    case "am:seau_de_lait_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_LAIT);
                    case "am:seau_de_bierre_blonde":
                    case "am:seau_de_bierre_blonde_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERRE_BLONDE);
                    case "am:seau_de_biere_brune":
                    case "am:seau_de_biere_brune_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERE_BRUNE);
                    case "am:seau_de_biere_rousse":
                    case "am:seau_de_biere_rousse_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERE_ROUSSE);
                    case "am:seau_de_hydromel":
                    case "am:seau_de_hydromel_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_HYDROMEL);
                    case "am:seau_hypocras":
                    case "am:seau_hypocras_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_HYPOCRAS);
                    case "am:seau_de_rhum":
                    case "am:seau_de_rhum_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_RHUM);
                    case "am:seau_de_vin_blanc":
                    case "am:seau_de_vin_blanc_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIN_BLANC);
                    case "am:seau_de_vin_rouge":
                    case "am:seau_de_vin_rouge_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIN_ROUGE);
                    case "am:seau_jagermeister":
                    case "am:seau_jagermeister_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_JAGERMEISTER);
                    case "am:seau_viperine":
                    case "am:seau_viperine_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIPERINE);
                    case "am:seau_rye":
                    case "am:seau_rye_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_RYE);
                    case "am:seau_nigorizake":
                    case "am:seau_nigorizake_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_NIGORIZAKE);
                    case "am:seau_liqueur_fruit":
                    case "am:seau_liqueur_fruit_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_LIQUEUR_FRUIT);
                    case "am:seau_jus_de_fruit_blanc":
                    case "am:seau_jus_de_fruit_blanc_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_JUS_DE_FRUIT_BLANC);
                    case "am:seau_jus_de_fruit_jaune":
                    case "am:seau_jus_de_fruit_jaune_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_JUS_DE_FRUIT_JAUNE);
                    case "am:seau_jus_de_fruit_orange":
                    case "am:seau_jus_de_fruit_orange_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_JUS_DE_FRUIT_ORANGE);
                    case "am:seau_jus_de_fruit_rouge":
                    case "am:seau_jus_de_fruit_rouge_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_JUS_DE_FRUIT_ROUGE);
                    case "am:seau_jus_de_fruit_vert":
                    case "am:seau_jus_de_fruit_vert_en_bois":
                        return new ItemStack(ModItems.CHOPPE_EN_ARGILE_JUS_DE_FRUIT_VERT);
                }
            case "am:verre_a_pied":
                switch(contenu) {
                    case "minecraft:water_bucket":
                    case "am:seau_d_eau_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_EAU);
                    case "minecraft:milk_bucket":
                    case "am:seau_de_lait_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_LAIT);
                    case "am:seau_de_bierre_blonde":
                    case "am:seau_de_bierre_blonde_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_BIERRE_BLONDE);
                    case "am:seau_de_biere_brune":
                    case "am:seau_de_biere_brune_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_BIERE_BRUNE);
                    case "am:seau_de_biere_rousse":
                    case "am:seau_de_biere_rousse_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_BIERE_ROUSSE);
                    case "am:seau_de_hydromel":
                    case "am:seau_de_hydromel_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_HYDROMEL);
                    case "am:seau_hypocras":
                    case "am:seau_hypocras_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_HYPOCRAS);
                    case "am:seau_de_rhum":
                    case "am:seau_de_rhum_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_RHUM);
                    case "am:seau_de_vin_blanc":
                    case "am:seau_de_vin_blanc_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_VIN_BLANC);
                    case "am:seau_de_vin_rouge":
                    case "am:seau_de_vin_rouge_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_VIN_ROUGE);
                    case "am:seau_jagermeister":
                    case "am:seau_jagermeister_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_JAGERMEISTER);
                    case "am:seau_viperine":
                    case "am:seau_viperine_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_VIPERINE);
                    case "am:seau_rye":
                    case "am:seau_rye_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_RYE);
                    case "am:seau_nigorizake":
                    case "am:seau_nigorizake_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_NIGORIZAKE);
                    case "am:seau_liqueur_fruit":
                    case "am:seau_liqueur_fruit_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_LIQUEUR_FRUIT);
                    case "am:seau_jus_de_fruit_blanc":
                    case "am:seau_jus_de_fruit_blanc_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_JUS_DE_FRUIT_BLANC);
                    case "am:seau_jus_de_fruit_jaune":
                    case "am:seau_jus_de_fruit_jaune_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_JUS_DE_FRUIT_JAUNE);
                    case "am:seau_jus_de_fruit_orange":
                    case "am:seau_jus_de_fruit_orange_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_JUS_DE_FRUIT_ORANGE);
                    case "am:seau_jus_de_fruit_rouge":
                    case "am:seau_jus_de_fruit_rouge_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_JUS_DE_FRUIT_ROUGE);
                    case "am:seau_jus_de_fruit_vert":
                    case "am:seau_jus_de_fruit_vert_en_bois":
                        return new ItemStack(ModItems.VERRE_A_PIED_JUS_DE_FRUIT_VERT);
                }
            case "am:bouteille_vide":
                switch(contenu) {
                    case "minecraft:water_bucket":
                    case "am:seau_d_eau_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_D_EAU);
                    case "minecraft:milk_bucket":
                    case "am:seau_de_lait_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_LAIT);
                    case "am:seau_alcool_pur":
                    case "am:seau_alcool_pur_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_ALCOOL_PUR);
                    case "am:seau_de_bierre_blonde":
                    case "am:seau_de_bierre_blonde_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_BIERRE_BLONDE);
                    case "am:seau_de_biere_brune":
                    case "am:seau_de_biere_brune_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_BIERE_BRUNE);
                    case "am:seau_de_biere_rousse":
                    case "am:seau_de_biere_rousse_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_BIERE_ROUSSE);
                    case "am:seau_de_hydromel":
                    case "am:seau_de_hydromel_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_HYDROMEL);
                    case "am:seau_hypocras":
                    case "am:seau_hypocras_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_HYPOCRAS);
                    case "am:seau_de_rhum":
                    case "am:seau_de_rhum_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_RHUM);
                    case "am:seau_de_vin_blanc":
                    case "am:seau_de_vin_blanc_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_VIN_BLANC);
                    case "am:seau_de_vin_rouge":
                    case "am:seau_de_vin_rouge_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_VIN_ROUGE);
                    case "am:seau_jagermeister":
                    case "am:seau_jagermeister_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_JAGERMEISTER);
                    case "am:seau_viperine":
                    case "am:seau_viperine_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_VIPERINE);
                    case "am:seau_rye":
                    case "am:seau_rye_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_RYE);
                    case "am:seau_nigorizake":
                    case "am:seau_nigorizake_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_NIGORIZAKE);
                    case "am:seau_liqueur_fruit":
                    case "am:seau_liqueur_fruit_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_LIQUEUR_FRUIT);
                    case "am:seau_jus_de_fruit_blanc":
                    case "am:seau_jus_de_fruit_blanc_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_JUS_DE_FRUIT_BLANC);
                    case "am:seau_jus_de_fruit_jaune":
                    case "am:seau_jus_de_fruit_jaune_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_JUS_DE_FRUIT_JAUNE);
                    case "am:seau_jus_de_fruit_orange":
                    case "am:seau_jus_de_fruit_orange_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_JUS_DE_FRUIT_ORANGE);
                    case "am:seau_jus_de_fruit_rouge":
                    case "am:seau_jus_de_fruit_rouge_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_JUS_DE_FRUIT_ROUGE);
                    case "am:seau_jus_de_fruit_vert":
                    case "am:seau_jus_de_fruit_vert_en_bois":
                        return new ItemStack(ModItems.BOUTEILLE_DE_JUS_DE_FRUIT_VERT);
                }
        }
        return new ItemStack(Items.AIR);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {

    }

    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        if (willHarvest) return true;
        return super.removedByPlayer(state, world, pos, player, willHarvest);
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
        worldIn.setBlockToAir(pos);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        ItemStack stack = new ItemStack(Item.getItemFromBlock(this));
        TileEntityFut te = (TileEntityFut) world.getTileEntity(pos);
        stack.getOrCreateSubCompound("BlockEntityTag").setString("contenu", te.getContenu());
        stack.getOrCreateSubCompound("BlockEntityTag").setInteger("charge", te.getCharge());
        drops.add(stack);
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, net.minecraft.util.math.RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        ItemStack stack = super.getPickBlock(state, target, world, pos, player);
        TileEntityFut te = (TileEntityFut) world.getTileEntity(pos);
        stack.getOrCreateSubCompound("BlockEntityTag").setString("contenu", te.getContenu());
        stack.getOrCreateSubCompound("BlockEntityTag").setInteger("charge", te.getCharge());
        return stack;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0,0,0,1,1,1);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityFut();
    }
}