package com.tfi.model;

import java.util.Date;
import java.util.List;

public class Venta {

    private long numeroVenta;
    private Date fecha;
    private double total;
    private Pago pago;
    private PuntoVenta puntoVenta;
    private List<LineaVenta> lineasVenta;
    public Venta() {
    }

    public Venta(long numeroVenta, Date fecha, double total, Pago pago, PuntoVenta puntoVenta, List<LineaVenta> lineasVenta) {
        this.numeroVenta = numeroVenta;
        this.fecha = fecha;
        this.total = total;
        this.pago = pago;
        this.puntoVenta = puntoVenta;
        this.lineasVenta = lineasVenta;
    }

    public List<LineaVenta> getLineasVenta() {
        return lineasVenta;
    }

    public void setLineasVenta(List<LineaVenta> lineasVenta) {
        this.lineasVenta = lineasVenta;
    }

    public long getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(long numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public PuntoVenta getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(PuntoVenta puntoVenta) {
        this.puntoVenta = puntoVenta;
    }
}
