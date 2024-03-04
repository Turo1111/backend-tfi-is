package com.tfi.service;

import com.tfi.model.Articulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface ArticuloService {

    List<Articulo> getAllArticulo();
    Optional<Articulo> getArticuloByCodigo(String codigo);
    Articulo saveArticulo(Articulo codigo);
    boolean deleteArticuloByCodigo(long codigo);

}
