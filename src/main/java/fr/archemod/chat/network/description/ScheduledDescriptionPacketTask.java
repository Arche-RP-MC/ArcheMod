package fr.archemod.chat.network.description;

import fr.archemod.chat.capabilities.description.DescriptionStorage;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ScheduledDescriptionPacketTask implements Runnable {
    private EntityPlayerMP player;
    private PacketDescription message;

    public ScheduledDescriptionPacketTask(EntityPlayerMP player, PacketDescription message) {
        this.player = player;
        this.message = message;
    }

    @Override
    public void run() {
        EntityPlayer player = this.player == null ? getPlayer() : this.player;
        player.getCapability(DescriptionStorage.I_DESCRIPTION_CAPABILITY, null).setDescription(message.description.getDescription());
    }

    @SideOnly(Side.CLIENT)
    private EntityPlayer getPlayer() {
        return Minecraft.getMinecraft().player;
    }
}
