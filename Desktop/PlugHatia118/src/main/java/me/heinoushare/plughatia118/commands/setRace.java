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

public class setRace implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only player can use that command!");
            return false;
        }

        Player player = (Player) sender;
        UUID uuid = player.getUniqueId();

        if (cmd.getName().equalsIgnoreCase("setRace")) {

            if (args.length != 1) {
                player.sendMessage("Command format: setRace <race>");
            }

            else if (args.length == 1) {
                playerObj JSONplayer = playerStorageUtil.findPlayer(uuid);
                playerObj newJSONplayer = JSONplayer;
                newJSONplayer.setUsername(player.getName());
                newJSONplayer.setUuid(uuid);
                if (JSONplayer.getRace().equalsIgnoreCase("Traveler")) {
                    if (args[0].equalsIgnoreCase("Hobbit")) {
                        newJSONplayer.setRace(args[0]);
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a " + args[0] + "!");
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000000, 0, false));
                    }
                    else if (args[0].equalsIgnoreCase("Elf")) {
                        newJSONplayer.setRace(args[0]);
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a " + args[0] + "!");
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false));
                    }
                    else if (args[0].equalsIgnoreCase("Dwarf")) {
                        newJSONplayer.setRace(args[0]);
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a " + args[0] + "!");
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000000, 0, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000000, 0, false));
                    }
                    else if (args[0].equalsIgnoreCase("Ork")) {
                        newJSONplayer.setRace(args[0]);
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a " + args[0] + "!");
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0, false));
                    }
                    else if (args[0].equalsIgnoreCase("Human")) {
                        newJSONplayer.setRace(args[0]);
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a " + args[0] + "!");
                    }
                    else {
                        player.sendMessage("That is not a valid race!");
                        player.sendMessage("Valid races: Hobbit, Elf, Human, Dwarf, Ork");
                    }
                    player.setDisplayName("[" + JSONplayer.getRace() + "] [" + JSONplayer.getCLASS() + "] " + player.getName());
                }
                else {
                    player.sendMessage(ChatColor.YELLOW + "Your race is already set. You will need to ask an Admin to manually change your race.");
                }
            }

        }

        return true;

    }

}