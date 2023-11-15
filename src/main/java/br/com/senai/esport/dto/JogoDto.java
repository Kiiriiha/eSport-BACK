package br.com.senai.esport.dto;

import br.com.senai.esport.model.Jogo;

public class JogoDto {
	
	private Integer idJogo;
	private String nome;
	private String plataforma;
	
	public JogoDto() {
		super();
	}
	
	
	public JogoDto(Jogo jogo) {
		this.idJogo = jogo.getIdJogo();
		this.nome = jogo.getNome();
		this.plataforma = jogo.getPlataforma();
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
