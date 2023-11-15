package br.com.senai.esport.dto;

import br.com.senai.esport.model.Jogador;

public class JogadorDto {
	
	private Integer id_jogador;
	private String nome;
	private String cpf;

	
	
	public JogadorDto() {
		super();
	}
	
	
	public JogadorDto(Jogador jogador) {
		this.id_jogador = jogador.getId_jogador();
		this.nome = jogador.getNome();
		this.cpf = jogador.getCpf();
		
		
	}
	
	
	
	public Integer getId_jogador() {
		return id_jogador;
	}
	public void setId_jogador(Integer id_jogador) {
		this.id_jogador = id_jogador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
