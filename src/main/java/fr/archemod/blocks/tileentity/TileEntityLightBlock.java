package fr.archemod.blocks.tileentity;

import fr.archemod.blocks.BlockLantern;
import fr.archemod.init.ModBlocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Date;

import static fr.archemod.blocks.BlockLantern.ORIENTATION;
import static fr.archemod.blocks.BlockLantern.POSITION;

public class TileEntityLightBlock extends TileEntity implements ITickable {
    public Date date_begin = new Date();

    public void setDate() {
        this.date_begin = new Date();
        markDirty();
    }

    public void setDate(Date date) {
        this.date_begin = date;
        markDirty();
    }

    public Date getDate() {
        return this.date_begin;
    }

    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        this.date_begin = new Date(nbt.getLong("date"));
    }

    public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setLong("date", this.date_begin.getTime());
        return nbt;
    }

    public NBTTagCompound getUpdateTag() {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setLong("date", this.date_begin.getTime());
        return nbt;
    }

    public void handleUpdateTag(NBTTagCompound nbt) {
        super.handleUpdateTag(nbt);
        this.date_begin = new Date(nbt.getLong("date"));
    }

    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(this.pos, getBlockMetadata(), getUpdateTag());
    }

    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        if (net.getDirection() == EnumPacketDirection.CLIENTBOUND)
            readFromNBT(pkt.getNbtCompound());
    }

    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState) {
        if (oldState.getBlock() == newState.getBlock())
            return false;
        return true;
    }

    protected int ticks = 0;

    @Override
    public void update() {
        World worldIn = this.getWorld();

        if (!worldIn.isRemote) {
            ticks++;

            IBlockState state = world.getBlockState(this.getPos());
            BlockLantern block = (BlockLantern) state.getBlock();
            if (ticks == 20) {


                if (block.burning) {

                      /*
                    if (worldIn.isRaining() && worldIn.getChunk(pos).getBiome(pos, worldIn.getBiomeProvider()).canRain() && (worldIn
                            .canBlockSeeSky(pos) || worldIn
                            .canBlockSeeSky(pos.north()) || worldIn
                            .canBlockSeeSky(pos.east()) || worldIn
                            .canBlockSeeSky(pos.south()) || worldIn
                            .canBlockSeeSky(pos.west())))

                        worldIn.setBlockState(pos, ModBlocks.LANTERNE_JAUNE_ETEINTE.getDefaultState().withProperty((IProperty)ORIENTATION, state.getValue((IProperty)ORIENTATION)).withProperty((IProperty)POSITION, state.getValue((IProperty)POSITION)));

*/
                    if (worldIn.getTileEntity(pos) != null) {
                        Date date_begin = ((TileEntityLightBlock) worldIn.getTileEntity(pos)).getDate();
                        if (date_begin == null)
                            return;
                        long timer = (((new Date()).getTime() - date_begin.getTime()));

                        if (timer >= 864000000L) {
                            worldIn.setBlockState(pos, ModBlocks.LANTERNE_JAUNE_ETEINTE.getDefaultState().withProperty((IProperty) ORIENTATION, state.getValue((IProperty) ORIENTATION)).withProperty((IProperty) POSITION, state.getValue((IProperty) POSITION)));
                            ((TileEntityLightBlock) worldIn.getTileEntity(pos)).setDate(new Date());
                        }
                    }
                }
                ticks = 0;
            }
        }
    }
}
