package com.tfi.model;

public class Stock {
    private long id;
    private Articulo articulo;
    private Talle talle;
    private Color color;

    private Number cantidad;

    public Stock() {
    }

    public Stock(long id, Articulo articulo, Talle talle, Color color, Number cantidad) {
        this.id = id;
        this.articulo = articulo;
        this.talle = talle;
        this.color = color;
        this.cantidad = cantidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Talle getTalle() {
        return talle;
    }

    public void setTalle(Talle talle) {
        this.talle = talle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Number getCantidad() {
        return cantidad;
    }

    public void setCantidad(Number cantidad) {
        this.cantidad = cantidad;
    }
}
