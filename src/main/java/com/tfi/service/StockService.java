package com.tfi.service;

import com.tfi.model.Stock;

import java.util.List;
import java.util.Optional;

public interface StockService {

    List<Stock> getAllStock(String codigo);

}
