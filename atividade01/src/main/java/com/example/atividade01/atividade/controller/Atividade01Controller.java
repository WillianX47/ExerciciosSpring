package com.example.atividade01.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade01")
public class Atividade01Controller {
	
	@GetMapping
	public String atividade01() {
		return "Mentalidade usada: "
				+ "Mentalidade de crescimento\n"
				+ "Habilidades usadas: "
				+ "Persistência, proatividade";
	}
}
