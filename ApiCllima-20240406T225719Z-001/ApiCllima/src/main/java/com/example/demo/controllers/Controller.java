package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Clima;
import com.example.demo.services.ClimaService;
import com.example.demo.services.Services;

@RestController
public class Controller {

	@Autowired
    Services service;
	
	@Autowired
	ClimaService climaService;
	
    @GetMapping("/processarClimas")
    public List<Clima> PreverTempo(){
        return service.preverTempo();
    }
    
    
    @GetMapping("/clima/buscar")
    public List<Clima> buscarClimas(){
    	return climaService.findAllClimas();
    } 
}