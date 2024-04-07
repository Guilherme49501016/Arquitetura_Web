package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.Services;

@RestController
public class Controller {

	@Autowired
    Services service;
    @GetMapping("/fipe")
    public String PreverTempo(){
        return service.tabelaFipe();
    }
}
