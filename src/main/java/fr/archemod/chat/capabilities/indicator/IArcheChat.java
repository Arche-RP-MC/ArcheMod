package fr.archemod.chat.capabilities.indicator;

import net.minecraft.entity.player.EntityPlayer;

public interface IArcheChat {

    //0 --> Rien
    //1 --> Speaking
    //2 --> Emote
    //3 --> HRP
    int getIndicator();

    void setIndicator(int indicator);

    void sync(EntityPlayer entityPlayer);

}
