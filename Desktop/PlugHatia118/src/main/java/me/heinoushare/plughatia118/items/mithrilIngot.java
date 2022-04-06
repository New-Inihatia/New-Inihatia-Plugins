package me.heinoushare.plughatia118.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class mithrilIngot {

    public static void createMithrilIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Mithril Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("The finest Mithril");
        lore.add("forged in the iron hills");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.mithrilIngot = item;

        // Recipe handled by events.craftMithrilIngot

    }

}
