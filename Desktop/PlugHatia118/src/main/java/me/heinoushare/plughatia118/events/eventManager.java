package me.heinoushare.plughatia118.events;

import me.heinoushare.plughatia118.PlugHatia118;
import org.bukkit.Bukkit;

import static org.bukkit.Bukkit.getServer;

public class eventManager {

    public static void init() {

        int maxPlayerCount = Bukkit.getServer().getMaxPlayers();
        playerHurt.init(maxPlayerCount);

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

        getServer().getPluginManager().registerEvents(new mineHardBlock(), PlugHatia118.getPlugin());

        getServer().getPluginManager().registerEvents(new craftMithrilIngot(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new craftMithrilArmor(), PlugHatia118.getPlugin());
        getServer().getPluginManager().registerEvents(new craftMithrilTools(), PlugHatia118.getPlugin());

        getServer().getPluginManager().registerEvents(new playerRespawn(), PlugHatia118.getPlugin());

        getServer().getPluginManager().registerEvents(new playerHurt(), PlugHatia118.getPlugin());

        getServer().getPluginManager().registerEvents(new playerEquipBoots(), PlugHatia118.getPlugin());

    }

}
