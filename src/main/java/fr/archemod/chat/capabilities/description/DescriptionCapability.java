package fr.archemod.chat.capabilities.description;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class DescriptionCapability implements ICapabilitySerializable<NBTBase> {

    protected IDescription description;

    public DescriptionCapability(){
        description = new Description();
    }

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == DescriptionStorage.I_DESCRIPTION_CAPABILITY;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return this.hasCapability(capability,facing) ? DescriptionStorage.I_DESCRIPTION_CAPABILITY.cast(this.description) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return DescriptionStorage.I_DESCRIPTION_CAPABILITY.writeNBT(this.description,null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        DescriptionStorage.I_DESCRIPTION_CAPABILITY.readNBT(this.description,null,nbt);
    }

}
