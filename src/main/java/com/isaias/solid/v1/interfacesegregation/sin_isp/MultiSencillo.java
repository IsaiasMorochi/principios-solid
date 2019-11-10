package com.isaias.solid.v1.interfacesegregation.sin_isp;

public class MultiSencillo implements IMultifuncional {

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
        throw new NotImplementedException();
    }

    @Override
    public void faxear() {
        throw new NotImplementedException();
    }

}
