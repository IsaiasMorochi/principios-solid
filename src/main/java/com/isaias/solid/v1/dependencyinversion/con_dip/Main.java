package com.isaias.solid.v1.dependencyinversion.con_dip;


public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        double total = 0;

        // 0 alimento, 1 medicina, 2 ropa
        almacen.adicionaProducto(new Producto("Tomate",0, 15.50));
        almacen.adicionaProducto(new Producto("Banana",0, 30.0));
        almacen.adicionaProducto(new Producto("Analgesico",1, 23.80));
        almacen.adicionaProducto(new Producto("Jeans", 2,450.99));
        almacen.adicionaProducto(new Producto("Manzana", 0, 12.38));
        almacen.adicionaProducto(new Producto("Antiacido", 1, 38.50));
        almacen.adicionaProducto(new Producto("Blusa", 2, 200.88));

        System.out.println("---------------------------------");

        Auditor auditor = new Auditor(almacen);
        total = auditor.totalAlimentos();

        System.out.println("El total de alimentos es : " + total);
    }
}
