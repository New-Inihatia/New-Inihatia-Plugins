package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.items.itemManager;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class craftElvenSteelTools implements Listener {

    @EventHandler
    public static void onPrepareCraftElvenSteelTools(PrepareItemCraftEvent e) {

        // Make sure crafter is an Elf
        List<HumanEntity> viewers = e.getViewers();
        for (HumanEntity temp : viewers) {
            Player p = Bukkit.getPlayer(temp.getName());
            UUID uuid = p.getUniqueId();
            if (!playerStorageUtil.findPlayer(uuid).getRace().equalsIgnoreCase("Elf")) {
                return;
            }
        }

        // If crafting GUI is not a crafting table
        if (e.getInventory().getMatrix().length < 9) {
            return;
        }

        ItemStack stick = new ItemStack(Material.STICK);

        // Elven Steel Sword
        itemManager.checkCraft(itemManager.elvenSteelSword, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, itemManager.elvenSteelIngot);
            put(2, null);
            put(3, null);
            put(4, itemManager.elvenSteelIngot);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Elven Steel Axe (Blade on left)
        boolean axeCrafted = itemManager.checkCraft(itemManager.elvenSteelAxe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.elvenSteelIngot);
            put(1, itemManager.elvenSteelIngot);
            put(2, null);
            put(3, itemManager.elvenSteelIngot);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Elven Steel Axe (Blade on right)
        if (axeCrafted == false) {
            itemManager.checkCraft(itemManager.elvenSteelAxe, e.getInventory(), new HashMap<Integer, ItemStack>() {{
                put(0, null);
                put(1, itemManager.elvenSteelIngot);
                put(2, itemManager.elvenSteelIngot);
                put(3, null);
                put(4, stick);
                put(5, itemManager.elvenSteelIngot);
                put(6, null);
                put(7, stick);
                put(8, null);
            }});
        }

        // Elven Steel Pickaxe
        itemManager.checkCraft(itemManager.elvenSteelPickaxe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.elvenSteelIngot);
            put(1, itemManager.elvenSteelIngot);
            put(2, itemManager.elvenSteelIngot);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Elven Steel Shovel
        itemManager.checkCraft(itemManager.elvenSteelShovel, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, itemManager.elvenSteelIngot);
            put(2, null);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Elven Steel Hoe (Blade on left)
        boolean hoeCrafted = itemManager.checkCraft(itemManager.elvenSteelHoe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.elvenSteelIngot);
            put(1, itemManager.elvenSteelIngot);
            put(2, null);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        if (hoeCrafted == false) {
            // Elven Steel Hoe (Blade on right)
            itemManager.checkCraft(itemManager.elvenSteelHoe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
                put(0, null);
                put(1, itemManager.elvenSteelIngot);
                put(2, itemManager.elvenSteelIngot);
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
