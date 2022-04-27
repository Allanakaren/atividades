package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista")
public class ListaBsm {

	@GetMapping
	public String lista() {
		return "\nMentalidade de Crescimento"
				+ "\nPersistência"
				+ "\nResponsabilidade pessoal"
				+ "\nOrientação ao futuro"
				+ "\nComunicação"
				+ "\nProatividade"
				+ "\nTrabalho em equipe";

}

	
}
