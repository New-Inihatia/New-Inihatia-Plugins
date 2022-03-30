package me.heinoushare.plughatia118.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.CampfireRecipe;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class steelIngot {

    public static void createSteelIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Steel Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("Originally created");
        lore.add("by Dwarfs");
        lore.add("and adopted by");
        lore.add("Orks and men");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.steelIngot = item;

        // Campfire Recipe
        Bukkit.addRecipe(new CampfireRecipe(NamespacedKey.minecraft("steel_ingot"), item, Material.IRON_INGOT, 1.0f, 20 * 20));

    }

}
