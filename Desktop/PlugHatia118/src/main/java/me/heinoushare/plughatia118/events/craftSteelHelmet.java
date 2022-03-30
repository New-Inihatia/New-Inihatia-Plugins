package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.items.itemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class craftSteelHelmet implements Listener {

    @EventHandler
    public static void onCraftSteelHelmet(PrepareItemCraftEvent e) {
        if (e.getInventory().getMatrix().length < 9) {
            return;
        }

        itemManager.checkCraft(itemManager.steelHelmet, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.steelIngot);
            put(1, itemManager.steelIngot);
            put(2, itemManager.steelIngot);
            put(3, itemManager.steelIngot);
            put(5, itemManager.steelIngot);
        }});
    }

}
