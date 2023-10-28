package fr.archemod.blocks.tileentity;

import fr.archemod.blocks.container.ContainerNasse;
import fr.archemod.init.ModBlocks;
import fr.archemod.init.ModItems;
import fr.archemod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Mod;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class TileEntityNasse extends TileEntityBlockInventory {

    private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(7, ItemStack.EMPTY);
    private boolean enCours = false;
    private Item appat = null;
    private long time = 0;

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.stacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
        if (!this.checkLootAndRead(compound))
            ItemStackHelper.loadAllItems(compound, this.stacks);

        time = compound.getLong("time");
        enCours = compound.getBoolean("enCours");
        String tempo = compound.getString("appat");
        switch(tempo) {
            case "insecte_ver_de_terre":
                appat = ModItems.INSECTE_VER_DE_TERRE;
                break;
            case "insecte_asticot":
                appat = ModItems.INSECTE_ASTICOT;
                break;
            case "insecte_larve":
                appat = ModItems.INSECTE_LARVE;
                break;
            case "insecte_ver_de_farine":
                appat = ModItems.INSECTE_VER_DE_FARINE;
                break;
            default:
                appat = null;
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        if (!this.checkLootAndWrite(compound))
            ItemStackHelper.saveAllItems(compound, this.stacks);

        compound.setLong("time", time);
        compound.setBoolean("enCours", enCours);
        if(appat != null) compound.setString("appat", appat.getRegistryName().getPath());
        else compound.setString("appat", "null");

        return compound;
    }

    @Override
    public void openInventory(EntityPlayer player) {
        if(enCours) {
            Date date = new Date();
            long ecart = date.getTime() - time;
            while(ecart > Reference.DELAI_RECOLTE_PECHE && appat != null && enCours) {
                ecart = ecart - Reference.DELAI_RECOLTE_PECHE;
                getRecolte();
            }
        }
    }

    @Override
    public void closeInventory(EntityPlayer player) {
        reloadAppat();
    }

    @Override
    public int getSlotInRow() {
        return 1;
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return null;
    }

    @Override
    public int getSizeInventory() {
        return 7;
    }

    @Override
    public boolean isEmpty() {
        for (ItemStack itemstack : this.stacks)
            if (!itemstack.isEmpty())
                return false;
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }


    @Override
    public void handleUpdateTag(NBTTagCompound tag) {
        this.readFromNBT(tag);
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return ItemStackHelper.getAndSplit(this.stacks, index, count);
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerNasse(playerInventory, this);
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(this.pos, 0, this.getUpdateTag());
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        this.stacks.set(index, stack);

        if (stack.getCount() > this.getInventoryStackLimit()) {
            stack.setCount(this.getInventoryStackLimit());
        }
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return stacks.get(slot);
    }

    @Override
    public String getGuiID() {
        return "am:casier_a_poisson";
    }

    @Override
    public String getName() {
        return "Casier à poisson";
    }

    private void getRecolte() {
        Item item = findLoot();
        for(int i=1; i<getSizeInventory(); i++) {
            if(getStackInSlot(i).isEmpty()) {
                stacks.set(i, new ItemStack(item));
                break;
            }
            if(Objects.equals(getStackInSlot(i).getItem(), item)) {
                stacks.get(i).shrink(-1);
                break;
            }
        }
        enCours = false;
        reloadAppat();
    }

    private void reloadAppat() {
        if(enCours) return;
        if(!getStackInSlot(0).isEmpty()) {
            appat = stacks.get(0).getItem();
            time = new Date().getTime();
            enCours = true;
            if(getStackInSlot(0).getCount() < 2) stacks.set(0, ItemStack.EMPTY);
            else stacks.get(0).shrink(1);
        } else appat = null;
    }

    private Item findLoot() {
        int rand = (int)(Math.random() * 100);
        if(appat !=null) {
            if (Objects.equals(appat, ModItems.INSECTE_VER_DE_TERRE) || Objects.equals(appat, ModItems.INSECTE_LARVE) || Objects.equals(appat, ModItems.INSECTE_ASTICOT) || Objects.equals(appat, ModItems.INSECTE_VER_DE_FARINE)) {
                if(rand < 15) return Item.getItemFromBlock(ModBlocks.ALGUES);
                if(rand < 30) return ModItems.CARCASSE_DE_POISSON;
                if(rand < 40) return ModItems.CRABE;
                if(rand < 50) return ModItems.CALAMAR;
                if(rand < 60) return ModItems.POULPE;
                if(rand < 65) return ModItems.HOMARD;
                if(rand < 68) return ModItems.NAUTILE;
                if(rand < 75) return ModItems.SARDINE;
                if(rand < 78) return ModItems.COQUILLE_SAINT_JACQUES;
                if(rand < 85) return ModItems.ROUGET;
                if(rand < 88) return ModItems.HUITRE;
                if(rand < 91) return ModItems.MOULE_CRUSTACE;
                if(rand < 94) return ModItems.ORMEAUX;
            }
        }
        return ItemStack.EMPTY.getItem();
    }
}