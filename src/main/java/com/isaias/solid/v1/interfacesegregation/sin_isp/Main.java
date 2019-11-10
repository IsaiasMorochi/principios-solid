package com.isaias.solid.v1.interfacesegregation.sin_isp;

public class Main {

    public static void main(String[] args) {

        MultiAvanzado avanzado = new MultiAvanzado();
        avanzado.escanear();
        avanzado.faxear();
        avanzado.imprimir();
        avanzado.telefono();

        System.out.println("--------------------");

        Fax fax = new Fax();
        fax.telefono();
        fax.faxear();
        fax.imprimir();

        System.out.println("--------------------");

        MultiSencillo sencillo = new MultiSencillo();
        sencillo.escanear();
        sencillo.imprimir();
        // sencillo.telefono(); // lanza excepcion

    }
}
