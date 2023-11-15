package br.com.senai.esport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.esport.dto.JogadorDto;
import br.com.senai.esport.model.Jogador;
import br.com.senai.esport.service.JogadorService;

@RestController
@RequestMapping("/jogador")
public class JogadorController {
	
	@Autowired
	private JogadorService jogadorService;
	
	
	@PostMapping
	public ResponseEntity<JogadorDto> cadastraJogador(@RequestBody JogadorDto jogadorDto){
		Jogador jogador = jogadorService.salvarJogador(jogadorDto);
		return ResponseEntity.ok(new JogadorDto(jogador));
	}
	
	@GetMapping
	public ResponseEntity<List<JogadorDto>> listarJogadores(){
		List<Jogador> jogadores = jogadorService.listarJogadores();
		List<JogadorDto> jogadoresDto = jogadores.stream().map(JogadorDto::new).toList();
		return ResponseEntity.ok(jogadoresDto);
	}
	
	@DeleteMapping("/{id_jogador}")
	public ResponseEntity<Void> excluirJogador(@PathVariable Integer id) {
		jogadorService.excluirJogador(id);
		return ResponseEntity.status(HttpStatus.OK).build();
		
		}
	
	@PutMapping
	public ResponseEntity<JogadorDto> atualizarJogador(@RequestBody JogadorDto jogadorDto) {
		Jogador jogador = jogadorService.salvarJogador(jogadorDto);
		return ResponseEntity.ok(new JogadorDto(jogador));
	}

}
