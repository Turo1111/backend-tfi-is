package com.tfi.controllers;

import com.tfi.model.Articulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tfi.service.ArticuloService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("articulo")
@CrossOrigin(origins = "http://localhost:3000")
public class ArticuloController {

    @Autowired
    ArticuloService articuloService;

    @GetMapping("/getAll")
    public List<Articulo> getAllArticulo(){
        return articuloService.getAllArticulo();
    }

    @GetMapping("/find/{codigo}")
    public Optional<Articulo> getArticuloByCodigo(@PathVariable("codigo") String codigo){
        return articuloService.getArticuloByCodigo(codigo);
    }

}
