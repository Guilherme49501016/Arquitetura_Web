package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Veiculo;
import com.example.demo.repositories.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;
	
	void inserirVeiculo(Veiculo veiculo) {
		veiculoRepository.insert(veiculo);
	}
	
}
