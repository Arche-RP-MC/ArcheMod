package fr.archemod.gui;

import fr.archemod.blocks.container.*;
import fr.archemod.blocks.tileentity.*;
import fr.archemod.fiche.container.ContainerFichePersonnage;
import fr.archemod.fiche.gui.GuiFichePersonnage;
import fr.archemod.fiche.inventory.InventoryFichePersonnage;
import fr.archemod.items.*;
import fr.archemod.items.inventory.*;
import fr.archemod.items.inventory.container.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0: //Bourse
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Bourse)) return null;
                return new ContainerBourse(player.inventory, new InventoryBourse(player.getHeldItem(EnumHand.MAIN_HAND), 6));
            case 1: //Panier en osier
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof PanierEnOsier)) return null;
                return new ContainerPanierEnOsier(player.inventory, new InventoryPanierEnOsier(player.getHeldItem(EnumHand.MAIN_HAND), 12));
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
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Sacoche)) return null;
                return new ContainerSacoche(player.inventory, new InventorySacoche(player.getHeldItem(EnumHand.MAIN_HAND), 6));
            case 9: //GrandSac
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof GrandSac)) return null;
                return new ContainerGrandSac(player.inventory, new InventoryGrandSac(player.getHeldItem(EnumHand.MAIN_HAND), 6));

         /*case 10: //SechoirViande
                TileEntity TileSechoirViande2 = world.getTileEntity(new BlockPos(x,y,z));
                if(TileSechoirViande2 instanceof TileEntityFourSechoir2){
                    return new ContainerSechoirViande(player.inventory,(TileEntityFourSechoir2) TileSechoirViande2);
                } else {
                    return null;
                }*/
            case 12: //BijouSerti
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof BijouSerti)) return null;
                return new ContainerBijouSerti(player.inventory, new InventoryBijouSerti(player.getHeldItem(EnumHand.MAIN_HAND), 6));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0:
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Bourse)) return null;
                return new GuiBourse(player.inventory, new InventoryBourse(player.getHeldItem(EnumHand.MAIN_HAND), 6));
            case 1: //Panier en osier
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof PanierEnOsier)) return null;
                return new GuiPanierEnOsier(player.inventory, new InventoryPanierEnOsier(player.getHeldItem(EnumHand.MAIN_HAND), 12));
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
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof Sacoche)) return null;
                return new GuiSacoche(player.inventory, new InventorySacoche(player.getHeldItem(EnumHand.MAIN_HAND), 6));
            case 9:
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof GrandSac)) return null;
                return new GuiGrandSac(player.inventory, new InventoryGrandSac(player.getHeldItem(EnumHand.MAIN_HAND), 6));

            /*case 10:
                TileEntity TileSechoirViande2 = world.getTileEntity(new BlockPos(x,y,z));
                if(TileSechoirViande2 instanceof TileEntityFourSechoir2){
                    return new GuiSechoirViande(player.inventory,(TileEntityFourSechoir2) TileSechoirViande2);
                } else {
                    return null;
                }*/
            //10 & 11 font crash le client
            case 12:
                // The last parameter must be a multiple of 9 (e.g: 9, 18, 27, 54)
                // Condition to check if the player has the right item in hand
                player.getHeldItem(EnumHand.MAIN_HAND);
                if (!(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof BijouSerti)) return null;
                return new GuiBijouSerti(player.inventory, new InventoryBijouSerti(player.getHeldItem(EnumHand.MAIN_HAND), 6));

        }
        return null;
    }


}
