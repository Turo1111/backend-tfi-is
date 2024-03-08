package com.tfi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tfi.model.enums.TipoPago;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private Date fecha;
    private double monto;
    @DBRef
    private Venta venta;
    private TipoPago tipoPago;

    //@JsonIgnore
    private PagoTarjeta pagoTarjeta;

    public Pago() {
    }

    public Pago(String id, Date fecha, double monto, Venta venta, TipoPago tipoPago, PagoTarjeta pagoTarjeta) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.venta = venta;
        this.tipoPago = tipoPago;
        this.pagoTarjeta = pagoTarjeta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public PagoTarjeta getPagoTarjeta() {
        return pagoTarjeta;
    }

    public void setPagoTarjeta(PagoTarjeta pagoTarjeta) {
        this.pagoTarjeta = pagoTarjeta;
    }
}
