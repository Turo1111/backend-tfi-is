package com.tfi.model;

public class Pago {

    private long id;
    private double cantidad;

    public Pago() {
    }

    public Pago(long id, double cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
