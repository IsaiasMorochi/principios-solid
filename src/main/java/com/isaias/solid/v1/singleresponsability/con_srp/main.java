package com.isaias.solid.v1.singleresponsability.con_srp;

public class main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pepito", "Programador", 23, 1800);
        System.out.println(empleado.toString());

        System.out.println(Hacienda.calcularImpuesto(empleado));
        Hacienda.pagarImpuesto(empleado);

    }
}
