package com.tfi.repository;

import com.tfi.model.Pago;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PagoRepository extends MongoRepository<Pago, String> {
}
