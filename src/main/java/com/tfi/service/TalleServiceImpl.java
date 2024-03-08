package com.tfi.service;

import com.tfi.model.Talle;
import com.tfi.repository.TalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TalleServiceImpl implements TalleService{

    @Autowired
    TalleRepository talleRepository;

    @Override
    public List<Talle> getAllTalle(){
        return null;
    };
    @Override
    public Optional<Talle> getTalleByCodigo(String id){
        return null;
    };
    @Override
    public Talle saveTalle(Talle talle){
        return talleRepository.save(talle);
    };
    @Override
    public boolean deleteTalleByCodigo(String codigo){
        return false;
    };

}
