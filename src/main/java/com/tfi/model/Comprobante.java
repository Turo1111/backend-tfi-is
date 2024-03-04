package com.tfi.model;

import java.util.Date;
import java.util.List;

public class Comprobante extends Venta {
    private long numero;

    public Comprobante() {
    }

    public Comprobante(long numeroVenta, Date fecha, double total, Pago pago, PuntoVenta puntoVenta, long numero, List<LineaVenta> lineasVenta) {
        super(numeroVenta, fecha, total, pago, puntoVenta, lineasVenta);
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}
