package br.com.beckcannabismed.projetoconsultamedica.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProjetoConsultaMedicaController {
    
    @Value("${spring.application.name}")
    private String nameApp;

    @GetMapping("/dashboard")
    public String showDashboard() 
    {
        return "dashboard";
    }

    @GetMapping("/getNomeAplicacao")
    public String getNomeAplicacao() {
        return nameApp;
    }
}
