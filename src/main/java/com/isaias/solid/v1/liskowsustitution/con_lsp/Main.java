package com.isaias.solid.v1.liskowsustitution.con_lsp;

public class Main {

    public static void main(String[] args) {
        Principal noticiero = new Noticiero("Hola a todos");
        noticiero.muestra();

        Principal radio = new Radio("Como estan? ");
        radio.muestra();
    }
}
