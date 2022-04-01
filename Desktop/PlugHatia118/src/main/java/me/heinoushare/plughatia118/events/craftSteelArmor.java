package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.items.itemManager;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class craftSteelArmor implements Listener {

    @EventHandler
    public static void onPrepareCraftSteelArmor(PrepareItemCraftEvent e) {
        if (e.getInventory().getMatrix().length < 9) {
            return;
        }

        // Steel Helmet
        itemManager.checkCraft(itemManager.steelHelmet, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.steelIngot);
            put(1, itemManager.steelIngot);
            put(2, itemManager.steelIngot);
            put(3, itemManager.steelIngot);
            put(4, null);
            put(5, itemManager.steelIngot);
            put(6, null);
            put(7, null);
            put(8, null);
        }});

        // Steel Chestplate
        itemManager.checkCraft(itemManager.steelChestplate, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.steelIngot);
            put(1, null);
            put(2, itemManager.steelIngot);
            put(3, itemManager.steelIngot);
            put(4, itemManager.steelIngot);
            put(5, itemManager.steelIngot);
            put(6, itemManager.steelIngot);
            put(7, itemManager.steelIngot);
            put(8, itemManager.steelIngot);
        }});

        // Steel Leggings
        itemManager.checkCraft(itemManager.steelLeggings, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.steelIngot);
            put(1, itemManager.steelIngot);
            put(2, itemManager.steelIngot);
            put(3, itemManager.steelIngot);
            put(4, null);
            put(5, itemManager.steelIngot);
            put(6, itemManager.steelIngot);
            put(7, null);
            put(8, itemManager.steelIngot);
        }});

        // Steel Boots
        itemManager.checkCraft(itemManager.steelBoots, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, null);
            put(2, null);
            put(3, itemManager.steelIngot);
            put(4, null);
            put(5, itemManager.steelIngot);
            put(6, itemManager.steelIngot);
            put(7, null);
            put(8, itemManager.steelIngot);
        }});

        // Wood for shield
        ItemStack wood = new ItemStack(Material.OAK_PLANKS);
        // Steel Shield
        itemManager.checkCraft(itemManager.steelShield, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, wood);
            put(1, itemManager.steelIngot);
            put(2, wood);
            put(3, wood);
            put(4, wood);
            put(5, wood);
            put(6, null);
            put(7, wood);
            put(8, null);
        }});
    }

}
