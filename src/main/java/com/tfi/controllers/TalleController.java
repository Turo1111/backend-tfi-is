package com.tfi.controllers;

import com.tfi.model.Articulo;
import com.tfi.model.Talle;
import com.tfi.service.TalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("talle")
@CrossOrigin(origins = "*")
public class TalleController {

    @Autowired
    TalleService talleService;

    @PostMapping("/save")
    public Talle saveTalle(@RequestBody Talle talle){
        return talleService.saveTalle(talle);
    }

}
