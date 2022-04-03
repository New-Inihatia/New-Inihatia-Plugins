package me.heinoushare.plughatia118.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.BlastingRecipe;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class elvenSteelIngot {

    public static void createElvenSteelIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Elven Steel Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("Created in the");
        lore.add("depths of ");
        lore.add("Eregion by Elfs");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.elvenSteelIngot = item;

        // Shaped Recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("elven_steel_ingot"), item);
        sr.shape("EIE",
                "IEI",
                "EIE");
        sr.setIngredient('E', Material.EMERALD);
        sr.setIngredient('I', Material.IRON_INGOT);

        Bukkit.getServer().addRecipe(sr);

    }

}
