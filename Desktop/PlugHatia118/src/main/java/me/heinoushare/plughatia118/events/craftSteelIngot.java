package me.heinoushare.plughatia118.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class craftSteelIngot implements Listener {

    @EventHandler
    public static void onCraftSteelIngot(CraftItemEvent event) {

        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Steel Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("Originally created by Dwarfs");
        lore.add("and adopted by Orks");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        // Shapeless Recipe
        ShapelessRecipe sar = new ShapelessRecipe(NamespacedKey.minecraft("steelIngot"), item);
        sar.addIngredient(9, Material.IRON_NUGGET);

        Inventory inv = event.getInventory();
        ItemStack[] items = inv.getContents();
        Player player = (Player)event.getWhoClicked();

        // Check if they're crafting salad by checking the Material.
        // if (evt.getResult().getType().equals(Material.LEAVES)){

        // I don't know if this works, if not use the one above ^
        if (event.getRecipe().equals(sar)) {

        // Iterate through the ingredients, looking for the right display names.
        // Cancel event and return immediately if one doesn't match lettuce or tomato.
            for (int i = 0; i < items.length; i++) {
                if (!items[i].hasItemMeta()) {
                    event.setCancelled(true);
                    player.sendMessage("That is not the right recipe for a Steel Ingot.");
                    return;
                }
                if (!(items[i].getItemMeta().getDisplayName().equals("Steel Nugget"))) {
                    event.setCancelled(true);
                    player.sendMessage("That is not the right recipe for a Steel Ingot.");
                    return;
                }
            }

        }

    }
}
