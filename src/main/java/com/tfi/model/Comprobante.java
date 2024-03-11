package com.tfi.model;

import java.util.Date;
import java.util.List;

public class Comprobante {
    private long numero;

    private TipoComprobante tipoComprobante;

    public Comprobante() {
    }

    public Comprobante(long numero, TipoComprobante tipoComprobante) {
        this.numero = numero;
        this.tipoComprobante = tipoComprobante;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
}

