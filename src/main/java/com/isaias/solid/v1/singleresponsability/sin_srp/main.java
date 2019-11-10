package com.isaias.solid.v1.singleresponsability.sin_srp;

public class main {

    public static void main(String[] args) {
        Empleado e = new Empleado("Pepito", "Programador", 23, 1800);
        System.out.println(e.toString());
        e.pagarImpuesto();
    }
}
