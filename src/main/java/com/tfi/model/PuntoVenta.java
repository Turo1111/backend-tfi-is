package com.tfi.model;

public class PuntoVenta extends Sucursal {
    private long numeroPv;

    public PuntoVenta() {
    }

    public PuntoVenta(long id, String nombre, String telefono, String direccion, String cuit, long numeroSucursal, long numeroPv) {
        super(id, nombre, telefono, direccion, cuit, numeroSucursal);
        this.numeroPv = numeroPv;
    }

    public long getNumeroPv() {
        return numeroPv;
    }

    public void setNumeroPv(long numeroPv) {
        this.numeroPv = numeroPv;
    }
}
