package com.example.atividade02.atividade02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade02")
public class Atividade02Controller {
	
	@GetMapping
	public String atividade02() {
		return "Meus objetivos de aprendizagem nessa semana:"
				+ "\nAprender a conectar o SpringBoot junto com o BD"
				+ "\nAprender a setar os valores no BD através do Eclipse"
				+ "\nAprender os principais termos do SpringBoot (Ex: @RestController, @RequestMapping, @GetMapping, etc)";
	}
}
