package com.isaias.solid.v1.liskowsustitution.sin_lsp;

public class Main {

    public static void main(String[] args) {
        Noticiero noticiero = new Noticiero("Hola a todos");
        noticiero.muestra();

        Radio radio = new Radio("Como estan? ");
        radio.muestra();

        System.out.println("----------------------------------");

        // sustituimos la clase hija y vemos el comportamiento
        Noticiero sutitucion = new Radio("Estamos probando noticia");
        sutitucion.muestra();
    }
}
