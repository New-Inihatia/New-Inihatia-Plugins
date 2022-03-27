package me.heinoushare.plughatia118.items;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemManager {

    public static ItemStack steelIngot;
//    public static ItemStack steelNugget;

    public static void init() {
        createSteelIngot();
//        createSteelNugget();
    }

    private static void createSteelIngot() {
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
        steelIngot = item;

        // Shapeless Recipe
//        ShapelessRecipe sar = new ShapelessRecipe(NamespacedKey.minecraft("steel_ingot"), item);
//        sar.addIngredient(9, Material.IRON_NUGGET);
//        Bukkit.getServer().addRecipe(sar);

    }

//    private static void createSteelNugget() {
//        ItemStack item = new ItemStack(Material.IRON_NUGGET, 1);
//        ItemMeta meta = item.getItemMeta();
//        meta.setDisplayName(ChatColor.GRAY + "Steel Nugget");
//        List<String> lore = new ArrayList<>();
//        lore.add("Originally created by Dwarfs");
//        lore.add("and adopted by Orks");
//        meta.setLore(lore);
//        meta.addEnchant(Enchantment.LUCK, 1, false);
//        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//        item.setItemMeta(meta);
//        steelNugget = item;
//    }

}
