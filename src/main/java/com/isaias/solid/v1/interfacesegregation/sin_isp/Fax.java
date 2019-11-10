package com.isaias.solid.v1.interfacesegregation.sin_isp;

public class Fax implements IMultifuncional {

    @Override
    public void imprimir() {
        System.out.println("No tengo este servicio.");
    }

    @Override
    public void escanear() {
        System.out.println("No tengo este servicio.");
    }

    @Override
    public void telefono() {
        System.out.println("Te marco a un telefono.");
    }

    @Override
    public void faxear() {
        System.out.println("Envio un fax");
    }

}
