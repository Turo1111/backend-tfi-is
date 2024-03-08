package com.tfi.repository;

import com.tfi.model.LineaVenta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LineaVentaRepository extends MongoRepository<LineaVenta, String> {
}
