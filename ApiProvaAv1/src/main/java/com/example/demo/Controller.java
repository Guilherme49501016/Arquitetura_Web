package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Service service = new Service();
    @GetMapping("/noticiasreleases")
    public String consultarNoticiaseRelease(){
        return service.consultarNoticiaseRelease();
    }
    @GetMapping("/noticias")
    public String consultarNoticias(){
        return service.consultarNoticias();
    }
    @GetMapping("/releases")
    public String consultarRelease(){
        return service.consultarRelease();
    }
}