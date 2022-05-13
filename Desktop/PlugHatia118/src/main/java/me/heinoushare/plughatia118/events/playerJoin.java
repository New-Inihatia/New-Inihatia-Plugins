package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.objects.playerObj;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import java.util.UUID;

import static org.bukkit.Bukkit.getServer;

public class playerJoin implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();

        player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome to New Inihatia!");

        playerObj JSONplayer = playerStorageUtil.findPlayer(uuid);

        if (JSONplayer == null) {
            playerStorageUtil.createPlayer(player, "Traveler", "Traveler");
            JSONplayer = playerStorageUtil.findPlayer(uuid);
            player.setDisplayName("[" + JSONplayer.getRace() + "] [" + JSONplayer.getCLASS() + "] " + player.getName());
        }
        else if (JSONplayer != null) {

//            ScoreboardManager manager = Bukkit.getScoreboardManager();
//            Scoreboard board = manager.getNewScoreboard();

            if (JSONplayer.getRace().equalsIgnoreCase("Traveler")) {

            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Human")) {
//                board.getTeam("Humans").addPlayer((OfflinePlayer) player);
            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Hobbit")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000000, 0, false, false));
//                board.getTeam("Hobbits").addPlayer((OfflinePlayer) player);
            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Elf")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
//                board.getTeam("Elfs").addPlayer((OfflinePlayer) player);
            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Dwarf")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000000, 0, false, false));
//                board.getTeam("Dwarfs").addPlayer((OfflinePlayer) player);
            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Orc")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0, false, false));
//                board.getTeam("Orcs").addPlayer((OfflinePlayer) player);
            }
        }

        ItemStack[] playerInv = player.getInventory().getContents();
        for (ItemStack invTemp : playerInv) {
            for (ItemStack remTemp : bannedItems.banned) {
                if (invTemp != null) {
                    if (invTemp.getType().equals(remTemp.getType())) {
                        player.getInventory().removeItem(invTemp);
                        player.sendMessage(ChatColor.DARK_RED + "You have been caught with a banned item (" + invTemp + ") and it has been removed from your inventory.\n" +
                                "If you think this was a mistake, please contact a Staff member.");
                        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + player.getName() + " has been caught with a banned item (" + invTemp + ") and it has been removed from their inventory.");
                    }
                }
            }
        }

    }

}
