package com.tfi.controllers;

import com.tfi.model.Categoria;
import com.tfi.model.Marca;
import com.tfi.service.CategoriaService;
import com.tfi.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("marca")
@CrossOrigin(origins = "*")
public class MarcaController {

    @Autowired
    MarcaService marcaService;

    @PostMapping("/save")
    public Marca saveMarca(@RequestBody Marca marca){
        return marcaService.saveMarca(marca);
    }

    @GetMapping("/find/{id}")
    public Optional<Marca> getMarcaByCodigo(@PathVariable String id){
        return marcaService.getMarcaByCodigo(id);
    }

}
