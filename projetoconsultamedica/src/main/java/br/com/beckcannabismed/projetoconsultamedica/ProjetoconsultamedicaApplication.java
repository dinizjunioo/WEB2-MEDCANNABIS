package br.com.beckcannabismed.projetoconsultamedica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.beckcannabismed.projetoconsultamedica.model.Paciente;
import br.com.beckcannabismed.projetoconsultamedica.repository.PacienteRepository;

@SpringBootApplication
public class ProjetoconsultamedicaApplication {

	@Autowired
	PacienteRepository pacienteRepository;

	@Bean
	public CommandLineRunner init()
	{
		return args -> {
			
			System.out.println("Pacientes cadastrados: ");
			List<Paciente> pacientes = pacienteRepository.findAll();
			pacientes.forEach(System.out::println);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoconsultamedicaApplication.class, args);
	}

	
}
