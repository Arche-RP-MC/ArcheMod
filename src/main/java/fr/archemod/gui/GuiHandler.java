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
            case 0: //Bourse
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Bourse", 20, 6));
            case 1: //Panier en osier
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Panier en osier", 10, 6));
            case 2: //Placard HRP
            case 3: //Piege à loup
            case 4: //Porte-Manteau
            case 5: //Ecrin à bijoux
                return new ContainerBlockSlot(player.inventory, (TileEntityBlockInventory) world.getTileEntity(new BlockPos(x, y, z)));
            case 8: //Sacoche
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Sacoche", 25, 6));
            case 9: //Grand sac
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Grand sac", 50, 6));
            case 12: //Bijou Serti
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6,"Bijou Serti", 3,3));
            case 13: //Porte-Clef
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Porte-clef", 1, 6));
            case 14: //Enveloppe
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 3, "Enveloppe", 1, 3));
            case 15: //Bocal à insecte
                return new ContainerItemSlot(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 3, "Bocal à insectes", 1, 3));
            //case 21:
            //    return new ContainerCasierPoisson(player.inventory, (TileEntityCasierPoisson) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case 0: //Bourse
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Bourse", 20, 6), GUI6);
            case 1: //Panier en osier
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Panier en osier", 10, 6), GUI6);
            case 2: //Placard HRP
            case 3: //Piege à loup
                return new BlockContainerGUI(player.inventory, (TileEntityBlockInventory) world.getTileEntity(new BlockPos(x, y, z)), GUI3);
            case 4: //Porte-Manteau
                return new BlockContainerGUI(player.inventory, (TileEntityBlockInventory) world.getTileEntity(new BlockPos(x, y, z)), GUI6);
            case 5: //Ecrin à bijoux
                return new BlockContainerGUI(player.inventory, (TileEntityBlockInventory) world.getTileEntity(new BlockPos(x, y, z)), GUI9);
            case 6:
                TileEntity fishCase = world.getTileEntity(new BlockPos(x, y, z));
                if (fishCase instanceof TileEntityCasierPoisson) {
                    return new CasierPoissonGUI(player.inventory, (TileEntityCasierPoisson) fishCase);
                } else {
                    return null;
                }
            case 8: //Sacoche
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Sacoche", 25, 6), GUI6);
            case 9: //Grand sac
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6, "Grand sac", 50, 6), GUI6);
            case 12: //Bijou Serti
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 6,"Bijou Serti",3, 3), GUI3);
            case 13: //Porte Clef
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 12, "Porte-clef", 1, 6), GUI6);
            case 14: //Enveloppe
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 3, "Enveloppe", 1, 3), GUI3);
            case 15: //Bocal à insecte
                return new ItemContainerGUI(player.inventory, new ContainerItemInventory(player.getHeldItem(EnumHand.MAIN_HAND), 3, "Bocal à insectes", 1, 3),GUI3);
            case 20: //Fut
                return new FutGUI(player.inventory, (TileEntityFut) world.getTileEntity(new BlockPos(x, y, z)));
            case 21: //Casier à poisson
                return new CasierPoissonGUI(player.inventory, (TileEntityCasierPoisson) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }
}
