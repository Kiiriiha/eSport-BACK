package br.com.senai.esport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.esport.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Integer>{
	

}
