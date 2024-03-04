package com.tfi.model;

import java.util.ArrayList;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double costo;
    private double margenGanancia;
    private double netoGravado;
    private double iva;
    private double precioVenta;
    private Categoria categoria;
    private Marca marca;
    private ArrayList<Talle> talle;
    private ArrayList<Color> color;

    public Articulo() {

    }

    public Articulo(String codigo, String descripcion, double costo, double margenGanancia, double iva, Categoria categoria, Marca marca, ArrayList<Talle> talle, ArrayList<Color> color) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.margenGanancia = margenGanancia;
        this.netoGravado = costo + costo * margenGanancia;
        this.iva = iva;
        this.precioVenta = (costo + costo * margenGanancia)+((costo + costo * margenGanancia)*(iva/100));
        this.categoria = categoria;
        this.marca = marca;
        this.talle = talle;
        this.color = color;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public double getNetoGravado() {
        return netoGravado;
    }

    public void setNetoGravado(double netoGravado) {
        this.netoGravado = netoGravado;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public ArrayList<Talle> getTalle() {
        return talle;
    }

    public void setTalle(ArrayList<Talle> talle) {
        this.talle = talle;
    }

    public ArrayList<Color> getColor() {
        return color;
    }

    public void setColor(ArrayList<Color> color) {
        this.color = color;
    }
}
