package fr.archemod.network.client;

import fr.archemod.ArcheMod;
import fr.archemod.blocks.tileentity.TileEntitySignHrp;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.io.IOException;

public class MessageUpdateSign implements IMessage {

    private BlockPos pos;
    public ITextComponent[] text;

    public MessageUpdateSign() {
    }

    public  MessageUpdateSign(TileEntitySignHrp TileEntitySignHrp) {
        this.pos = TileEntitySignHrp.getPos();
        this.text = TileEntitySignHrp.signText;

    }
    @Override
    public void fromBytes(ByteBuf buf) {
        PacketBuffer packetBuf = new PacketBuffer(buf);
        this.pos = packetBuf.readBlockPos();
        text = new ITextComponent[4];


        for (int i = 0; i < 4; i++) {
            try {
                text[i] = packetBuf.readTextComponent();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void toBytes(ByteBuf buf) {
        PacketBuffer packetBuf = new PacketBuffer(buf);
        packetBuf.writeBlockPos(this.pos);



        for (int i = 0; i < 4; i++) {
            packetBuf.writeTextComponent(text[i]);
        }

    }

    public static class Handler implements IMessageHandler<MessageUpdateSign, IMessage> {


        @Override
        public IMessage onMessage(MessageUpdateSign message, MessageContext ctx) {

            EntityPlayerMP player = ctx.getServerHandler().player;
            player.markPlayerActive();

            WorldServer worldserver = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(player.dimension);
            BlockPos pos = message.pos;

            if (worldserver.isBlockLoaded(pos)) {
                TileEntity tileentity = worldserver.getTileEntity(pos);

                if (tileentity instanceof TileEntitySignHrp) {
                    TileEntitySignHrp sign = (TileEntitySignHrp) tileentity;

                    if (!sign.getIsEditable() || sign.getPlayer() != player) {
                        ArcheMod.getLogger().warn("Player " + player.getName() + " just tried to change non-editable sign");
                        return null;
                    }


                    System.arraycopy(message.text, 0, sign.signText, 0, 4);
                    sign.markDirty();

                    IBlockState iblockstate = worldserver.getBlockState(pos);
                    worldserver.notifyBlockUpdate(pos, iblockstate, iblockstate, 3);
                }
            }
            return null;
        }

    }
}
