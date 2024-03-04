package com.tfi.model;

public class Sucursal extends Tienda{

    private long numeroSucursal;

    public Sucursal() {
    }

    public Sucursal(long id, String nombre, String telefono, String direccion, String cuit, long numeroSucursal) {
        super(id, nombre, telefono, direccion, cuit);
        this.numeroSucursal = numeroSucursal;
    }

    public long getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(long numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }
}
