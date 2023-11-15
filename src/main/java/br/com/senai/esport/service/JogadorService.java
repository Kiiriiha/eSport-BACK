package br.com.senai.esport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.esport.dto.JogadorDto;
import br.com.senai.esport.model.Jogador;
import br.com.senai.esport.repository.JogadorRepository;

@Service
public class JogadorService {
	
	@Autowired
	private JogadorRepository jogadorRepository;
	
	public Jogador salvarJogador(JogadorDto jogadorDto) {
		Jogador jogador = new Jogador(jogadorDto);
		return jogadorRepository.save(jogador);
	}
	
	
public void excluirJogador(Integer id) {
	jogadorRepository.deleteById(id);
}

public List<Jogador> listarJogadores(){
	return jogadorRepository.findAll();
}

}
