package me.heinoushare.plughatia118.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class steelTools {

    public static void steelToolsInit() {
        createSteelSword();
        createSteelAxe();
        createSteelPickaxe();
        createSteelShovel();
        createSteelHoe();
    }

    public static void createSteelSword() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Steel Sword");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 1, false);
        meta.addEnchant(Enchantment.DURABILITY, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.steelSword = item;

        // Crafting recipe in events.craftSteelTools
    }

    public static void createSteelAxe() {
        ItemStack item = new ItemStack(Material.IRON_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Steel Axe");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
        meta.addEnchant(Enchantment.DURABILITY, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.steelAxe = item;

        // Crafting recipe in events.craftSteelTools
    }

    public static void createSteelPickaxe() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Steel Pickaxe");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
        meta.addEnchant(Enchantment.DURABILITY, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.steelPickaxe = item;

        // Crafting recipe in events.craftSteelTools
    }

    public static void createSteelShovel() {
        ItemStack item = new ItemStack(Material.IRON_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Steel Shovel");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
        meta.addEnchant(Enchantment.DURABILITY, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.steelShovel = item;

        // Crafting recipe in events.craftSteelTools
    }

    public static void createSteelHoe() {
        ItemStack item = new ItemStack(Material.IRON_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Steel Hoe");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.DIG_SPEED, 1, false);
        meta.addEnchant(Enchantment.DURABILITY, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.steelHoe = item;

        // Crafting recipe in events.craftSteelTools
    }

}
