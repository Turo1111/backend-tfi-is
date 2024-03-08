package com.tfi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private Date fecha;
    private double total;
    //@JsonIgnore
    private Pago pago;
    private PuntoVenta puntoVenta;

    //@JsonIgnore
    private List<LineaVenta> lineaVenta;

    public Venta() {
    }

    public Venta(String id, Date fecha, double total, Pago pago, PuntoVenta puntoVenta, List<LineaVenta> lineaVenta) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.pago = pago;
        this.puntoVenta = puntoVenta;
        this.lineaVenta = lineaVenta;
    }

    public List<LineaVenta> getLineaVenta() {
        return lineaVenta;
    }

    public void setLineasVenta(List<LineaVenta> lineaVenta) {
        this.lineaVenta = lineaVenta;
    }

    public String getNumeroVenta() {
        return id;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.id = numeroVenta;
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
