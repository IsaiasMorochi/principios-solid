package com.isaias.solid.v2.dip;

public class Main {
    /**
     * 5to Principle
     * DIP (Dependency Inversion Principle)
     * 1.- La clase de alto nivel no debe depender de la clase de bajo nivel.
     * 2.- Las abstraciones no deben depender de los detalles, los detalles
     *     deben depender de las abstraciones.
     */

    /**
     * Especificacion
     * 1.- Diseñar una clase para acceder a datos locales
     * 2.- Diseñar una clase para acceder a datos de una BD
     */

    /**
     * Sin DIP
     * UserManager --> LocalUserRepository
     *
     * Con DIP
     * UserManager --> UserRepository(interface) <-- LocalUserRepository
     * UserManager --> UserRepository(interface) <-- MongoUserRepository
     */

    /**
     * Nota
     * Con este principio evitamos el fuerte acoplamiento y un cambio de una clase
     * de bajo nivel no deberia afectar a una clase de alto nivel.
     */

}
