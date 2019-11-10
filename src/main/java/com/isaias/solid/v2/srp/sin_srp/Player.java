package com.isaias.solid.v2.srp.sin_srp;

public class Player {

    private int id;
    private String name;
    private int win;
    private int lose;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Negocio
     */
    public Double winPercentage(Player player) {
        return Double.valueOf(player.getWin() / (player.getWin() + player.getLose()));
    }

    public Double lossPercentage(Player player) {
        return 0.0;
    }

    /**
     * persistencia
     */
    public void savePlayer(Player player) {
        // guarda el player
    }

    public void deletePlayer(Player player) {
        // elimina el player
    }

    /**
     * View
     */


}
