package com.tfi.service;

import com.tfi.memoria.Memoria;
import com.tfi.model.Stock;
import com.tfi.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }

    @Override
    public List<Stock> getStockByCodigo(String codigo){
        return stockRepository.findByArticulo_Codigo(codigo);
    };
    @Override
    public Stock saveStock(Stock stock){
        return stockRepository.save(stock);
    };
    @Override

    public boolean deleteStockByCodigo(String codigo){
        return false;
    };

}
