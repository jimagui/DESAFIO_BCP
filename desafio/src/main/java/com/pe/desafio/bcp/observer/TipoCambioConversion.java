package com.pe.desafio.bcp.observer;

import org.apache.commons.math3.util.Precision;

import com.pe.desafio.bcp.dto.ConversionDto;
import com.pe.desafio.bcp.entity.TipoCambio;

import rx.Subscriber;

public class TipoCambioConversion  extends  Subscriber<TipoCambio>{
   
   private double monto;
   private Double montoCambio;
   private ConversionDto conversionDto = new ConversionDto();

 

	public TipoCambioConversion(double monto) {
		super();
		this.monto = monto; 
	}

	@Override
	public void onCompleted() {
		System.out.println("onCompleted");
		
	}

	@Override
	public void onError(Throwable e) {
		System.out.println("onError" + e.getMessage());
		
	}

	@Override
	public void onNext(TipoCambio t) {
		montoCambio = Precision.round(monto * t.getTipoCambio(),2);
		conversionDto.setMonedaOrigen(t.getCodigoOrigen());
		conversionDto.setMonedaDestino(t.getCodigoDestino());
		conversionDto.setMonto(monto);
		conversionDto.setMontoCambio(montoCambio);
		conversionDto.setTipoCambio(t.getTipoCambio());
	}

	public ConversionDto getConversionDto() {
		return conversionDto;
	}

	
	

}
