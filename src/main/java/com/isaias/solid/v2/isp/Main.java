package com.isaias.solid.v2.isp;

public class Main {

    /**
     * 4to Principle
     * ISP (Interface Segregation Principle)
     * 1.- Ninguna clase debe implementar metodos que no utilice.
     */

    /**
     * Especificaciones
     * 1- Diseña una interfaz para gestionar Pago
     * 2- Diseña la clase Visa para gestionar pagos de Trajeta de credito.
     * 3- Diseña la clase Amex para gestionar pagos de Trajeta de credito American Express.
     * 4- Diseña la clase BankTransfer para gestionar pagos por transferencia bancaria.
     * 5- Diseña la clase Cash para gestionar pagos por efectivo.
     */

    /**
     * Nota.
     * Es mucho mejor tener muchas interface especificas a tener interfaces que obliguen a las
     * clases a implementar metodos que no utilizan es decir evitar usar interface de proposito
     * general.
     */
}
