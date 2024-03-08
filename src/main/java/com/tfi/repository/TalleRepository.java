package com.tfi.repository;

import com.tfi.model.Articulo;
import com.tfi.model.Talle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalleRepository extends MongoRepository<Talle, String> {
}
