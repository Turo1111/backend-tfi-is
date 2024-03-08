package com.tfi.controllers;

import com.tfi.model.Articulo;
import com.tfi.model.Categoria;
import com.tfi.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("categoria")
@CrossOrigin(origins = "*")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping("/save")
    public Categoria saveCategoria(@RequestBody Categoria categoria){
        return categoriaService.saveCategoria(categoria);
    }

    @GetMapping("/find/{id}")
    public Optional<Categoria> getCategoriaByCodigo(@PathVariable String id){
        return categoriaService.getCategoriaByCodigo(id);
    }

}
