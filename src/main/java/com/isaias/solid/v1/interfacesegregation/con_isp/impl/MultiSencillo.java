package com.isaias.solid.v1.interfacesegregation.con_isp.impl;

import com.isaias.solid.v1.interfacesegregation.con_isp.IMultiBasico;

public class MultiSencillo implements IMultiBasico {
    @Override
    public void imprimir() {
        System.out.println("Imprimo tu documento");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneo una fotografia.");
    }
}
