package fr.archemod.blocks.tileentity;


import net.minecraft.block.Block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandResultStats;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.ITickable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class TileEntitySignHrp extends TileEntitySign {

    public ITextComponent[] signText = new ITextComponent[] {new TextComponentString(""), new TextComponentString(""), new TextComponentString(""), new TextComponentString("")};
    public int lineBeingEdited = -1;
    private boolean isEditable = true;
    private EntityPlayer player;
    private final CommandResultStats stats = new CommandResultStats();
    private EntityPlayer playerEditing;

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);

        for (int i = 0; i < 4; ++i)
        {
            String s = ITextComponent.Serializer.componentToJson(this.signText[i]);
            compound.setString("Text" + (i + 1), s);
        }

        this.stats.writeStatsToNBT(compound);
        return compound;
    }

    @Override
    public void setPlayer(EntityPlayer par1EntityPlayer) {
        this.playerEditing = par1EntityPlayer;
    }

    @Override
    public EntityPlayer getPlayer() {
        return this.playerEditing;
    }
    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
        return (oldState.getBlock() != newSate.getBlock());
    }
    @Override
    protected void setWorldCreate(World worldIn)
    {
        this.setWorld(worldIn);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        this.isEditable = false;
        super.readFromNBT(compound);
        ICommandSender icommandsender = new ICommandSender()
        {
            public String getName()
            {
                return "Sign";
            }
            public boolean canUseCommand(int permLevel, String commandName)
            {
                return permLevel <= 2; //Forge: Fixes  MC-75630 - Exploit with signs and command blocks
            }
            public BlockPos getPosition()
            {
                return TileEntitySignHrp.this.pos;
            }
            public Vec3d getPositionVector()
            {
                return new Vec3d((double)TileEntitySignHrp.this.pos.getX() + 0.5D, (double)TileEntitySignHrp.this.pos.getY() + 0.5D, (double)TileEntitySignHrp.this.pos.getZ() + 0.5D);
            }
            public World getEntityWorld()
            {
                return TileEntitySignHrp.this.world;
            }
            public MinecraftServer getServer()
            {
                return TileEntitySignHrp.this.world.getMinecraftServer();
            }
        };

        for (int i = 0; i < 4; ++i)
        {
            String s = compound.getString("Text" + (i + 1));
            ITextComponent itextcomponent = ITextComponent.Serializer.jsonToComponent(s);

            try
            {
                this.signText[i] = TextComponentUtils.processComponent(icommandsender, itextcomponent, (Entity)null);
            }
            catch (CommandException var7)
            {
                this.signText[i] = itextcomponent;
            }
        }

        this.stats.readStatsFromNBT(compound);
    }

    @Nullable
    @Override
    public SPacketUpdateTileEntity getUpdatePacket()
    {
        return new SPacketUpdateTileEntity(this.pos, 9, this.getUpdateTag());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        readFromNBT(pkt.getNbtCompound());
        markDirty();
    }

    @Override
    public NBTTagCompound getUpdateTag()
    {
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public boolean onlyOpsCanSetNbt()
    {
        return true;
    }



    @Override
    public boolean getIsEditable()
    {
        return this.isEditable;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void setEditable(boolean isEditableIn)
    {
        this.isEditable = isEditableIn;

        if (!isEditableIn)
        {
            this.player = null;
        }
    }




    @Override
    public boolean executeCommand(final EntityPlayer playerIn)
    {
        ICommandSender icommandsender = new ICommandSender()
        {
            @Override
            public String getName()
            {
                return playerIn.getName();
            }
            @Override
            public ITextComponent getDisplayName()
            {
                return playerIn.getDisplayName();
            }
            @Override
            public void sendMessage(ITextComponent component)
            {
            }
            @Override
            public boolean canUseCommand(int permLevel, String commandName)
            {
                return permLevel <= 2;
            }
            @Override
            public BlockPos getPosition()
            {
                return TileEntitySignHrp.this.pos;
            }
            @Override
            public Vec3d getPositionVector()
            {
                return new Vec3d((double)TileEntitySignHrp.this.pos.getX() + 0.5D, (double)TileEntitySignHrp.this.pos.getY() + 0.5D, (double)TileEntitySignHrp.this.pos.getZ() + 0.5D);
            }
            @Override
            public World getEntityWorld()
            {
                return playerIn.getEntityWorld();
            }
            @Override
            public Entity getCommandSenderEntity()
            {
                return playerIn;
            }
            @Override
            public boolean sendCommandFeedback()
            {
                return false;
            }
            @Override
            public void setCommandStat(CommandResultStats.Type type, int amount)
            {
                if (TileEntitySignHrp.this.world != null && !TileEntitySignHrp.this.world.isRemote)
                {
                    TileEntitySignHrp.this.stats.setCommandStatForSender(TileEntitySignHrp.this.world.getMinecraftServer(), this, type, amount);
                }
            }
            @Override
            public MinecraftServer getServer()
            {
                return playerIn.getServer();
            }
        };

        for (ITextComponent itextcomponent : this.signText)
        {
            Style style = itextcomponent == null ? null : itextcomponent.getStyle();

            if (style != null && style.getClickEvent() != null)
            {
                ClickEvent clickevent = style.getClickEvent();

                if (clickevent.getAction() == ClickEvent.Action.RUN_COMMAND)
                {
                    playerIn.getServer().getCommandManager().executeCommand(icommandsender, clickevent.getValue());
                }
            }
        }

        return true;
    }


    @Override
    public CommandResultStats getStats()
    {
        return this.stats;
    }
}