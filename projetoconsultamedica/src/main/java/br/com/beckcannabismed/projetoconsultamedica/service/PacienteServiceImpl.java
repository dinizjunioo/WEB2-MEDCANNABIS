package br.com.beckcannabismed.projetoconsultamedica.service;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.beckcannabismed.projetoconsultamedica.model.Paciente;
import br.com.beckcannabismed.projetoconsultamedica.repository.PacienteRepository;

@Component
public class PacienteServiceImpl  implements PacienteService{

    @Autowired
    PacienteRepository pacienteRepository;
 
    
    @Override
    public List<Paciente> getAllPacientes()
    {
        return pacienteRepository.findAll();
    }
    
    @Override
    public void removePaciente(Paciente paciente)
    {
        System.out.println("removendo paciente: " + paciente.toString());
        try {
            pacienteRepository.delete(paciente);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    @Override
    public void adicionarPaciente(Paciente paciente)
    {
        System.out.println("Adicionando paciente: " + paciente.toString());
        try {
            pacienteRepository.save(paciente);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    @Override
    public Paciente getPacienteById(Integer id) {

        return pacienteRepository.findById(id).map(paciente -> {
            return paciente;
        }).orElseThrow(() -> null);
    }

    @Override
    public Paciente atualizarPaciente(Paciente paciente)
    {
        // Verifica se o paciente existe no banco de dados
        if (!pacienteRepository.existsById(paciente.getId())) {
            // throw new EntityNotFoundException("Paciente não encontrado com o ID: " + paciente.getId());
        }

        // Atualiza o paciente e persiste as mudanças no banco de dados
        return pacienteRepository.save(paciente);
    }
    
}
