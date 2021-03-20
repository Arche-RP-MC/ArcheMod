package fr.archemod.blocks.tileentity;

import fr.archemod.blocks.baril.BarilType;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.NonNullList;

import java.util.Date;

public class TileEntityBlockBaril extends TileEntity {

    private int quantity;
    private String type;

    public TileEntityBlockBaril(int defaultQuantity, BarilType type){
        super();
        this.quantity = defaultQuantity;
        this.type = type.name();
    }

    public void setQuantity(int value){
        this.quantity = value;
        markDirty();
    }

    public int getQuantity(){
        return quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        markDirty();
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.quantity = compound.getInteger("quantity");
        this.type = compound.getString("type");
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("quantity", quantity);
        compound.setString("type", type);
        return compound;
    }

    public NBTTagCompound getUpdateTag() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setInteger("quantity", this.getQuantity());
        nbt.setString("type", type);

        return nbt;
    }

    public void handleUpdateTag(NBTTagCompound nbt) {
        super.handleUpdateTag(nbt);
        this.quantity = nbt.getInteger("quantity");
        this.type = nbt.getString("type");

    }
}
