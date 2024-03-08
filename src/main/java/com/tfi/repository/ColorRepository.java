package com.tfi.repository;

import com.tfi.model.Color;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends MongoRepository<Color, String> {
}
