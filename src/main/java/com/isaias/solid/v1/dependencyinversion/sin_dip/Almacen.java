package com.isaias.solid.v1.dependencyinversion.sin_dip;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de bajo nivel
 */
public class Almacen {

    private List<Producto> productoList;


    public Almacen() {
        this.productoList = new ArrayList<>();
    }

    /**
     * Nos vemos forzados a implementar la proiedad para que se pueda contar el inventario
     * Al ser una propiedad del tipo List forzamos a Auditor a trabajar con List
     */

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public void adicionaProducto(Producto producto) {
        productoList.add(producto);
        System.out.println("Adicionamos: " + producto.getNombre());
    }
}
