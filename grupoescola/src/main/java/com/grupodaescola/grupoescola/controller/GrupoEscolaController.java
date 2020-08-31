package com.grupodaescola.grupoescola.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grupo")


public class GrupoEscolaController {
	
	@GetMapping
	public String grupo() {
		return"Esse é o grupo dos amigos de escola que estou, onde todos que estão la são uma sala que se tornamos amigos...Onde o interessante é que estamos juntos desde o primario, alguns sairam da sala depois do primeiro ano do ensino medio (Eu), outros só se separaram na faculdade, outro não esta na mesma turma que eu do BootCamp, mas esta  na turma 8 da Generation (Guilherme Silva)";
	}

}
