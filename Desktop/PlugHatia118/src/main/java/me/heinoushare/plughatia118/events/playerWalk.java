package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.PlugHatia118;
import me.heinoushare.plughatia118.objects.playerObj;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.UUID;

public class playerWalk implements Listener {

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {

        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();

        playerObj JSONplayer = playerStorageUtil.findPlayer(uuid);

        if (JSONplayer.getRace().equalsIgnoreCase("Human")) {

        }
        else if (JSONplayer.getRace().equalsIgnoreCase("Hobbit")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 300, 0, false));
            player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 0, false));
        }
        else if (JSONplayer.getRace().equalsIgnoreCase("Wood_Elf")) {

        }
        else if (JSONplayer.getRace().equalsIgnoreCase("Dark_Elf")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 300, 0, false));
            if (night()) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 60, 0, false));
            }
        }
        else if (JSONplayer.getRace().equalsIgnoreCase("Tiefling")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 300, 0, false));
        }
        else if (JSONplayer.getRace().equalsIgnoreCase("Ork")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 300, 0, false));
            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 60, 0, false));
        }

    }

    public static boolean night() {
        long time = PlugHatia118.server.getWorld("world").getTime();
        System.out.println(time);
        if(time > 12000 || time < 0) {
            return true;
        } else {
            return false;
        }
    }

}
