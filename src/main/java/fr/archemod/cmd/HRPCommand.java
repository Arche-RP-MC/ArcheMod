package fr.archemod.cmd;

import fr.archemod.init.ModBlocks;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class HRPCommand extends CommandBase {


    @Override
    public String getName() {
        return "hrp";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "hrp.usage";
    }

    @Override
    public List<String> getAliases() {
        return Collections.emptyList();
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

        if (sender instanceof EntityPlayer) {

            EntityPlayer player = (EntityPlayer) sender;

            if (args.length == 0) {
                player.addItemStackToInventory(new ItemStack(ModBlocks.PLACARD_HRP));
                return;
            }

            if (args[0].equalsIgnoreCase("c")) {
                player.addItemStackToInventory(new ItemStack(ModBlocks.PLACARD_HRP));
                return;
            }

            if (args[0].equalsIgnoreCase("eau")) {
                player.addItemStackToInventory(new ItemStack(ModBlocks.TACHE_EAU));
                return;
            }

            if (args[0].equalsIgnoreCase("boue")) {
                player.addItemStackToInventory(new ItemStack(ModBlocks.TACHE_DE_BOUE));
                return;
            }

            if (args[0].equalsIgnoreCase("vomi")) {
                player.addItemStackToInventory(new ItemStack(ModBlocks.TACHE_DE_VOMI));
                return;
            }

            if (args[0].equalsIgnoreCase("urine")) {
                player.addItemStackToInventory(new ItemStack(ModBlocks.TACHE_D_URINE));
                return;

            }

            if (args[0].equalsIgnoreCase("sang")) {
                player.addItemStackToInventory(new ItemStack(ModBlocks.TACHE_DE_SANG));
                return;
            }

        }
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        return Collections.emptyList();
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand iCommand) {
        return 0;
    }
}
