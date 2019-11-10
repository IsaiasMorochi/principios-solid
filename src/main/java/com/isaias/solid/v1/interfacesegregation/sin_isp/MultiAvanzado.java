package com.isaias.solid.v1.interfacesegregation.sin_isp;

public class MultiAvanzado implements IMultifuncional {

    @Override
    public void imprimir() {
        System.out.println("Imprimo tu reporte.");
    }

    @Override
    public void escanear() {
        System.out.println("Estoy escaneando un documento.");
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