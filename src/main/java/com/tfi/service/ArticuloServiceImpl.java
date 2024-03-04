package com.tfi.service;

import com.tfi.memoria.Memoria;
import com.tfi.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

 @Service
public class ArticuloServiceImpl implements ArticuloService {


    @Override
    public List<Articulo> getAllArticulo() {
        return (List<Articulo>) Memoria.getArticulos();
    }

    @Override
    public Optional<Articulo> getArticuloByCodigo(String codigo) {
        return Memoria.getArticulos().stream()
                .filter(articulo -> articulo.getCodigo().toString().equals(codigo))
                .findFirst();
    }

    @Override
    public Articulo saveArticulo(Articulo codigo) {
        return null;
    }

    @Override
    public boolean deleteArticuloByCodigo(long codigo) {
        return false;
    }

}
