package fr.archemod.blocks.tileentity;

import fr.archemod.blocks.container.ContainerPiegeLoup;
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
import net.minecraft.util.NonNullList;

import java.util.Date;
import java.util.Objects;

public class TileEntityPiegeLoup extends TileEntityBlockInventory {
    public TileEntityPiegeLoup() { super(); }

    @Override
    public String getGuiID() {
        return Reference.MOD_ID + ":piege_loup";
    }

    @Override
    public String getName() {
        return "Piège à Loup";
    }

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
            case "appat_chasse_carnivore":
                appat = ModItems.APPAT_CHASSE_CARNIVORE;
                break;
            case "appat_chasse_herbivore":
                appat = ModItems.APPAT_CHASSE_HERBIVORE;
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
            while(ecart > Reference.DELAI_RECOLTE_CHASSE && appat != null && enCours) {
                ecart = ecart - Reference.DELAI_RECOLTE_CHASSE;
                getRecolte();
            }
        }
    }

    @Override
    public void closeInventory(EntityPlayer player) {
        reloadAppat();
    }

    @Override
    public int getSizeInventory() {
        return 7;
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
    public boolean isEmpty() {
        for (ItemStack itemstack : this.stacks)
            if (!itemstack.isEmpty())
                return false;
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 50;
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
        return new ContainerPiegeLoup(playerInventory, this);
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

    private void getRecolte() {
        ItemStack loot = findLoot();
        for(int i=1; i<getSizeInventory(); i++) {
            if(getStackInSlot(i).isEmpty()) {
                stacks.set(i, loot);
                break;
            }
        }
        enCours = false;
        reloadAppat();
    }

    private void reloadAppat() {
        if(enCours || !canReload()) return;
        if(!getStackInSlot(0).isEmpty()) {
            appat = stacks.get(0).getItem();
            time = new Date().getTime();
            enCours = true;
            if(Objects.equals(stacks.get(0).getItem(), ModItems.APPAT_PECHE) && getStackInSlot(0).getCount() > 2) {
                if(getStackInSlot(0).getCount() < 4) stacks.set(0, ItemStack.EMPTY);
                else stacks.get(0).shrink(3);
            }
            else {
                if(getStackInSlot(0).getCount() < 2) stacks.set(0, ItemStack.EMPTY);
                else stacks.get(0).shrink(1);
            }
        } else appat = null;
    }

    private boolean canReload() {
        if(stacks.get(0).isEmpty()) return false;
        return true;
    }

    private ItemStack findLoot() {
        int rand = (int)(Math.random() * 100);
        if(appat != null) {
            if (Objects.equals(appat, ModItems.APPAT_CHASSE_HERBIVORE)) {
                if(rand < 15) return new ItemStack(ModItems.CARCASSE_BOVIDE, 1);
                if(rand < 30) return new ItemStack(ModItems.CARCASSE_CANIDE, 1);
                if(rand < 35) return new ItemStack(ModItems.CARCASSE_CERVIDE, 1);
                if(rand < 45) return new ItemStack(ModItems.CARCASSE_RONGEUR, 1);
                if(rand < 55) return new ItemStack(ModItems.CARCASSE_URSIDE, 1);
                if(rand < 65) return new ItemStack(ModItems.CARCASSE_VOLAILLE, 1);
            }
            if (Objects.equals(appat, ModItems.APPAT_CHASSE_CARNIVORE)) {
                if(rand < 15) return new ItemStack(ModItems.CARCASSE_BOVIDE, 1);
                if(rand < 30) return new ItemStack(ModItems.CARCASSE_CANIDE, 1);
                if(rand < 35) return new ItemStack(ModItems.CARCASSE_CERVIDE, 1);
                if(rand < 45) return new ItemStack(ModItems.CARCASSE_RONGEUR, 1);
                if(rand < 55) return new ItemStack(ModItems.CARCASSE_URSIDE, 1);
                if(rand < 65) return new ItemStack(ModItems.CARCASSE_VOLAILLE, 1);
            }
        }
        return ItemStack.EMPTY;
    }
}