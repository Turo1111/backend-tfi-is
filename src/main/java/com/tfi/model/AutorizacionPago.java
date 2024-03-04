package com.tfi.model;

public class AutorizacionPago extends PagoTarjeta{
    private long id;
    private String descripcion;
    private String estado;

    public AutorizacionPago(String card_number, String card_expiration_month, String card_expiration_year, String security_code, String card_holder_name, IdentificacionCliente card_holder_identification, long id1, String descripcion, String estado) {
        super( card_number, card_expiration_month, card_expiration_year, security_code, card_holder_name, card_holder_identification);
        this.id = id1;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
