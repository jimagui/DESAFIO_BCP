package com.pe.desafio.bcp.service;



import com.pe.desafio.bcp.entity.TipoCambio;


public interface TipoCambioService{

	
	TipoCambio obtenerTipoCambio(String monedaOrigen, String monedaDestino);
}
