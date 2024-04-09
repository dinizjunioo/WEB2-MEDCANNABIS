package br.com.beckcannabismed.projetoconsultamedica.controller;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.RequestMapping;

import br.com.beckcannabismed.projetoconsultamedica.model.Paciente;
import br.com.beckcannabismed.projetoconsultamedica.service.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
    
    
    @Autowired
    @Qualifier("pacienteServiceImpl")
    PacienteService pacienteService;

    @RequestMapping("/")
    public String showFormPaciente(Model model){
        model.addAttribute("paciente", new Paciente());
        return "paciente/formPaciente";
    }
}
