package com.isaias.solid.v1.liskowsustitution.sin_lsp;

public class Noticiero {

    private String mensaje;

    public Noticiero(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void muestra() {
        System.out.println("Desde el noticiero: " + mensaje);
    }
}
