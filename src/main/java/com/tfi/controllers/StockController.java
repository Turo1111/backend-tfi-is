package com.tfi.controllers;

import com.tfi.model.Stock;
import com.tfi.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("stock")
@CrossOrigin(origins = "http://localhost:3000")
public class StockController {

    @Autowired
    StockService stockService;

    @GetMapping("/getStock/{codigo}")
    public List<Stock> getStock(@PathVariable("codigo") String codigo){
        return stockService.getAllStock(codigo);
    }
}
