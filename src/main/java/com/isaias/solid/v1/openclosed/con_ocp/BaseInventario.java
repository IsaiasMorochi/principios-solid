package com.isaias.solid.v1.openclosed.con_ocp;

public abstract class BaseInventario {

    protected Producto producto;

    public BaseInventario(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return producto.toString();
    }

    public abstract double calcularProducto();
}
