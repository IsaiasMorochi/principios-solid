package com.isaias.solid.v1.dependencyinversion.con_dip;

/**
 * Clase de alto nivel
 */
public class Auditor {

    // tendra una referencia y podra trabajar con cualquiera que implemente a IAuditable
    private IAuditable almacen;

    // Ahora el auditor no esta fuertemente acoplado con almacen
    public Auditor(IAuditable almacen) {
        this.almacen = almacen;
    }

    public double totalAlimentos() {
        double total = 0;
        int tipoProducto = 0; // 0 Alimento, 1 Medicina, 2 Ropa

        Iterable<Producto> listado = almacen.obtenerProductos(tipoProducto);

        for (Producto producto : listado){
                System.out.println(producto.toString());
                total += producto.getPrecio();
        }
        return total;
    }

}
