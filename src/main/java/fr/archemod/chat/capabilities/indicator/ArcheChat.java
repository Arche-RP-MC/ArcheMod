package fr.archemod.chat.capabilities.indicator;

import fr.archemod.ArcheMod;
import fr.archemod.chat.network.indicator.PacketArcheChat;
import fr.archemod.network.ArcheNetwork;
import net.minecraft.entity.player.EntityPlayer;

public class ArcheChat implements IArcheChat{

    private int indicator = 0;

    public ArcheChat(){
        indicator = 0;
    }

    @Override
    public int getIndicator() {
        return indicator;
    }

    @Override
    public void setIndicator(int indicator) {
        this.indicator = indicator;
    }

    public String toString(){
        return "Indicator : "+indicator;
    }

    public void sync(EntityPlayer player)
    {
        PacketArcheChat packet = new PacketArcheChat(this);
        if(player.world.isRemote){
            ArcheNetwork.NETWORK.sendToServer(packet);
        }
    }
}
