package com.tfi.service;

import com.tfi.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    List<Categoria> getAllCategoria();
    Optional<Categoria> getCategoriaByCodigo(String id);
    Categoria saveCategoria(Categoria categoria);
    boolean deleteCategoriaByCodigo(long id);

}
