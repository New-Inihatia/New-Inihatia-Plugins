package me.heinoushare.plughatia118.commands;

import me.heinoushare.plughatia118.objects.playerObj;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.UUID;

public class leap implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;
        UUID uuid = player.getUniqueId();
        playerObj JSONplayer = playerStorageUtil.findPlayer(uuid);

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only player can use that command!");
            return false;
        } else if (!(JSONplayer.getRace().equalsIgnoreCase("Elf"))) {
            player.sendMessage(ChatColor.RED + "You are not the correct race to use this command!");
            return false;
        } else if (cmd.getName().equalsIgnoreCase("leap")) {

            boolean hadJump = false;
            for (PotionEffect effect : player.getActivePotionEffects()) {
                if (effect.toString().startsWith("JUMP")) {
                    hadJump = true;
                    player.removePotionEffect(effect.getType());
                    break;
                }
            }
            if (hadJump == false) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000000, 0, false));
            }
            return true;
        }

        return false;

    }
}
