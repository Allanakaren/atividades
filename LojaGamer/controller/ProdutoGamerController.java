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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.LojaGamer.LojaGamer.model.ProdutoGamer;
import com.LojaGamer.LojaGamer.repository.ProdutoGamerRepository;

@RestController
@RequestMapping("/Games")
@CrossOrigin("*")
public class ProdutoGamerController {
	
	@Autowired
	private ProdutoGamerRepository  gamerepository;
	
	@GetMapping
	public ResponseEntity<List<ProdutoGamer>> GetAll(){
		
		return ResponseEntity.ok(gamerepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoGamer> getById(@PathVariable Long id){
		return gamerepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<ProdutoGamer>> getByTitulo(@PathVariable String nome){
		return ResponseEntity.ok(gamerepository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<ProdutoGamer>  post(@Valid @RequestBody ProdutoGamer ProdutoGamer){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(gamerepository.save(ProdutoGamer));
}
	

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<ProdutoGamer> ProdutoGamer = gamerepository.findById(id);
		
		if(ProdutoGamer.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		gamerepository.deleteById(id);
		
	}
	

}
