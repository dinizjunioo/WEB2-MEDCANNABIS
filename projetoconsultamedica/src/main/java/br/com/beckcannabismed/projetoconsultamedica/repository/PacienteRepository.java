package br.com.beckcannabismed.projetoconsultamedica.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.beckcannabismed.projetoconsultamedica.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    // querys
}