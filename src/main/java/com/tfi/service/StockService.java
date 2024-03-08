package com.tfi.service;

import com.tfi.model.Articulo;
import com.tfi.model.Stock;

import java.util.List;
import java.util.Optional;

public interface StockService {

    List<Stock> getAllStock();

    List<Stock> getStockByCodigo(String codigo);
    Stock saveStock(Stock stock);
    boolean deleteStockByCodigo(String codigo);

}
