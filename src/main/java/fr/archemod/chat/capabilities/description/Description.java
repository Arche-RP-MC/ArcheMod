package fr.archemod.chat.capabilities.description;

import fr.archemod.ArcheMod;
import fr.archemod.chat.network.description.PacketDescription;
import fr.archemod.network.ArcheNetwork;
import net.minecraft.entity.player.EntityPlayer;

public class Description implements IDescription {

    private String description = "";

    public Description(){
        description = "";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Description : "+description;
    }

    public void sync(EntityPlayer player)
    {
        PacketDescription packet = new PacketDescription(this);
        if(player.world.isRemote)
        {
            ArcheNetwork.NETWORK.sendToServer(packet);
        }
    }
}
