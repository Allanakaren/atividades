package com.blogpessoal.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blogpessoal.Repository.PostagemRepository;
import com.blogpessoal.blogpessoal.model.postagem;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public ResponseEntity<List<postagem>> GetAll(){
		
		return ResponseEntity.ok(repository.findAll());
		
	}
	
}
