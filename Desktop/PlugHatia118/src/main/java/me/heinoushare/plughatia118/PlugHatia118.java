package me.heinoushare.plughatia118;

import me.heinoushare.plughatia118.commands.setRace;
import me.heinoushare.plughatia118.commands.speed;
import me.heinoushare.plughatia118.events.playerChangeMode;
import me.heinoushare.plughatia118.events.playerJoin;
import me.heinoushare.plughatia118.events.playerSneak;
//import me.heinoushare.plughatia118.events.playerWalk;
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

        getServer().getPluginManager().registerEvents(new playerJoin(), this);
        getServer().getPluginManager().registerEvents(new playerChangeMode(), this);
        getServer().getPluginManager().registerEvents(new playerSneak(), this);
//        getServer().getPluginManager().registerEvents(new playerWalk(), this);

        getCommand("setRace").setExecutor(new setRace());
        getCommand("speed").setExecutor(new speed());

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
