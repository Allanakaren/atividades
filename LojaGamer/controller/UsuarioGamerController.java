package com.LojaGamer.LojaGamer.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaGamer.LojaGamer.model.UsuarioGamer;
import com.LojaGamer.LojaGamer.model.UsuarioLoginGamer;
import com.LojaGamer.LojaGamer.repository.UsuarioGamerRepository;
import com.LojaGamer.LojaGamer.service.UsuarioGamerService;

@RestController
@RequestMapping("/UsuariosGamer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioGamerController {

	@Autowired
	private UsuarioGamerService usuariogamerService;

	@Autowired
	private UsuarioGamerRepository usuariogamerRepository;
	
	@GetMapping("/all")
	public ResponseEntity <List<UsuarioGamer>> getAll(){
		
		return ResponseEntity.ok(usuariogamerRepository.findAll());
		
	}

	@GetMapping("/{id}")
	public ResponseEntity<UsuarioGamer> getById(@PathVariable Long id) {
		return usuariogamerRepository.findById(id)
			.map(resposta -> ResponseEntity.ok(resposta))
			.orElse(ResponseEntity.notFound().build());
	}
	

	@PostMapping("/logar")
	public ResponseEntity<UsuarioLoginGamer> login(@RequestBody Optional<UsuarioLoginGamer> usuarioLogingamer) {
		return usuariogamerService.autenticarUsuario(usuarioLogingamer)
			.map(resposta -> ResponseEntity.ok(resposta))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<UsuarioGamer> postUsuario(@Valid @RequestBody UsuarioGamer usuariogamer) {

		return usuariogamerService.cadastrarUsuario(usuariogamer)
			.map(resposta -> ResponseEntity.status(HttpStatus.CREATED).body(resposta))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());

	}

	@PutMapping("/atualizar")
	public ResponseEntity<UsuarioGamer> putUsuario(@Valid @RequestBody UsuarioGamer usuariogamer) {
		return usuariogamerService.atualizarUsuario(usuariogamer)
			.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
			.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	
	
}
