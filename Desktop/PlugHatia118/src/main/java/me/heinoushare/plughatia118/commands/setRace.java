package me.heinoushare.plughatia118.commands;

import me.heinoushare.plughatia118.objects.playerObj;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

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

                // Capitalizes the first letter and puts the rest in lowercase
                String raceStr = args[0];

                if (JSONplayer.getRace().equals("Traveler")) {

//                    ScoreboardManager manager = Bukkit.getScoreboardManager();
//                    Scoreboard board = manager.getNewScoreboard();

                    if (raceStr.equalsIgnoreCase("Hobbit")) {
                        newJSONplayer.setRace("Hobbit");
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a Hobbit!");
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0, false, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000000, 0, false, false));
//                        board.getTeam("Hobbits").addPlayer((OfflinePlayer) player);
                    }
                    else if (raceStr.equalsIgnoreCase("Elf")) {
                        newJSONplayer.setRace("Elf");
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a Elf!");
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
//                        board.getTeam("Elfs").addPlayer((OfflinePlayer) player);
                    }
                    else if (raceStr.equalsIgnoreCase("Dwarf")) {
                        newJSONplayer.setRace("Dwarf");
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a Dwarf!");
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0, false, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0, false, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000000, 0, false, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000000, 0, false, false));
//                        board.getTeam("Dwarfs").addPlayer((OfflinePlayer) player);
                    }
                    else if (raceStr.equalsIgnoreCase("Orc")) {
                        newJSONplayer.setRace("Orc");
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a Orc!");
                        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0, false, false));
//                        board.getTeam("Orcs").addPlayer((OfflinePlayer) player);
                    }
                    else if (raceStr.equalsIgnoreCase("Human")) {
                        newJSONplayer.setRace("Human");
                        playerStorageUtil.updatePlayer(uuid, newJSONplayer);
                        player.sendMessage(ChatColor.GOLD + "You are now a Human!");
//                        board.getTeam("Humans").addPlayer((OfflinePlayer) player);
                    }
                    else {
                        player.sendMessage("That is not a valid race!");
                        player.sendMessage("Valid races: Hobbit, Elf, Human, Dwarf, Orc");
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