package com.pe.desafio.bcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.desafio.bcp.entity.TipoCambio;
import com.pe.desafio.bcp.repository.TipoCambioRepository;

@RestController
@RequestMapping("/tipoCambio")
public class TipoCambioController {

	@Autowired
	private TipoCambioRepository tipoCambioRepository;
	
	@PutMapping("/actualizar")
	private TipoCambio actualizar(@RequestBody  TipoCambio tipoCambio) {
		return tipoCambioRepository.save(tipoCambio);
	}
	
}
