package fr.archemod.gui;

import fr.archemod.blocks.container.*;
import fr.archemod.blocks.tileentity.*;
import fr.archemod.items.container.ContainerItemInventory;
import fr.archemod.items.container.ContainerItemSlot;
import fr.archemod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    public static final ResourceLocation GUI6 = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/generic_36.png");
    public static final ResourceLocation GUI3 = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/generic_3.png");
    public static final ResourceLocation GUI9 = new ResourceLocation("textures/gui/container/generic_54.png");

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0:
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Bourse", 20, 6));
            case 1:
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Panier en osier", 10, 6));
            case 2:
                return new ContainerBlockSlot(player.inventory, (ContainerBlockInventory) world.getTileEntity(new BlockPos(x, y, z)));
            case 3: //Table
                TileEntity tileTable = world.getTileEntity(new BlockPos(x, y, z));
                if (tileTable instanceof TileEntityTable) {
                    return new ContainerTable(player.inventory, (TileEntityTable) tileTable);
                } else {
                    return null;
                }
            case 5:
                return new ContainerBlockSlot(player.inventory, (ContainerBlockInventory) world.getTileEntity(new BlockPos(x, y, z)));
            case 6:
                TileEntity fishCase = world.getTileEntity(new BlockPos(x, y, z));
                if (fishCase instanceof TileEntityFishCase) {
                    return new ContainerFishCase(player.inventory, (TileEntityFishCase) fishCase);
                } else {
                    return null;
                }
            case 7:
                TileEntity tileBaril = world.getTileEntity(new BlockPos(x, y, z));
                if (tileBaril instanceof TileEntityBaril) {
                    return new ContainerBaril(player.inventory, (TileEntityBaril) tileBaril);
                } else {
                    return null;
                }
            case 8:
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Sacoche", 25, 6));
            case 9:
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Grand sac", 50, 6));
         /*case 10: //SechoirViande
                TileEntity TileSechoirViande2 = world.getTileEntity(new BlockPos(x,y,z));
                if(TileSechoirViande2 instanceof TileEntityFourSechoir2){
                    return new ContainerSechoirViande(player.inventory,(TileEntityFourSechoir2) TileSechoirViande2);
                } else {
                    return null;
                }*/
            case 12:
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6,"Bijou Serti", 3,3));
            case 13:
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Porte-clef", 1, 6));
            case 14:
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 3, "Enveloppe", 1, 3));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0:
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Bourse", 20, 6), GUI6);
            case 1:
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Panier en osier", 10, 6), GUI6);
            case 2:
                return new BlockContainerGUI(player.inventory, (ContainerBlockInventory) world.getTileEntity(new BlockPos(x, y, z)), GUI3);
            case 3: //Table
                TileEntity tileTable = world.getTileEntity(new BlockPos(x, y, z));
                if (tileTable instanceof TileEntityTable) {
                    return new GuiTable(player.inventory, (TileEntityTable) tileTable);
                } else {
                    return null;
                }
            case 5:
                return new BlockContainerGUI(player.inventory, (ContainerBlockInventory) world.getTileEntity(new BlockPos(x, y, z)), GUI9);
            case 6:
                TileEntity fishCase = world.getTileEntity(new BlockPos(x, y, z));
                if (fishCase instanceof TileEntityFishCase) {
                    return new GuiFishCase(player.inventory, (TileEntityFishCase) fishCase);
                } else {
                    return null;
                }
            case 7:
                TileEntity tileBaril = world.getTileEntity(new BlockPos(x, y, z));
                if (tileBaril instanceof TileEntityBaril) {
                    return new GuiBaril((TileEntityBaril) tileBaril, player.inventory, player);
                } else {
                    return null;
                }
            case 8:
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Sacoche", 25, 6), GUI6);
            case 9:
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Grand sac", 50, 6), GUI6);
            /*case 10:
                TileEntity TileSechoirViande2 = world.getTileEntity(new BlockPos(x,y,z));
                if(TileSechoirViande2 instanceof TileEntityFourSechoir2){
                    return new GuiSechoirViande(player.inventory,(TileEntityFourSechoir2) TileSechoirViande2);
                } else {
                    return null;
                }*/
            //10 & 11 font crash le client
            case 12:
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6,"Bijou Serti",3, 3), GUI3);
            case 13: //Porte Clef
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Porte-clef", 1, 6), GUI6);
            case 14:
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 3, "Enveloppe", 1, 3), GUI3);
            case 20:
                return new FutGUI(player.inventory, (ContainerFut) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }
}
