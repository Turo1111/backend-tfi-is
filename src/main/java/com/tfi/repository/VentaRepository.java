package com.tfi.repository;

import com.tfi.model.Venta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VentaRepository extends MongoRepository<Venta, String> {
}
