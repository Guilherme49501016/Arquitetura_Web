package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Veiculo;

@Repository
public interface VeiculoRepository extends MongoRepository<Veiculo, String> {

}
