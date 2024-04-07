package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.Veiculo;
import com.google.gson.Gson;

@Service
public class Services {
	
	Gson gson = new Gson();
	
	@Autowired
	VeiculoService veiculoService;

    public String tabelaFipe() {
        String dadosFipe = "";
        String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/2014-3";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dadosFipe  = responseEntity.getBody();
            Veiculo veiculo = gson.fromJson(dadosFipe, Veiculo.class);
            veiculoService.inserirVeiculo(veiculo);
        } else {
            dadosFipe  = "Falha ao obter dados" + responseEntity.getStatusCode();
        }
        
        
        return dadosFipe;
    }

}