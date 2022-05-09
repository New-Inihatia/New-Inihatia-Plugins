package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.PlugHatia118;
import me.heinoushare.plughatia118.objects.playerObj;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.UUID;

public class playerRespawn implements Listener {

    @EventHandler
    public static void onPlayerRespawn(PlayerRespawnEvent e) {

        Player player = e.getPlayer();
        UUID uuid = player.getUniqueId();
        playerObj JSONplayer = playerStorageUtil.findPlayer(uuid);

        Bukkit.getScheduler().runTaskLater(PlugHatia118.getPlugin(), task -> {

            if (JSONplayer.getRace().equalsIgnoreCase("Traveler")) {

            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Human")) {

            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Hobbit")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000000, 0, false, false));
            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Elf")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Dwarf")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000000, 0, false, false));
            }
            else if (JSONplayer.getRace().equalsIgnoreCase("Orc")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 0, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000000, 0, false, false));
            }

        }, 5L);

        ItemStack[] playerInv = player.getInventory().getContents();
        for (ItemStack invTemp : playerInv) {
            for (ItemStack remTemp : bannedItems.banned) {
                if (invTemp != null) {
                    if (invTemp.equals(remTemp)) {
                        player.getInventory().removeItem(remTemp);
                        player.sendMessage(ChatColor.DARK_RED + "You have been caught with a banned item (" + invTemp + ") and it has been removed from your inventory.\n" +
                                "If you think this was a mistake, please contact a Staff member.");
                    }
                }
            }
        }

    }

}
