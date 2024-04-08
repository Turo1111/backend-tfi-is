package com.tfi.service;

import com.tfi.memoria.Memoria;
import com.tfi.model.*;
import com.tfi.repository.ArticuloRepository;
import com.tfi.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    ArticuloRepository articuloRepository;

    @Override
    public List<Articulo> getAllArticulo() {
        List<Articulo> articulos = (List<Articulo>) articuloRepository.findAll();
        return articulos;
    }

    @Override
    public Optional<Articulo> getArticuloByCodigo(String codigo) {
        Optional<Articulo> articuloOptional = articuloRepository.findById(codigo).orE;
        DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
        if (articuloOptional.isPresent()) {
            Articulo articulo = articuloOptional.get();
            double costo = articulo.getCosto();
            double margenGanancia = articulo.getMargenGanancia();
            double iva = articulo.getIva();
            double netoGravado = costo + costo * (margenGanancia / 100);
            double precioVenta = netoGravado + (netoGravado * (iva / 100));
            netoGravado = Double.parseDouble(df.format(netoGravado));
            precioVenta = Double.parseDouble(df.format(precioVenta));
            articulo.setNetoGravado(netoGravado);
            articulo.setPrecioVenta(precioVenta);
            return Optional.of(articulo);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Articulo saveArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    @Override
    public boolean deleteArticuloByCodigo(long codigo) {
        return false;
    }

}
