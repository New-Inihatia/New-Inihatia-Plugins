package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.objects.playerObj;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.UUID;

public class playerSneak implements Listener {

    @EventHandler
    public void onPlayerToggleSneakEvent(PlayerToggleSneakEvent event) {

        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();
        playerObj JSONplayer = playerStorageUtil.findPlayer(uuid);

        if (JSONplayer.getRace().equalsIgnoreCase("Hobbit")) {
            // .isSneaking() returns the sneaking status of the player BEFORE the event
            if (!player.isSneaking()) {
                player.sendMessage("You are hidden!");
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000000, 0, true));
            }
            else if (player.isSneaking()) {
                for (PotionEffect effect : player.getActivePotionEffects()) {
                    if (effect.toString().startsWith("INVISIBILITY")) {
                        player.removePotionEffect(effect.getType());
                    }
                }
            }
        }
        else if (JSONplayer.getRace().equalsIgnoreCase("Wood_Elf")) {
            if (!player.isSneaking()) {
                player.sendMessage("You are hidden!");
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000000, 0, false));
            }
            else if (player.isSneaking()) {
                for (PotionEffect effect : player.getActivePotionEffects()) {
                    if (effect.toString().startsWith("INVISIBILITY")) {
                        player.removePotionEffect(effect.getType());
                    }
                }
            }
        }
        else if (JSONplayer.getRace().equalsIgnoreCase("Dark_Elf")) {
            if (!player.isSneaking()) {
                player.sendMessage("You are hidden!");
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000000, 0, false));
            }
            else if (player.isSneaking()) {
                for (PotionEffect effect : player.getActivePotionEffects()) {
                    if (effect.toString().startsWith("INVISIBILITY")) {
                        player.removePotionEffect(effect.getType());
                    }
                }
            }
        }
    }
}
