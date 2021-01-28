package fr.archemod.gui;

import fr.archemod.blocks.container.ContainerEcrinABijoux;
import fr.archemod.blocks.container.ContainerFishCase;
import fr.archemod.blocks.container.ContainerPlacardHRP;
import fr.archemod.blocks.container.ContainerTable;
import fr.archemod.blocks.tileentity.TileEntityEcrinABijoux;
import fr.archemod.blocks.tileentity.TileEntityFishCase;
import fr.archemod.blocks.tileentity.TileEntityPlacardHRP;
import fr.archemod.blocks.tileentity.TileEntityTable;
import fr.archemod.fiche.container.ContainerFichePersonnage;
import fr.archemod.fiche.gui.GuiFichePersonnage;
import fr.archemod.fiche.inventory.InventoryFichePersonnage;
import fr.archemod.items.Bourse;
import fr.archemod.items.PanierEnOsier;
import fr.archemod.items.inventory.InventoryBourse;
import fr.archemod.items.inventory.InventoryPanierEnOsier;
import fr.archemod.items.inventory.container.ContainerBourse;
import fr.archemod.items.inventory.container.ContainerPanierEnOsier;
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
                TileEntity tile = world.getTileEntity(new BlockPos(x,y,z));
                if(tile instanceof TileEntityPlacardHRP){
                    return new ContainerPlacardHRP(player.inventory,(TileEntityPlacardHRP)tile);
                 } else {
                    return null;
                }
            case 3: //Table
                TileEntity tileTable = world.getTileEntity(new BlockPos(x,y,z));
                if(tileTable instanceof TileEntityTable){
                    return new ContainerTable(player.inventory,(TileEntityTable) tileTable);
                } else {
                    return null;
                }
            case 4: //Fiche personnage
                return new ContainerFichePersonnage(player.inventory, new InventoryFichePersonnage(28));
            case 5: //Ecrin A Bijoux
                TileEntity ecrinABijoux = world.getTileEntity(new BlockPos(x,y,z));
                return new ContainerEcrinABijoux(player.inventory,(TileEntityEcrinABijoux)ecrinABijoux);
            case 6:
                TileEntity fishCase = world.getTileEntity(new BlockPos(x, y, z));
                if(fishCase instanceof TileEntityFishCase){
                    return new ContainerFishCase(player.inventory, (TileEntityFishCase) fishCase);
                } else {
                    return null;
                }
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
                TileEntity tile = world.getTileEntity(new BlockPos(x,y,z));
                if(tile instanceof TileEntityPlacardHRP){
                    return new GuiPlacardHRP(player.inventory,(TileEntityPlacardHRP)tile);
                } else {
                    return null;
                }
            case 3: //Table
                TileEntity tileTable = world.getTileEntity(new BlockPos(x,y,z));
                if(tileTable instanceof TileEntityTable){
                    return new GuiTable(player.inventory,(TileEntityTable) tileTable);
                } else {
                    return null;
                }
            case 4: //Fiche personnage
                return new GuiFichePersonnage(player.inventory, new InventoryFichePersonnage(28));
            case 5: //Ecrin A Bijoux
                TileEntity ecrinABijoux = world.getTileEntity(new BlockPos(x,y,z));
                if(ecrinABijoux instanceof TileEntityEcrinABijoux){
                    return new GuiEcrinABijoux(player.inventory,(TileEntityEcrinABijoux) ecrinABijoux);
                } else {
                    return null;
                }
            case 6:
                TileEntity fishCase = world.getTileEntity(new BlockPos(x, y, z));
                if(fishCase instanceof TileEntityFishCase){
                    return new GuiFishCase(player.inventory, (TileEntityFishCase) fishCase);
                } else {
                    return null;
                }
        }
        return null;
    }

}
