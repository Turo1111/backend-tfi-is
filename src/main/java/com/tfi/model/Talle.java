package com.tfi.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "talles")
public class Talle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String descripcion;

    @DBRef
    private TipoTalle tipoTalle;

    public Talle(String id, String descripcion, TipoTalle tipoTalle) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
