package fr.archemod.network.server;

import fr.archemod.blocks.tileentity.TileEntitySignHrp;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiOpensignPaket implements IMessage {

    public BlockPos pos;


    public GuiOpensignPaket() {
    }


    public GuiOpensignPaket(TileEntitySignHrp tileEntity) {
        this.pos = tileEntity.getPos();

    }

    @Override
    public void fromBytes(ByteBuf buf) {
        PacketBuffer packetBuf = new PacketBuffer(buf);

        this.pos = packetBuf.readBlockPos();

    }

    @Override
    public void toBytes(ByteBuf buf) {
        PacketBuffer packetBuf = new PacketBuffer(buf);

        packetBuf.writeBlockPos(pos);

    }


    public static class Handler implements IMessageHandler<GuiOpensignPaket, IMessage> {


        @Override
        @SideOnly(Side.CLIENT)
        public IMessage onMessage(GuiOpensignPaket message, MessageContext ctx) {
            if (ctx.side != Side.CLIENT) return null;
            TileEntity tileEntity = FMLClientHandler.instance().getClient().world.getTileEntity(message.pos);

            if (!(tileEntity instanceof TileEntitySignHrp)) {
                tileEntity = new TileEntitySignHrp();
                tileEntity.setWorld(FMLClientHandler.instance().getClient().world);
                tileEntity.setPos(message.pos);

            }

            tileEntity.markDirty();


            return null;
        }

    }
}