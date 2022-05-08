package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;

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

        if (itemName.endsWith("_BOOTS")) {
            if (e.getSlotType().equals(InventoryType.SlotType.ARMOR)) {
                p.closeInventory();
                p.sendMessage("No boots for Hobbits!");
                e.setCancelled(true);
                return;
            }
        }

        itemName = e.getCurrentItem().getType().name();

        if (itemName.endsWith("_BOOTS")) {
            if (e.isShiftClick() == true) {
                p.closeInventory();
                p.sendMessage("No boots for Hobbits!");
                e.setCancelled(true);
                return;
            }
        }

    }

    @EventHandler
    public static void onPlayerEquipBootsDrag(InventoryDragEvent e) {

        Player p = (Player) e.getWhoClicked();
        UUID uuid = p.getUniqueId();
        if (!playerStorageUtil.findPlayer(uuid).getRace().equalsIgnoreCase("Hobbit")) {
            return;
        }

        boolean bootSlot = false;

        for (Integer id : e.getRawSlots()) {
            if (id.equals((Integer) 8)) { // 8 is the slot id for boots
                bootSlot = true;
                break;
            }
        }

        if (bootSlot == true) {
            p.closeInventory();
            p.sendMessage("No boots for Hobbits!");
            e.setCancelled(true);
        }
    }



}
