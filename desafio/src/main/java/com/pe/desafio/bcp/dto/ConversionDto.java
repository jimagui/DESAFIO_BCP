package com.pe.desafio.bcp.dto;

public class ConversionDto {
	
	private double monto;
	private Double montoCambio;
	private String monedaOrigen;
	private String monedaDestino;
	private double tipoCambio;
	
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Double getMontoCambio() {
		return montoCambio;
	}
	public void setMontoCambio(Double montoCambio) {
		this.montoCambio = montoCambio;
	}
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	
}
