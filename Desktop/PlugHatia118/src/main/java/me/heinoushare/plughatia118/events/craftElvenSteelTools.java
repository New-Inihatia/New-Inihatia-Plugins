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
    public static void onPrepareCraftMithrilTools(PrepareItemCraftEvent e) {

        // Make sure crafter is an Dwarf
        List<HumanEntity> viewers = e.getViewers();
        for (HumanEntity temp : viewers) {
            Player p = Bukkit.getPlayer(temp.getName());
            UUID uuid = p.getUniqueId();
            if (!playerStorageUtil.findPlayer(uuid).getRace().equalsIgnoreCase("Dwarf")) {
                return;
            }
        }

        // If crafting GUI is not a crafting table
        if (e.getInventory().getMatrix().length < 9) {
            return;
        }

        ItemStack stick = new ItemStack(Material.STICK);

        // Mithril Sword
        itemManager.checkCraft(itemManager.mithrilSword, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, itemManager.mithrilIngot);
            put(2, null);
            put(3, null);
            put(4, itemManager.mithrilIngot);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Mithril Axe (Blade on left)
        boolean axeCrafted = itemManager.checkCraft(itemManager.mithrilAxe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.mithrilIngot);
            put(1, itemManager.mithrilIngot);
            put(2, null);
            put(3, itemManager.mithrilIngot);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Mithril Axe (Blade on right)
        if (axeCrafted == false) {
            itemManager.checkCraft(itemManager.mithrilAxe, e.getInventory(), new HashMap<Integer, ItemStack>() {{
                put(0, null);
                put(1, itemManager.mithrilIngot);
                put(2, itemManager.mithrilIngot);
                put(3, null);
                put(4, stick);
                put(5, itemManager.mithrilIngot);
                put(6, null);
                put(7, stick);
                put(8, null);
            }});
        }

        // Mithril Pickaxe
        itemManager.checkCraft(itemManager.mithrilPickaxe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.mithrilIngot);
            put(1, itemManager.mithrilIngot);
            put(2, itemManager.mithrilIngot);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Mithril Shovel
        itemManager.checkCraft(itemManager.mithrilShovel, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, itemManager.mithrilIngot);
            put(2, null);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        // Mithril Hoe (Blade on left)
        boolean hoeCrafted = itemManager.checkCraft(itemManager.mithrilHoe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.mithrilIngot);
            put(1, itemManager.mithrilIngot);
            put(2, null);
            put(3, null);
            put(4, stick);
            put(5, null);
            put(6, null);
            put(7, stick);
            put(8, null);
        }});

        if (hoeCrafted == false) {
            // Mithril Hoe (Blade on right)
            itemManager.checkCraft(itemManager.mithrilHoe, e.getInventory(), new HashMap<Integer, ItemStack>(){{
                put(0, null);
                put(1, itemManager.mithrilIngot);
                put(2, itemManager.mithrilIngot);
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
