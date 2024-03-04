package com.tfi.model;

public class LineaVenta {
    private long id;
    private Number cantidad;
    private double subTotal;
    private double total;
    private Venta venta;
    private Articulo articulo;

    public LineaVenta() {
    }

    public LineaVenta(long id, Number cantidad, double subTotal, double total, Venta venta, Articulo articulo) {
        this.id = id;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.total = total;
        this.venta = venta;
        this.articulo = articulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Number getCantidad() {
        return cantidad;
    }

    public void setCantidad(Number cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
