package com.isaias.solid.v1.dependencyinversion.sin_dip;

/**
 * Clase de alto nivel
 */
public class Auditor {

    private Almacen almacen;

    // estan fuertemente acoplados, solamente puede trabajar con almacen
    public Auditor(Almacen almacen) {
        this.almacen = almacen;
    }

    public double totalAlimentos() {
        double total = 0;
        for (Producto producto : almacen.getProductoList()){
            if (producto.getTipo() == 0){
                System.out.println(producto.toString());
                total += producto.getPrecio();
            }
        }
        return total;
    }

}
