package br.com.senai.esport.model;

import br.com.senai.esport.dto.JogadorDto;
//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;

@Entity
public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idJogador;
	private String nome;
	private String cpf;
	
	
	
	/* @JoinColumn(name = "esport_idJogador")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Jogo> jogos;
	*/
	
	
	
	public Jogador() {
		super();
	}
	
	public Jogador(JogadorDto jogadorDto) {
		this.idJogador = jogadorDto.getId_jogador();
		this.nome = jogadorDto.getNome();
		this.cpf = jogadorDto.getCpf();
	
	}
	
	
	public Integer getId_jogador() {
		return idJogador;
	}
	public void setId_jogador(Integer id_jogador) {
		this.idJogador = id_jogador;
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
