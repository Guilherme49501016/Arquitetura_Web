package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.Clima;
import com.google.gson.Gson;

@Service
public class Services {
	
	Gson gson = new Gson();
	
	@Autowired
	ClimaService climaService;
	
	
	@Transactional
    public List<Clima> preverTempo() {
        String dadosMetereologicos = "";
        String apiUrl = "https://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=9fe25332679ebce952fdd9f7f9a83c3e";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        List<Clima> climas = new ArrayList();

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dadosMetereologicos = responseEntity.getBody();
            
            Clima[] clima = gson.fromJson(responseEntity.getBody(), Clima[].class);
            for(Clima climaAtual : clima) {
            	climas.add(climaAtual);
            }
        } else {
            dadosMetereologicos = "Falha ao obter dados" + responseEntity.getStatusCode();
        }
        
        
        climaService.inserirClima(climas);
        
        return climas;
    }

}