package com.tfi.model;

public class PagoEfectivo extends Pago{

    private double monto;

    public PagoEfectivo(long id,double cantidad, double monto) {
        super(id, cantidad);
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
