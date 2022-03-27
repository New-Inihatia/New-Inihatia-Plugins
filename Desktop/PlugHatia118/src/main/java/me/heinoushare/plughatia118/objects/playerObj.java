package me.heinoushare.plughatia118.objects;

import java.util.UUID;

public class playerObj {

    UUID uuid;
    String username;
    String race;
    String CLASS;

    public playerObj(UUID uuid, String username, String race, String CLASS) {
        this.uuid = uuid;
        this.username = username;
        this.race = race;
        this.CLASS = CLASS;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }
}