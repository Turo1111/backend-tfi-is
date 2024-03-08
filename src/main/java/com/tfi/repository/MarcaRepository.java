package com.tfi.repository;

import com.tfi.model.Categoria;
import com.tfi.model.Marca;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends MongoRepository<Marca, String> {

}
