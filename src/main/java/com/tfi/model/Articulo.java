package com.tfi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "articulos")
public class Articulo {

    @Id
    private String codigo;
    private String descripcion;
    private double costo;
    private double margenGanancia;
    private double netoGravado;
    private double iva;
    private double precioVenta;

    @DBRef
    private Categoria categoria;

    @DBRef
    private Marca marca;

    public Articulo() {

    }

    public Articulo(String codigo, String descripcion, double costo, double margenGanancia, double netoGravado, double iva, double precioVenta, Categoria categoria, Marca marca) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.margenGanancia = margenGanancia;
        this.netoGravado = netoGravado;
        this.iva = iva;
        this.precioVenta = precioVenta;
        this.categoria = categoria;
        this.marca = marca;
    }
/*public Articulo(String codigo, String descripcion, double costo, double margenGanancia, double iva, Categoria categoria, Marca marca) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.margenGanancia = margenGanancia;
        this.netoGravado = costo + costo * margenGanancia;
        this.iva = iva;
        this.precioVenta = (costo + costo * margenGanancia)+((costo + costo * margenGanancia)*(iva/100));
        this.categoria = categoria;
        this.marca = marca;

    }*/

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
}
