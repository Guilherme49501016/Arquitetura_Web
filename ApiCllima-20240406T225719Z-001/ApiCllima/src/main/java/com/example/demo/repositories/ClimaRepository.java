package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Clima;

@Repository
public interface ClimaRepository extends MongoRepository<Clima, String> {
		
	
}
