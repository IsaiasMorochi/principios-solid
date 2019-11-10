package com.isaias.solid.v1.openclosed.con_ocp;

public class InventarioAlimento extends BaseInventario {

    public InventarioAlimento(Producto producto) {
        super(producto);
    }

    public double calcularProducto() {
        double nuevoPrecio = producto.getPrecio() * 0.80;
        producto.setPrecio(nuevoPrecio);
        return producto.getPrecio();
    }

}
