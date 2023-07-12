package fr.archemod.chat.capabilities.description;

import net.minecraft.entity.player.EntityPlayer;

public interface IDescription {

    String getDescription();

    void setDescription(String description);

    void sync(EntityPlayer entityPlayer);

}
