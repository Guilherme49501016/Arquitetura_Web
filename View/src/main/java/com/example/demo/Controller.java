package com.example.demo;

@org.springframework.stereotype.Service
public class Controller {
    public String exampleView() {
        return "Acesse <a href='http://localhost:8080/'>localhost:8080</a> para visualizar o contéudo do arquivo resources/static/index.html.";
    }
}