package br.com.senai.esport.model;

import br.com.senai.esport.dto.JogoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogo {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idJogo;
private String nome;
private String plataforma;


public Jogo() {
	super();
}

public Jogo(JogoDto jogoDto) {
	this.idJogo = jogoDto.getIdJogo();
	this.nome = jogoDto.getNome();
	this.plataforma = jogoDto.getPlataforma();
	
}


public Integer getIdJogo() {
	return idJogo;
}
public void setIdJogo(Integer idJogo) {
	this.idJogo = idJogo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getPlataforma() {
	return plataforma;
}
public void setPlataforma(String plataforma) {
	this.plataforma = plataforma;
}



}
