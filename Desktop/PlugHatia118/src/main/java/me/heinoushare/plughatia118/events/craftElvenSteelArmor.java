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

public class craftElvenSteelArmor implements Listener {

    @EventHandler
    public static void onCraftElvenSteelArmor(PrepareItemCraftEvent e) {

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

        // Elven Steel Helmet
        itemManager.checkCraft(itemManager.elvenSteelHelmet, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.elvenSteelIngot);
            put(1, itemManager.elvenSteelIngot);
            put(2, itemManager.elvenSteelIngot);
            put(3, itemManager.elvenSteelIngot);
            put(4, null);
            put(5, itemManager.elvenSteelIngot);
            put(6, null);
            put(7, null);
            put(8, null);
        }});

        // Elven Steel Chestplate
        itemManager.checkCraft(itemManager.elvenSteelChestplate, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.elvenSteelIngot);
            put(1, null);
            put(2, itemManager.elvenSteelIngot);
            put(3, itemManager.elvenSteelIngot);
            put(4, itemManager.elvenSteelIngot);
            put(5, itemManager.elvenSteelIngot);
            put(6, itemManager.elvenSteelIngot);
            put(7, itemManager.elvenSteelIngot);
            put(8, itemManager.elvenSteelIngot);
        }});

        // Elven Steel Leggings
        itemManager.checkCraft(itemManager.elvenSteelLeggings, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, itemManager.elvenSteelIngot);
            put(1, itemManager.elvenSteelIngot);
            put(2, itemManager.elvenSteelIngot);
            put(3, itemManager.elvenSteelIngot);
            put(4, null);
            put(5, itemManager.elvenSteelIngot);
            put(6, itemManager.elvenSteelIngot);
            put(7, null);
            put(8, itemManager.elvenSteelIngot);
        }});

        // Elven Steel Boots
        itemManager.checkCraft(itemManager.elvenSteelBoots, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, null);
            put(1, null);
            put(2, null);
            put(3, itemManager.elvenSteelIngot);
            put(4, null);
            put(5, itemManager.elvenSteelIngot);
            put(6, itemManager.elvenSteelIngot);
            put(7, null);
            put(8, itemManager.elvenSteelIngot);
        }});

        // Wood for shield
        ItemStack wood = new ItemStack(Material.OAK_PLANKS);
        // Elven Steel Shield
        itemManager.checkCraft(itemManager.elvenSteelShield, e.getInventory(), new HashMap<Integer, ItemStack>(){{
            put(0, wood);
            put(1, itemManager.elvenSteelIngot);
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
