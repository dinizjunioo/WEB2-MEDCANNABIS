package br.com.beckcannabismed.projetoconsultamedica.controller;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.beckcannabismed.projetoconsultamedica.model.Medico;

@Controller
@RequestMapping("/medico")
public class MedicoController {

    @RequestMapping({"/", ""})
    public String showMedico(Model model){
        List<Medico> medicos = null;// Listof(new Medico());
        //List<Medico> medicos = medicoService.getAllMedicos();
        //medicos.forEach(System.out::println);

        model.addAttribute("medicos",medicos);
        return "medico/telaMedico";
    }
}
