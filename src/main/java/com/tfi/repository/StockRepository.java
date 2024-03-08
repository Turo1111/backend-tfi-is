package com.tfi.repository;

import com.tfi.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {

    List<Stock> findByArticulo_Codigo(String codigo);

}
