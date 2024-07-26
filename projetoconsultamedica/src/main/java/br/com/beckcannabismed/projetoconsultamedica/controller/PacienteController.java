package br.com.beckcannabismed.projetoconsultamedica.controller;

import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.beckcannabismed.projetoconsultamedica.model.Paciente;
import br.com.beckcannabismed.projetoconsultamedica.service.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
    
    
    @Autowired
    @Qualifier("pacienteServiceImpl")
    PacienteService pacienteService;

    @RequestMapping({"/", ""})
    public String showPaciente(Model model){
        List<Paciente> pacientes = pacienteService.getAllPacientes();
        pacientes.forEach(System.out::println);

        model.addAttribute("pacientes",pacientes);
        return "paciente/telaPaciente";
    }

    @RequestMapping("/showFormPaciente")
    public String showFormPaciente(Model model){
        model.addAttribute("paciente", new Paciente());
        return "paciente/formPaciente";
    }

    @RequestMapping("/savePaciente")
    public String savePaciente(Paciente paciente, Model model){
        pacienteService.adicionarPaciente(paciente);
        return "redirect:/paciente/showFormPaciente";
    }

    @RequestMapping("/removePaciente/{id}")
    public String removePaciente(@PathVariable("id") Integer id, Model model) {

        System.out.println(pacienteService.getPacienteById(id));
        pacienteService.removePaciente(pacienteService.getPacienteById(id));
        List<Paciente> pacientes = pacienteService.getAllPacientes();
        model.addAttribute("pacientes", pacientes);
        return "redirect:/paciente/";
    }
    
}
