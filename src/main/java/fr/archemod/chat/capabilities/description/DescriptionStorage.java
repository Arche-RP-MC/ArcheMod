package fr.archemod.chat.capabilities.description;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

import javax.annotation.Nullable;

public class DescriptionStorage implements Capability.IStorage<IDescription> {

    @CapabilityInject(IDescription.class)
    public static final Capability<IDescription> I_DESCRIPTION_CAPABILITY = null;

    @Nullable
    @Override
    public NBTBase writeNBT(Capability<IDescription> capability, IDescription instance, EnumFacing side) {
        return new NBTTagString(instance.getDescription());
    }

    @Override
    public void readNBT(Capability<IDescription> capability, IDescription instance, EnumFacing side, NBTBase nbt) {
        if (!(instance instanceof Description))
            throw new IllegalArgumentException("Can not deserialize to an instance that isn't the default implementation");
        instance.setDescription(((NBTTagString) nbt).getString());
    }
}
