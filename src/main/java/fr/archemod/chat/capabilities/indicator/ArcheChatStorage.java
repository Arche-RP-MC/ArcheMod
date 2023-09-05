package fr.archemod.chat.capabilities.indicator;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

import javax.annotation.Nullable;

public class ArcheChatStorage implements Capability.IStorage<IArcheChat> {

    @CapabilityInject(IArcheChat.class)
    public static final Capability<IArcheChat> I_ARCHE_CHAT_CAPABILITY = null;

    @Nullable
    @Override
    public NBTBase writeNBT(Capability<IArcheChat> capability, IArcheChat instance, EnumFacing side) {
        return new NBTTagInt(instance.getIndicator());
    }

    @Override
    public void readNBT(Capability<IArcheChat> capability, IArcheChat instance, EnumFacing side, NBTBase nbt) {
        if (!(instance instanceof ArcheChat))
            throw new IllegalArgumentException("Can not deserialize to an instance that isn't the default implementation");
        instance.setIndicator(((NBTTagInt) nbt).getInt());
    }
}
