package fr.archemod.blocks.tileentity;

import fr.archemod.blocks.container.ContainerPlacardHRP;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandResultStats;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.NonNullList;
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

public class TileEntityHrpSign extends TileEntityLockableLoot {

    public final ITextComponent[] signText = new ITextComponent[]{new TextComponentString(""), new TextComponentString(""), new TextComponentString(""), new TextComponentString("")};
    public int lineBeingEdited = -1;
    private boolean isEditable = true;
    private EntityPlayer player;
    private final CommandResultStats stats = new CommandResultStats();
    private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(9, ItemStack.EMPTY);


    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        for (int i = 0; i < 4; ++i) {
            String s = ITextComponent.Serializer.componentToJson(this.signText[i]);
            compound.setString("Text" + (i + 1), s);
        }

        this.stats.writeStatsToNBT(compound);
        return compound;
    }

    protected void setWorldCreate(World worldIn) {
        this.setWorld(worldIn);
    }

    public void readFromNBT(NBTTagCompound compound) {
        this.isEditable = false;
        super.readFromNBT(compound);

        if (!this.checkLootAndWrite(compound))
            ItemStackHelper.saveAllItems(compound, this.stacks);

        ICommandSender icommandsender = new ICommandSender() {
            public String getName() {
                return "Sign";
            }

            public boolean canUseCommand(int permLevel, String commandName) {
                return permLevel <= 2; //Forge: Fixes  MC-75630 - Exploit with signs and command blocks
            }

            public BlockPos getPosition() {
                return TileEntityHrpSign.this.pos;
            }

            public Vec3d getPositionVector() {
                return new Vec3d((double) TileEntityHrpSign.this.pos.getX() + 0.5D, (double) TileEntityHrpSign.this.pos.getY() + 0.5D, (double) TileEntityHrpSign.this.pos.getZ() + 0.5D);
            }

            public World getEntityWorld() {
                return TileEntityHrpSign.this.world;
            }

            public MinecraftServer getServer() {
                return TileEntityHrpSign.this.world.getMinecraftServer();
            }
        };

        for (int i = 0; i < 4; ++i) {
            String s = compound.getString("Text" + (i + 1));
            ITextComponent itextcomponent = ITextComponent.Serializer.jsonToComponent(s);

            try {
                this.signText[i] = TextComponentUtils.processComponent(icommandsender, itextcomponent, (Entity) null);
            } catch (CommandException var7) {
                this.signText[i] = itextcomponent;
            }
        }

        this.stats.readStatsFromNBT(compound);
    }

    @Nullable
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(this.pos, 9, this.getUpdateTag());
    }

    public NBTTagCompound getUpdateTag() {
        return this.writeToNBT(new NBTTagCompound());
    }

    public boolean onlyOpsCanSetNbt() {
        return true;
    }

    public boolean getIsEditable() {
        return this.isEditable;
    }

    @SideOnly(Side.CLIENT)
    public void setEditable(boolean isEditableIn) {
        this.isEditable = isEditableIn;

        if (!isEditableIn) {
            this.player = null;
        }
    }

    public void setPlayer(EntityPlayer playerIn) {
        this.player = playerIn;
    }

    public EntityPlayer getPlayer() {
        return this.player;
    }

    public boolean executeCommand(final EntityPlayer playerIn) {
        ICommandSender icommandsender = new ICommandSender() {
            public String getName() {
                return playerIn.getName();
            }

            public ITextComponent getDisplayName() {
                return playerIn.getDisplayName();
            }

            public void sendMessage(ITextComponent component) {
            }

            public boolean canUseCommand(int permLevel, String commandName) {
                return permLevel <= 2;
            }

            public BlockPos getPosition() {
                return TileEntityHrpSign.this.pos;
            }

            public Vec3d getPositionVector() {
                return new Vec3d((double) TileEntityHrpSign.this.pos.getX() + 0.5D, (double) TileEntityHrpSign.this.pos.getY() + 0.5D, (double) TileEntityHrpSign.this.pos.getZ() + 0.5D);
            }

            public World getEntityWorld() {
                return playerIn.getEntityWorld();
            }

            public Entity getCommandSenderEntity() {
                return playerIn;
            }

            public boolean sendCommandFeedback() {
                return false;
            }

            public void setCommandStat(CommandResultStats.Type type, int amount) {
                if (TileEntityHrpSign.this.world != null && !TileEntityHrpSign.this.world.isRemote) {
                    TileEntityHrpSign.this.stats.setCommandStatForSender(TileEntityHrpSign.this.world.getMinecraftServer(), this, type, amount);
                }
            }

            public MinecraftServer getServer() {
                return playerIn.getServer();
            }
        };

        for (ITextComponent itextcomponent : this.signText) {
            Style style = itextcomponent == null ? null : itextcomponent.getStyle();

            if (style != null && style.getClickEvent() != null) {
                ClickEvent clickevent = style.getClickEvent();

                if (clickevent.getAction() == ClickEvent.Action.RUN_COMMAND) {
                    playerIn.getServer().getCommandManager().executeCommand(icommandsender, clickevent.getValue());
                }
            }
        }

        return true;
    }


    public CommandResultStats getStats() {
        return this.stats;
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return stacks;
    }

    @Override
    public int getSizeInventory() {
        return 9;
    }

    @Override
    public boolean isEmpty() {
        for (ItemStack itemstack : this.stacks)
            if (!itemstack.isEmpty())
                return false;
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerPlacardHRP(playerInventory, this);
    }

    @Override
    public String getGuiID() {
        return "am:placardhrp";
    }

    @Override
    public String getName() {
        return "Placard HRP";
    }
}