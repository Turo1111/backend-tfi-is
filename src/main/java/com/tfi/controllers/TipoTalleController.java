package com.tfi.controllers;

import com.tfi.model.Articulo;
import com.tfi.model.TipoTalle;
import com.tfi.service.TipoTalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tipoTalle")
@CrossOrigin(origins = "*")
public class TipoTalleController {

    @Autowired
    TipoTalleService tipoTalleService;

    @PostMapping("/save")
    public TipoTalle saveTipoTalle(@RequestBody TipoTalle tipoTalle){
        return tipoTalleService.saveTipoTalle(tipoTalle);
    }

}
