package com.isaias.solid.v1.liskowsustitution.sin_lsp;

public class Radio extends Noticiero {

    public Radio(String mensaje) {
        super(mensaje);
    }

    public void muestra(){
        System.out.println("Desde el radio: " + getMensaje());
    }
}
