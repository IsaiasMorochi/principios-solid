package com.isaias.solid.v2.srp.con_srp;

public class PlayerDomain {

    public Double winPercentage(Player player) {
        return Double.valueOf(player.getWin() / (player.getWin() + player.getLose()));
    }

    public Double lossPercentage(Player player) {
        return 0.0;
    }

}
