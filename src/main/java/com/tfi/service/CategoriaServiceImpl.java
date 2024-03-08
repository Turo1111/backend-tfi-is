package com.tfi.service;

import com.tfi.model.Categoria;
import com.tfi.repository.CategoriaRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> getAllCategoria() {
        return null;
    };
    @Override
    public Optional<Categoria> getCategoriaByCodigo(String id){
        return categoriaRepository.findById(id);
    };
    @Override
    public Categoria saveCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    };
    @Override
    public boolean deleteCategoriaByCodigo(long id){
        return false;
    };

}
