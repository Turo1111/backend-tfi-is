package com.tfi.service;

import com.tfi.model.Categoria;
import com.tfi.model.Marca;

import java.util.List;
import java.util.Optional;

public interface MarcaService {

    List<Marca> getAllMarca();
    Optional<Marca> getMarcaByCodigo(String id);
    Marca saveMarca(Marca marca);
    boolean deleteMarcaByCodigo(String id);

}
