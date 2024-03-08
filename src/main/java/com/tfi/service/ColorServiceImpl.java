package com.tfi.service;

import com.tfi.model.Color;
import com.tfi.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColorServiceImpl implements ColorService{

    @Autowired
    ColorRepository colorRepository;

    @Override
    public Optional<Color> getColorByCodigo(String id) {
        return colorRepository.findById(id);
    }

    @Override
    public List<Color> getAllColor() {
        return colorRepository.findAll();
    }

    @Override
    public Color saveColor(Color color) {
        return colorRepository.save(color);
    }

    @Override
    public boolean deleteColorByCodigo(String id) {
        return false;
    }

}
