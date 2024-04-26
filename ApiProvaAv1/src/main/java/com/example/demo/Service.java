package com.example.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {

    private String consultarURL(String apiUrl){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }
    public String consultarNoticiaseRelease() {
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias");
    }
    public String consultarNoticias() {
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia");
    }
    public String consultarRelease() {
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release");
    }

}