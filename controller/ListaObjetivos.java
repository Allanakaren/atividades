package com.helloworld.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ListaObjetivos {
	
		@GetMapping
		public String objetivos() {
			return "\nTerminar curso do MYSQL"
					+ "\nAssisti videos do Spring"
					+ "\nEstudar mais sobre"
					+ "\nTerminar curso de git e github";
					

	}

		
	}


