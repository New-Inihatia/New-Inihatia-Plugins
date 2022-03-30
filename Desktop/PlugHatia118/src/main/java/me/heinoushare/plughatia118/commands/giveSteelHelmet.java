package me.heinoushare.plughatia118.commands;

import me.heinoushare.plughatia118.items.itemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class giveSteelHelmet implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only player can use that command!");
            return false;
        }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("giveSteelHelmet")) {
            player.getInventory().addItem(itemManager.steelHelmet);
        }
        return true;
    }
}