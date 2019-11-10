package com.isaias.solid.v1.liskowsustitution.con_lsp;

public abstract class Principal {

    protected String mensaje;

    public Principal(String mensaje) {
        this.mensaje = mensaje;
    }

    // Lo creamos como metodo abstracto para que cada clase lo implemente
    public abstract void muestra();
}
