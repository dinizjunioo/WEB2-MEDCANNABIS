package br.com.beckcannabismed.projetoconsultamedica.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProjetoConsultaMedicaController {
    
    @Value("${spring.application.name}")
    private String nameApp;

    @GetMapping("/")
    public String showDashboard() 
    {
        return "dashboard";
    }

    @GetMapping("/getNomeAplicacao")
    public String getNomeAplicacao() {
        return nameApp;
    }
}
