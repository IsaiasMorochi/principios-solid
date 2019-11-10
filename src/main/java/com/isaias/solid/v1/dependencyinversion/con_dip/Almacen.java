package com.isaias.solid.v1.dependencyinversion.con_dip;

import java.util.ArrayList;
import java.util.List;

public class Almacen implements IAuditable {

    // ya no hay necesidad de dar acceso a la lista
    private List<Producto> inventario;

    public Almacen() {
        this.inventario = new ArrayList<>();
    }

    public void adicionaProducto(Producto producto) {
        inventario.add(producto);
        System.out.println("Adicionamos: " + producto.getNombre());
    }

    /**
     * Con la implementacion se realiza una busqueda flexible
     * Ahora la clase auditor regresa una lista, en lugar de que TRABAJE CON LA LISTA DE ALMACEN.
     * @param tipo
     * @return
     */
    @Override
    public Iterable<Producto> obtenerProductos(int tipo) {
        List<Producto> encontrados = new ArrayList<>();
        for (Producto producto : inventario){
            if (producto.getTipo() == tipo){
                encontrados.add(producto);
            }
        }
        return encontrados;
    }
}
