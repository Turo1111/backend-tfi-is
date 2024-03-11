package com.tfi.model;

public class Direccion {

    private int codigo;
    private int codigoPostal;
    private String calle;
    private String numero;

    private Provincia provincia;

    public Direccion() {
    }

    public Direccion(int codigo, int codigoPostal, String calle, String numero, Provincia provincia) {
        this.codigo = codigo;
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.numero = numero;
        this.provincia = provincia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
