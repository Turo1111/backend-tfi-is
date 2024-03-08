package com.tfi.service;

import com.tfi.model.Categoria;
import com.tfi.model.Marca;
import com.tfi.repository.CategoriaRepository;
import com.tfi.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService{

    @Autowired
    MarcaRepository marcaRepository;

    @Override
    public List<Marca> getAllMarca() {
        return null;
    };
    @Override
    public Optional<Marca> getMarcaByCodigo(String id){
        return marcaRepository.findById(id);
    };
    @Override
    public Marca saveMarca(Marca marca){
        return marcaRepository.save(marca);
    };
    @Override
    public boolean deleteMarcaByCodigo(String id){
        return false;
    };

}
