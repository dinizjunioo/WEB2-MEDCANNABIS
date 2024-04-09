package br.com.beckcannabismed.projetoconsultamedica.service;

import java.util.List;

import br.com.beckcannabismed.projetoconsultamedica.model.Paciente;

public interface PacienteService {
    
    // crud de paciente
    public List<Paciente> getAllPacientes();
    public void removePaciente(Paciente paciente);
    public void adicionarPaciente(Paciente paciente);
    public Paciente atualizarPaciente(Paciente paciente);
    public Paciente getPacienteById(Integer id);
    
}
