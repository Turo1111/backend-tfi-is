package com.tfi.model;

public class Talle {

    long id;
    String descripcion;
    TipoTalle tipoTalle;

    public Talle(long id, String descripcion, TipoTalle tipoTalle) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipoTalle = tipoTalle;
    }

    public TipoTalle getTipoTalle() {
        return tipoTalle;
    }

    public void setTipoTalle(TipoTalle tipoTalle) {
        this.tipoTalle = tipoTalle;
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
}
