package fr.archemod.blocks.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityBarril extends TileEntity implements ITickable {
    private int waterAmount = 0;
    private int milkAmount = 0;

    public void addWater(int amount) {
        this.waterAmount += amount;
    }

    public void addMilk(int amount) {
        this.milkAmount += amount;
    }

    public void drinkWater() {
        this.waterAmount--;
    }

    public void drinkMilk() {
        this.milkAmount--;
    }

    public int getWaterAmount() {
        return this.waterAmount;
    }

    public int getMilkAmount() {
        return this.milkAmount;
    }

    @Override
    public void update() {
        if (!this.world.isRemote) {
            // Code pour la synchronisation entre les serveurs et les clients
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("WaterAmount", this.waterAmount);
        compound.setInteger("MilkAmount", this.milkAmount);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.waterAmount = compound.getInteger("WaterAmount");
        this.milkAmount = compound.getInteger("MilkAmount");
    }

    private int charge = 0;
    private String contenu = "";

    public int getCharge() {
        return this.charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getContenu() {
        return this.contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}

