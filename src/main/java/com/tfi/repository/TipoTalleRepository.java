package com.tfi.repository;

import com.tfi.model.Articulo;
import com.tfi.model.TipoTalle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTalleRepository extends MongoRepository<TipoTalle, String> {
}
