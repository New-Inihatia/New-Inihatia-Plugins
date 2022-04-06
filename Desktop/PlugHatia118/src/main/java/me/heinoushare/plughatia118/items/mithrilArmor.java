package me.heinoushare.plughatia118.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class mithrilArmor {

    public static void mithrilArmorInit()
    {
        createMithrilHelmet();
        createMithrilChestplate();
        createMithrilLeggings();
        createMithrilBoots();
        createMithrilShield();
    }

    public static void createMithrilHelmet() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Mithril Coif");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.mithrilHelmet = item;

        // Crafting recipe in events.craftMithrilArmor
    }

    public static void createMithrilChestplate() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Mithril Shirt");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.mithrilChestplate = item;

        // Crafting recipe in events.craftMithrilArmor
    }

    public static void createMithrilLeggings() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Mithril Leggings");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.mithrilLeggings = item;

        // Crafting recipe in events.craftMithrilArmor
    }

    public static void createMithrilBoots() {
        ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Mithril Boots");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.mithrilBoots = item;

        // Crafting recipe in events.craftMithrilArmor
    }

    public static void createMithrilShield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA + "Mithril Shield");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.DURABILITY, 3, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        itemManager.mithrilShield = item;

        // Crafting recipe in events.craftMithrilArmor
    }

}
