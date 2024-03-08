package com.tfi.service;

import com.tfi.model.Articulo;
import com.tfi.model.Talle;

import java.util.List;
import java.util.Optional;

public interface TalleService {

    List<Talle> getAllTalle();
    Optional<Talle> getTalleByCodigo(String id);
    Talle saveTalle(Talle talle);
    boolean deleteTalleByCodigo(String codigo);

}
