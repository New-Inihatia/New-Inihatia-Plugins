package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.PlugHatia118;

import static org.bukkit.Bukkit.getServer;

public class eventManager {

    public static void init() {
        bannedItems.init();

        getServer().getPluginManager().registerEvents(new playerJoin(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new playerChangeMode(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new playerSneak(), PlugHatia118.getPlugin());

        getServer().getPluginManager().registerEvents(new craftSteelArmor(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new craftSteelTools(), PlugHatia118.getPlugin());

        getServer().getPluginManager().registerEvents(new bannedItems(), PlugHatia118.getPlugin());

        getServer().getPluginManager().registerEvents(new craftElvenSteelIngot(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new craftElvenSteelArmor(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new craftElvenSteelTools(), PlugHatia118.getPlugin());

        getServer().getPluginManager().registerEvents(new mineObsidian(), PlugHatia118.getPlugin());
    }

}
