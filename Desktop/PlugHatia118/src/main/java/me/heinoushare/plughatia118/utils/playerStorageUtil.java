package me.heinoushare.plughatia118.utils;

import com.google.gson.Gson;
import me.heinoushare.plughatia118.PlugHatia118;
import me.heinoushare.plughatia118.objects.playerObj;
import org.bukkit.entity.Player;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class playerStorageUtil {

    private static ArrayList<playerObj> players = new ArrayList<>();

    public static playerObj createPlayer(Player player, String race, String CLASS) {

        playerObj newPlayer = new playerObj(player.getUniqueId(), player.getDisplayName(), race, CLASS);
        players.add(newPlayer);

        try {
            savePlayers();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newPlayer;

    }

    public static playerObj findPlayer(UUID uuid) {

        for (playerObj thePlayer : players) {
            if (thePlayer.getUuid().equals(uuid)) {
                return thePlayer;
            }
        }
        return null;
    }

    public static playerObj updatePlayer(UUID uuid, playerObj newPlayer) {

        for (playerObj thePlayer : players) {
            if (thePlayer.getUuid().equals(uuid)) {
                thePlayer.setUuid(newPlayer.getUuid());
                thePlayer.setUsername(newPlayer.getUsername());
                thePlayer.setRace(newPlayer.getRace());
                thePlayer.setCLASS(newPlayer.getCLASS());

                try {
                    savePlayers();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return thePlayer;
            }
        }
        return null;
    }

    public static void savePlayers() throws IOException {

        Gson gson = new Gson();
        File file = new File(PlugHatia118.getPlugin().getDataFolder().getAbsolutePath() + "/players.json");
        file.getParentFile().mkdir();
        file.createNewFile();
        Writer writer = new FileWriter(file, false);
        gson.toJson(players, writer);
        writer.flush();
        writer.close();
        System.out.println("Players saved.");

    }

    public static void loadPlayers() throws IOException {

        Gson gson = new Gson();
        File file = new File(PlugHatia118.getPlugin().getDataFolder().getAbsolutePath() + "/players.json");
        if (file.exists()) {
            Reader reader = new FileReader(file);
            playerObj[] p = gson.fromJson(reader, playerObj[].class);
            players = new ArrayList<>(Arrays.asList(p));
            System.out.println("Players loaded.");
        }

    }

}
