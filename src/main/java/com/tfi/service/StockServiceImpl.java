package com.tfi.service;

import com.tfi.memoria.Memoria;
import com.tfi.model.Stock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockServiceImpl implements StockService{

    @Override
    public List<Stock> getAllStock(String codigo) {
        return Memoria.getStocks().stream()
                .filter(stock -> stock.getArticulo().getCodigo().equals(codigo))
                .collect(Collectors.toList());
    }

}
