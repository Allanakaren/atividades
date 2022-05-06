package com.LojaGamer.LojaGamer.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.LojaGamer.LojaGamer.model.CategoriaGamer;
import com.LojaGamer.LojaGamer.repository.CategoriaGamerRepository;




@RestController
@RequestMapping("/Jogos")
@CrossOrigin(origins = "", allowedHeaders = "")
public class CategoriaGamerController {
	
	@Autowired
	private CategoriaGamerRepository categoriagamerRepository;

	@GetMapping
	public ResponseEntity<List<CategoriaGamer>> getAll(){
		return ResponseEntity.ok(categoriagamerRepository.findAll());
	}

	@GetMapping("{id}")
	public ResponseEntity<CategoriaGamer> getById(@PathVariable Long id){
		return categoriagamerRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/acao/{acao}")
	public ResponseEntity<List<CategoriaGamer>> getByTitle(@PathVariable String acao){
		return ResponseEntity.ok(categoriagamerRepository.findAllByAcaoContainingIgnoreCase(acao));
	}
	
	@PostMapping
	public ResponseEntity<CategoriaGamer> post(@Valid @RequestBody CategoriaGamer categoriagamer){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(categoriagamerRepository.save(categoriagamer));
	}
	
	@PutMapping
	public ResponseEntity<CategoriaGamer> put(@Valid @RequestBody CategoriaGamer categoriagamer){
		return categoriagamerRepository.findById(categoriagamer.getId()).map(resposta -> ResponseEntity.status(HttpStatus.CREATED)
				.body(categoriagamerRepository.save(categoriagamer))).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<CategoriaGamer> CategoriaGamer = categoriagamerRepository.findById(id);
		
	if(CategoriaGamer.isEmpty())
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	
	categoriagamerRepository.deleteById(id);
	}

}
