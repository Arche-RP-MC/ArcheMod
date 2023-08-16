package fr.archemod.gui;

import fr.archemod.blocks.container.*;
import fr.archemod.blocks.tileentity.*;
import fr.archemod.fiche.container.ContainerFichePersonnage;
import fr.archemod.fiche.gui.GuiFichePersonnage;
import fr.archemod.fiche.inventory.InventoryFichePersonnage;
import fr.archemod.items.*;
import fr.archemod.items.inventory.*;
import fr.archemod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    public static final ResourceLocation GUI36 = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/generic_36.png");
    public static final ResourceLocation GUI3 = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/generic_3.png");

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0: //Bourse
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Bourse)) return null;
                return new ItemContainer(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Bourse", 20, 6));
            case 1: //Panier en osier
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof PanierEnOsier)) return null;
                return new ItemContainer(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Panier en osier", 10, 6));
            case 2: //Placard  HRP
                TileEntity tile = world.getTileEntity(new BlockPos(x, y, z));
                if (tile instanceof TileEntityPlacardHRP) {
                    return new ContainerPlacardHRP(player.inventory, (TileEntityPlacardHRP) tile);
                } else {
                    return null;
                }
            case 3: //Table
                TileEntity tileTable = world.getTileEntity(new BlockPos(x, y, z));
                if (tileTable instanceof TileEntityTable) {
                    return new ContainerTable(player.inventory, (TileEntityTable) tileTable);
                } else {
                    return null;
                }
            case 4: //Fiche personnage
                return new ContainerFichePersonnage(player.inventory, new InventoryFichePersonnage(28));
            case 5: //Ecrin A Bijoux
                TileEntity ecrinABijoux = world.getTileEntity(new BlockPos(x, y, z));
                return new ContainerEcrinABijoux(player.inventory, (TileEntityEcrinABijoux) ecrinABijoux);
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
            case 8: //Sacoche
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Sacoche)) return null;
                return new ItemContainer(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Sacoche", 25, 6));
            case 9: //GrandSac
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof GrandSac)) return null;
                return new ItemContainer(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Grand sac", 50, 6));

         /*case 10: //SechoirViande
                TileEntity TileSechoirViande2 = world.getTileEntity(new BlockPos(x,y,z));
                if(TileSechoirViande2 instanceof TileEntityFourSechoir2){
                    return new ContainerSechoirViande(player.inventory,(TileEntityFourSechoir2) TileSechoirViande2);
                } else {
                    return null;
                }*/
            case 12: //BijouSerti
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof BijouSerti)) return null;
                return new ItemContainer(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6,"Bijou Serti", 3,3));
            case 13: //Porte Clef
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof PorteClef)) return null;
                return new ItemContainer(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Porte-clef", 1, 6));
            case 14: //Enveloppe
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Enveloppe)) return null;
                return new ItemContainer(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 3, "Enveloppe", 1, 3));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0:
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Bourse)) return null;
                return new ItemContainerGUI36(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Bourse", 20, 6), GUI36);
            case 1: //Panier en osier
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof PanierEnOsier)) return null;
                return new ItemContainerGUI36(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Panier en osier", 10, 6), GUI36);
            case 2: //Placard  HRP
                TileEntity tile = world.getTileEntity(new BlockPos(x, y, z));
                if (tile instanceof TileEntityPlacardHRP) {
                    return new GuiPlacardHRP(player.inventory, (TileEntityPlacardHRP) tile);
                } else {
                    return null;
                }
            case 3: //Table
                TileEntity tileTable = world.getTileEntity(new BlockPos(x, y, z));
                if (tileTable instanceof TileEntityTable) {
                    return new GuiTable(player.inventory, (TileEntityTable) tileTable);
                } else {
                    return null;
                }
            case 4: //Fiche personnage
                return new GuiFichePersonnage(player.inventory, new InventoryFichePersonnage(28));
            case 5: //Ecrin A Bijoux
                TileEntity ecrinABijoux = world.getTileEntity(new BlockPos(x, y, z));
                if (ecrinABijoux instanceof TileEntityEcrinABijoux) {
                    return new GuiEcrinABijoux(player.inventory, (TileEntityEcrinABijoux) ecrinABijoux);
                } else {
                    return null;
                }
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
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Sacoche)) return null;
                return new ItemContainerGUI36(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Sacoche", 25, 6), GUI36);
            case 9:
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof GrandSac)) return null;
                return new ItemContainerGUI36(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Grand sac", 50, 6), GUI36);
            /*case 10:
                TileEntity TileSechoirViande2 = world.getTileEntity(new BlockPos(x,y,z));
                if(TileSechoirViande2 instanceof TileEntityFourSechoir2){
                    return new GuiSechoirViande(player.inventory,(TileEntityFourSechoir2) TileSechoirViande2);
                } else {
                    return null;
                }*/
            //10 & 11 font crash le client
            case 12:
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof BijouSerti)) return null;
                return new ItemContainerGUI3(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6,"Bijou Serti",3, 3), GUI3);
            case 13: //Porte Clef
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof PorteClef)) return null;
                return new ItemContainerGUI36(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Porte-clef", 1, 6), GUI36);
            case 14: //Enveloppe
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Enveloppe)) return null;
                return new ItemContainerGUI3(player.inventory, new ItemContainerInventory(player.getHeldItem(EnumHand.MAIN_HAND), 3, "Enveloppe", 1, 3), GUI3);
        }
        return null;
    }
}
