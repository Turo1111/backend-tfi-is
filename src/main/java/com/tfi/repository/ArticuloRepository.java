package com.tfi.repository;

import com.tfi.model.Articulo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ArticuloRepository extends MongoRepository<Articulo, String> {

}
