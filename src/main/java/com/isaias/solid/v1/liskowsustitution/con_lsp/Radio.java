package com.isaias.solid.v1.liskowsustitution.con_lsp;


public class Radio extends Principal {

    public Radio(String mensaje) {
        super(mensaje);
    }

    public void muestra(){
        System.out.println("Desde el radio: " + mensaje);
    }
}
