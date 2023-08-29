package fr.archemod.blocks;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.container.ContainerFut;
import fr.archemod.blocks.tileentity.TileEntityBarril;
import fr.archemod.init.ModItems;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockFut extends BlockBaseOriented implements ITileEntityProvider {

    public BlockFut(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        playerIn.openGui(ArcheMod.INSTANCE, 20, worldIn, pos.getX(), pos.getY(), pos.getZ());
        /*if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof TileEntityBarril) {
                TileEntityBarril tileEntityBarril = (TileEntityBarril) tileEntity;
                ItemStack itemStack = playerIn.getHeldItem(hand);
                if (itemStack.getItem() == Items.WATER_BUCKET && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("eau");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == Items.MILK_BUCKET && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("lait");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == ModItems.SEAU_DE_BIERE_BRUNE && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("biere brune");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == ModItems.SEAU_DE_BIERE_ROUSSE && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("biere rousse");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == ModItems.SEAU_DE_BIERRE_BLONDE && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("biere blonde");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == ModItems.SEAU_DE_VIN_BLANC && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("vin blanc");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == ModItems.SEAU_DE_VIN_ROUGE && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("vin rouge");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == ModItems.SEAU_DE_RHUM && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("rhum");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));
                } else if (itemStack.getItem() == ModItems.SEAU_DE_HYDROMEL && tileEntityBarril.getCharge() == 0) {
                    tileEntityBarril.setCharge(15);
                    tileEntityBarril.setContenu("hydromel");
                    itemStack.shrink(1);
                    playerIn.addItemStackToInventory(new ItemStack(Items.BUCKET));

                } else if (itemStack.getItem() == Items.STICK) {
                    playerIn.sendMessage(new TextComponentString("Contenu : " + tileEntityBarril.getContenu() + ", charges restantes : " + tileEntityBarril.getCharge()));

                } else if (itemStack.getItem() == ModItems.VERRE_A_PIED) {
                    if (tileEntityBarril.getCharge() > 0) {
                        tileEntityBarril.setCharge(tileEntityBarril.getCharge() - 1);
                        itemStack.shrink(1);
                        if (tileEntityBarril.getContenu().equals("eau")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_EAU, 1, 0));
                        } else if (tileEntityBarril.getContenu().equals("lait")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_LAIT));
                        } else if (tileEntityBarril.getContenu().equals("biere brune")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_BIERE_BRUNE));
                        } else if (tileEntityBarril.getContenu().equals("biere rousse")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_BIERE_ROUSSE));
                        } else if (tileEntityBarril.getContenu().equals("biere blonde")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_BIERRE_BLONDE));
                        } else if (tileEntityBarril.getContenu().equals("vin blanc")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_VIN_BLANC));
                        } else if (tileEntityBarril.getContenu().equals("vin rouge")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_VIN_ROUGE));
                        } else if (tileEntityBarril.getContenu().equals("rhum")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_RHUM));
                        } else if (tileEntityBarril.getContenu().equals("hydromel")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.VERRE_A_PIED_HYDROMEL));
                        }

                    } else {
                        playerIn.sendMessage(new TextComponentString("Le baril est vide"));
                    }
                } else if (itemStack.getItem() == ModItems.CHOPPE_EN_VERRE) {
                    if (tileEntityBarril.getCharge() > 0) {
                        tileEntityBarril.setCharge(tileEntityBarril.getCharge() - 1);
                        itemStack.shrink(1);
                        if (tileEntityBarril.getContenu().equals("eau")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_EAU, 1, 0));
                        } else if (tileEntityBarril.getContenu().equals("lait")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_LAIT));
                        } else if (tileEntityBarril.getContenu().equals("biere brune")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERE_BRUNE));
                        } else if (tileEntityBarril.getContenu().equals("biere rousse")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERE_ROUSSE));
                        } else if (tileEntityBarril.getContenu().equals("biere blonde")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_BIERRE_BLONDE));
                        } else if (tileEntityBarril.getContenu().equals("vin blanc")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_VIN_BLANC));
                        } else if (tileEntityBarril.getContenu().equals("vin rouge")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_VIN_ROUGE));
                        } else if (tileEntityBarril.getContenu().equals("rhum")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_RHUM));
                        } else if (tileEntityBarril.getContenu().equals("hydromel")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_VERRE_HYDROMEL));
                        }
                    } else {
                        playerIn.sendMessage(new TextComponentString("Le baril est vide"));
                    }


                } else if (itemStack.getItem() == ModItems.CHOPPE_EN_ARGILE) {
                    if (tileEntityBarril.getCharge() > 0) {
                        tileEntityBarril.setCharge(tileEntityBarril.getCharge() - 1);
                        itemStack.shrink(1);
                        if (tileEntityBarril.getContenu().equals("eau")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_EAU, 1, 0));
                        } else if (tileEntityBarril.getContenu().equals("lait")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_LAIT));
                        } else if (tileEntityBarril.getContenu().equals("biere brune")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERE_BRUNE));
                        } else if (tileEntityBarril.getContenu().equals("biere rousse")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERE_ROUSSE));
                        } else if (tileEntityBarril.getContenu().equals("biere blonde")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_BIERRE_BLONDE));
                        } else if (tileEntityBarril.getContenu().equals("vin blanc")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIN_BLANC));
                        } else if (tileEntityBarril.getContenu().equals("vin rouge")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_VIN_ROUGE));
                        } else if (tileEntityBarril.getContenu().equals("rhum")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_RHUM));
                        } else if (tileEntityBarril.getContenu().equals("hydromel")) {
                            playerIn.addItemStackToInventory(new ItemStack(ModItems.CHOPPE_EN_ARGILE_HYDROMEL));
                        }

                    } else {
                        playerIn.sendMessage(new TextComponentString("Le baril est vide"));
                    }
                }
            }
        }*/
        return true;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {

    }

    @Override
    public ItemStack getPickBlock(IBlockState state, net.minecraft.util.math.RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        ItemStack stack = super.getPickBlock(state, target, world, pos, player);
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof TileEntityBarril) {
            TileEntityBarril tileEntityBarril = (TileEntityBarril) tileEntity;
            NBTTagCompound compound = new NBTTagCompound();
            compound.setString("contenu", tileEntityBarril.getContenu());
            compound.setInteger("charge", tileEntityBarril.getCharge());
            stack.setTagCompound(compound);
        }
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
        return new ContainerFut("fut_vide", 15);
    }
}