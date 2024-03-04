package com.tfi.model;

public class Categoria {

    long id;
    String descripcion;

    public Categoria(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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
