package fr.archemod.chat.capabilities.indicator;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ArcheChatCapability implements ICapabilitySerializable<NBTBase> {

    protected IArcheChat archeChat;

    public ArcheChatCapability() {
        archeChat = new ArcheChat();
    }

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
        return capability == ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY;
    }

    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
        return this.hasCapability(capability, facing) ? ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY.cast(this.archeChat) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY.writeNBT(this.archeChat, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        ArcheChatStorage.I_ARCHE_CHAT_CAPABILITY.readNBT(this.archeChat, null, nbt);
    }

}
