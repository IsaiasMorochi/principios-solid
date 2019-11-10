package com.isaias.solid.v1.interfacesegregation.con_isp.impl;

import com.isaias.solid.v1.interfacesegregation.con_isp.IMultiCompleto;

public class MultiAvanzado implements IMultiCompleto {

    @Override
    public void telefono() {
        System.out.println("Te marco a un telefono.");
    }

    @Override
    public void faxear() {
        System.out.println("Envio un fax");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimo tu documento");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneo una fotografia.");
    }

}
