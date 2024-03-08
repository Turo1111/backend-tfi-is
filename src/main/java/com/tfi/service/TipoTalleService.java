package com.tfi.service;

import com.tfi.model.Articulo;
import com.tfi.model.TipoTalle;

import java.util.List;
import java.util.Optional;

public interface TipoTalleService {

    List<TipoTalle> getAllTipoTalle();
    Optional<TipoTalle> getTipoTalleByCodigo(String id);
    TipoTalle saveTipoTalle(TipoTalle tipoTalle);
    boolean deleteTipoTalleByCodigo(String id);

}
