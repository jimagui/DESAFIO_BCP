package com.pe.desafio.bcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pe.desafio.bcp.dto.ConversionDto;
import com.pe.desafio.bcp.entity.TipoCambio;
import com.pe.desafio.bcp.observer.TipoCambioConversion;
import com.pe.desafio.bcp.service.TipoCambioService;



@RestController
public class ConversionController {
    
	
	@Autowired
	private TipoCambioService tipoCambioService;
	
	
	@GetMapping("/conversion/{monto}/{monedaOrigen}/{monedaDestino}")
	public ConversionDto  getConversion( @PathVariable double monto,
										 @PathVariable String monedaOrigen,
										 @PathVariable String monedaDestino){

		
		TipoCambioConversion conversionSuscritor = new TipoCambioConversion(monto);
		rx.Observable<TipoCambio> observable = rx.Observable.just(tipoCambioService.obtenerTipoCambio(monedaOrigen, monedaDestino));
		observable.subscribe(conversionSuscritor);
	
		return conversionSuscritor.getConversionDto();
	}
}
