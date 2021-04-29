/*package fr.archemod.items;

import fr.archemod.ArcheMod;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

public class VetementColore extends ItemBase {
    public String registryName;

    public int defaultColor;

    public VetementColore(String registryName) {
        super(registryName);
        this.registryName = registryName;
        this.defaultColor = 15790320;
    }

    public VetementColore(String registryName, int defaultColor) {
        super(registryName);
        this.registryName = registryName;
        this.defaultColor = defaultColor;
    }

    public void registerItemModel() {
        ArcheMod.proxy.registerItemRenderer(this, 0, this.registryName);
    }

    public boolean hasColor(ItemStack stack) {
        NBTTagCompound nbttagcompound = stack.getTagCompound();
        return (nbttagcompound != null && nbttagcompound.hasKey("display", 10)) ? nbttagcompound.getCompoundTag("display").hasKey("color", 3) : false;
    }

    public int getColor(ItemStack stack) {
        NBTTagCompound nbttagcompound = stack.getTagCompound();
        if (nbttagcompound != null) {
            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            if (nbttagcompound1 != null && nbttagcompound1.hasKey("color", 3))
                return nbttagcompound1.getInteger("color");
        }
        return this.defaultColor;
    }

    public void removeColor(ItemStack stack) {
        NBTTagCompound nbttagcompound = stack.getTagCompound();
        if (nbttagcompound != null) {
            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            if (nbttagcompound1.hasKey("color"))
                nbttagcompound1.removeTag("color");
        }
    }

    public void setColor(ItemStack stack, int color) {
        NBTTagCompound nbttagcompound = stack.getTagCompound();
        if (nbttagcompound == null) {
            nbttagcompound = new NBTTagCompound();
            stack.setTagCompound(nbttagcompound);
        }
        NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
        if (!nbttagcompound.hasKey("display", 10))
            nbttagcompound.setTag("display", (NBTBase)nbttagcompound1);
        nbttagcompound1.setInteger("color", color);
    }
}
*/