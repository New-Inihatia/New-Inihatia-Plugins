package me.heinoushare.plughatia118;

import me.heinoushare.plughatia118.commands.*;
import me.heinoushare.plughatia118.events.*;
import me.heinoushare.plughatia118.items.itemManager;
import me.heinoushare.plughatia118.utils.playerStorageUtil;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class PlugHatia118 extends JavaPlugin {

    private static PlugHatia118 plugin;
    public static Server server;

    @Override
    public void onEnable() {
        // Plugin startup logic

        plugin = this;

        eventManager.init();

        itemManager.init();

        getCommand("setRace").setExecutor(new setRace());
        getCommand("speed").setExecutor(new speed());
        getCommand("leap").setExecutor(new leap());
        getCommand("giveSteelIngot").setExecutor(new giveSteelIngot());
        getCommand("giveSteelHelmet").setExecutor(new giveSteelHelmet());

        try {
            playerStorageUtil.loadPlayers();
        } catch (IOException e) {
            e.printStackTrace();
        }

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "PlugHatia118 has started!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "PlugHatia118 has shut down!");

    }

    public static PlugHatia118 getPlugin() {
        return plugin;
    }

}
