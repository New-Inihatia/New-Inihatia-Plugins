package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.objects.playerObj;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class playerEquipBoots implements Listener {

    @EventHandler
    public static void onPlayerEquipBoots(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();
        UUID uuid = p.getUniqueId();
        if (!playerStorageUtil.findPlayer(uuid).getRace().equalsIgnoreCase("Hobbit")) {
            return;
        }

        String itemName = e.getCursor().getType().name();

        if (e.getSlotType().equals(InventoryType.SlotType.ARMOR)) {
            if (itemName.endsWith("_BOOTS")) {
                p.closeInventory();
                p.sendMessage("No boots for Hobbits!");
                e.setCancelled(true);
            }
        }
    }

}
