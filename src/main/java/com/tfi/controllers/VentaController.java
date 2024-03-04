package com.tfi.controllers;

import com.tfi.model.Venta;
import com.tfi.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("venta")
@CrossOrigin(origins = "http://localhost:3000")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @PostMapping("/save")
    public Venta saveVenta(@RequestBody Venta v){
        return ventaService.saveVenta(v);
    }

}
