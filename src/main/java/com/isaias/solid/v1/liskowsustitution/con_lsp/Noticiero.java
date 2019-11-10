package com.isaias.solid.v1.liskowsustitution.con_lsp;

public class Noticiero extends Principal{


    public Noticiero(String mensaje) {
        super(mensaje);
    }

    public void muestra() {
        System.out.println("Desde el noticiero : " + mensaje);
    }


}
