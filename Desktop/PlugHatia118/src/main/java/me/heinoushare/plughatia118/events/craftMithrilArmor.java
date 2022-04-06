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

public class craftMithrilArmor implements Listener {

    @EventHandler
    public static void onPrepareCraftMithrilArmor(PrepareItemCraftEvent e) {
        if (e.getInventory().getMatrix().length < 9) {
            return;
        }

        // Make sure crafter is a Dwarf
        List<HumanEntity> viewers = e.getViewers();
        for (HumanEntity temp : viewers) {
            Player p = Bukkit.getPlayer(temp.getName());
            UUID uuid = p.getUniqueId();
            if (!playerStorageUtil.findPlayer(uuid).getRace().equalsIgnoreCase("Dwarf")) {
                return;
            }
        }

        // Mithril Helmet
        itemManager.checkCraft(itemManager.mithrilHelmet, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.mithrilIngot);
            put(1, itemManager.mithrilIngot);
            put(2, itemManager.mithrilIngot);
            put(3, itemManager.mithrilIngot);
            put(4, null);
            put(5, itemManager.mithrilIngot);
            put(6, null);
            put(7, null);
            put(8, null);
        }});

        // Mithril Chestplate
        itemManager.checkCraft(itemManager.mithrilChestplate, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.mithrilIngot);
            put(1, null);
            put(2, itemManager.mithrilIngot);
            put(3, itemManager.mithrilIngot);
            put(4, itemManager.mithrilIngot);
            put(5, itemManager.mithrilIngot);
            put(6, itemManager.mithrilIngot);
            put(7, itemManager.mithrilIngot);
            put(8, itemManager.mithrilIngot);
        }});

        // Mithril Leggings
        itemManager.checkCraft(itemManager.mithrilLeggings, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.mithrilIngot);
            put(1, itemManager.mithrilIngot);
            put(2, itemManager.mithrilIngot);
            put(3, itemManager.mithrilIngot);
            put(4, null);
            put(5, itemManager.mithrilIngot);
            put(6, itemManager.mithrilIngot);
            put(7, null);
            put(8, itemManager.mithrilIngot);
        }});

        // Steel Boots
        itemManager.checkCraft(itemManager.mithrilBoots, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, null);
            put(2, null);
            put(3, itemManager.mithrilIngot);
            put(4, null);
            put(5, itemManager.mithrilIngot);
            put(6, itemManager.mithrilIngot);
            put(7, null);
            put(8, itemManager.mithrilIngot);
        }});

        // Wood for shield
        ItemStack wood = new ItemStack(Material.OAK_PLANKS);
        // Steel Shield
        itemManager.checkCraft(itemManager.mithrilShield, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, wood);
            put(1, itemManager.mithrilIngot);
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
