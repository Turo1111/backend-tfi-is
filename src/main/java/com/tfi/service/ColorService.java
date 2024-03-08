package com.tfi.service;

import com.tfi.model.Articulo;
import com.tfi.model.Color;

import java.util.List;
import java.util.Optional;

public interface ColorService {

    List<Color> getAllColor();
    Optional<Color> getColorByCodigo(String id);
    Color saveColor(Color color);
    boolean deleteColorByCodigo(String id);

}
