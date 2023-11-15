package br.com.senai.esport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.esport.dto.JogoDto;
import br.com.senai.esport.model.Jogo;
import br.com.senai.esport.repository.JogoRepository;

@Service
public class JogoService {
	
	
	@Autowired
	private JogoRepository jogoRepository;
	
	public Jogo salvarJogo(JogoDto jogoDto) {
		Jogo jogos = new Jogo(jogoDto);
		return jogoRepository.save(jogos);
	}
	
	public List<Jogo> listarJogos(){
		return jogoRepository.findAll();
	}

	public void excluirJogos(Integer id) {
		jogoRepository.deleteById(id);
	}
}
