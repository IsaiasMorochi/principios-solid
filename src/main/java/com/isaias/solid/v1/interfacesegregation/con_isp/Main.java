package com.isaias.solid.v1.interfacesegregation.con_isp;

import com.isaias.solid.v1.interfacesegregation.con_isp.impl.Fax;
import com.isaias.solid.v1.interfacesegregation.con_isp.impl.MultiAvanzado;
import com.isaias.solid.v1.interfacesegregation.con_isp.impl.MultiSencillo;

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

        System.out.println("--------------------");

        MultiSencillo sencillo = new MultiSencillo();
        sencillo.escanear();
        sencillo.imprimir();

    }
}
