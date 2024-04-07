package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Clima;
import com.example.demo.repositories.ClimaRepository;

@Service
public class ClimaService {
	
	@Autowired
	ClimaRepository climaRepository;

	void inserirClima(List<Clima> clima) {
		climaRepository.saveAll(clima);
	}
	
	public List<Clima> findAllClimas(){
		return climaRepository.findAll();
	}
}
