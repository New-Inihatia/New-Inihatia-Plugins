package me.heinoushare.plughatia118.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.SmithItemEvent;
import org.bukkit.inventory.ItemStack;

public class bannedItems implements Listener {

    @EventHandler
    public static void onCraftDiamondItem(CraftItemEvent e) {
        HumanEntity p = e.getWhoClicked();
        ItemStack result = e.getInventory().getResult();

        // Diamond armor
        if (
                result.equals(new ItemStack(Material.DIAMOND_HELMET))
                ||
                result.equals(new ItemStack(Material.DIAMOND_CHESTPLATE))
                ||
                result.equals(new ItemStack(Material.DIAMOND_LEGGINGS))
                ||
                result.equals(new ItemStack(Material.DIAMOND_BOOTS))

                ) {
            e.setCancelled(true);
            p.getInventory().removeItem(result);
            p.sendMessage(ChatColor.DARK_RED + "That item is banned! No diamond armor on Middle Earth. . .");
            p.closeInventory();
        }

        // Diamond tools
        if (
                result.equals(new ItemStack(Material.DIAMOND_SWORD))
                ||
                result.equals(new ItemStack(Material.DIAMOND_AXE))
                ||
                result.equals(new ItemStack(Material.DIAMOND_SHOVEL))
                ||
                result.equals(new ItemStack(Material.DIAMOND_PICKAXE))
                ||
                result.equals(new ItemStack(Material.DIAMOND_HOE))
                ) {
            e.setCancelled(true);
            p.getInventory().removeItem(result);
            p.sendMessage(ChatColor.DARK_RED + "That item is banned! No diamond tools on Middle Earth. . .");
            p.closeInventory();
        }
    }

    @EventHandler
    public static void onCraftNetheriteItem(SmithItemEvent e) {

        HumanEntity p = e.getWhoClicked();
        ItemStack result = e.getInventory().getResult();

        // Netherite armor
        if (
                result.equals(new ItemStack(Material.NETHERITE_HELMET))
                ||
                result.equals(new ItemStack(Material.NETHERITE_CHESTPLATE))
                ||
                result.equals(new ItemStack(Material.NETHERITE_LEGGINGS))
                ||
                result.equals(new ItemStack(Material.NETHERITE_BOOTS))

                ) {
            e.setCancelled(true);
            p.getInventory().removeItem(result);
            p.sendMessage(ChatColor.DARK_RED + "That item is banned! No netherite armor on Middle Earth. . .");
            p.closeInventory();
        }

        // Netherite tools
        if (
                result.equals(new ItemStack(Material.NETHERITE_SWORD))
                ||
                result.equals(new ItemStack(Material.NETHERITE_AXE))
                ||
                result.equals(new ItemStack(Material.NETHERITE_SHOVEL))
                ||
                result.equals(new ItemStack(Material.NETHERITE_PICKAXE))
                ||
                result.equals(new ItemStack(Material.NETHERITE_HOE))
                ) {
            e.setCancelled(true);
            p.getInventory().removeItem(result);
            p.sendMessage(ChatColor.DARK_RED + "That item is banned! No netherite tools on Middle Earth. . .");
            p.closeInventory();
        }

    }

}
