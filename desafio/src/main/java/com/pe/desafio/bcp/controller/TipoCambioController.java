package com.pe.desafio.bcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PutMapping("/{id}")
	private TipoCambio actualizar(@RequestBody  TipoCambio tipoCambioNew, @PathVariable Integer id) {
		
		 return tipoCambioRepository.findById(id).map(employee -> {
	            employee.setCodigoDestino(tipoCambioNew.getCodigoDestino());
	            employee.setCodigoOrigen(tipoCambioNew.getCodigoOrigen());
	            employee.setTipoCambio(tipoCambioNew.getTipoCambio());
	            return tipoCambioRepository.save(employee);
	        }).orElseGet(() -> {
	        	tipoCambioNew.setId(id);
	            return tipoCambioRepository.save(tipoCambioNew);
	        });
		 
		
	}
	
}
