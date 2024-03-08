package com.tfi.service;

import com.tfi.model.TipoTalle;
import com.tfi.repository.ArticuloRepository;
import com.tfi.repository.TipoTalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoTalleServiceImpl implements TipoTalleService {

    @Autowired
    TipoTalleRepository tipoTalleRepository;

    @Override
    public List<TipoTalle> getAllTipoTalle(){
        return null;
    };
    @Override
    public Optional<TipoTalle> getTipoTalleByCodigo(String id){
        return null;
    };
    @Override
    public TipoTalle saveTipoTalle(TipoTalle tipoTalle){
        return tipoTalleRepository.save(tipoTalle);
    };
    @Override
    public boolean deleteTipoTalleByCodigo(String id){
        return false;
    };

}
