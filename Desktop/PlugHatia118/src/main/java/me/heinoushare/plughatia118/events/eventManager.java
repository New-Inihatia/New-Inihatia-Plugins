package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.PlugHatia118;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

import static org.bukkit.Bukkit.getServer;

public class eventManager {

    public static void init() {
        getServer().getPluginManager().registerEvents(new playerJoin(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new playerChangeMode(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new playerSneak(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new craftSteelHelmet(), PlugHatia118.getPlugin());
    }

}
