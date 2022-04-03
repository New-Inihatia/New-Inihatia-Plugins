package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.items.itemManager;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class craftSteelTools implements Listener {

    @EventHandler
    public static void onPrepareCraftSteelArmor(PrepareItemCraftEvent e) {
        if (e.getInventory().getMatrix().length < 9) {
            return;
        }

        ItemStack stick = new ItemStack(Material.STICK);

        // Steel Sword
        itemManager.checkCraft(itemManager.steelSword, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, itemManager.steelIngot);
            put(2, null);
            put(3, null);
            put(4, itemManager.steelIngot);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Steel Axe (Blade on left)
        boolean axeCrafted = itemManager.checkCraft(itemManager.steelAxe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.steelIngot);
            put(1, itemManager.steelIngot);
            put(2, null);
            put(3, itemManager.steelIngot);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Steel Axe (Blade on right)
        if (axeCrafted == false) {
            itemManager.checkCraft(itemManager.steelAxe, e.getInventory(), new HashMap<Integer, ItemStack>() {{
                put(0, null);
                put(1, itemManager.steelIngot);
                put(2, itemManager.steelIngot);
                put(3, null);
                put(4, stick);
                put(5, itemManager.steelIngot);
                put(6, null);
                put(7, stick);
                put(8, null);
            }});
        }

        // Steel Pickaxe
        itemManager.checkCraft(itemManager.steelPickaxe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.steelIngot);
            put(1, itemManager.steelIngot);
            put(2, itemManager.steelIngot);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Steel Shovel
        itemManager.checkCraft(itemManager.steelShovel, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, itemManager.steelIngot);
            put(2, null);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Steel Hoe (Blade on left)
        boolean hoeCrafted = itemManager.checkCraft(itemManager.steelHoe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.steelIngot);
            put(1, itemManager.steelIngot);
            put(2, null);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        if (hoeCrafted == false) {
            // Steel Hoe (Blade on right)
            itemManager.checkCraft(itemManager.steelHoe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
                put(0, null);
                put(1, itemManager.steelIngot);
                put(2, itemManager.steelIngot);
                put(3, null);
                put(4, stick);
                put(5, null);
                put(6, null);
                put(7, stick);
                put(8, null);
            }});
        }
    }

}
