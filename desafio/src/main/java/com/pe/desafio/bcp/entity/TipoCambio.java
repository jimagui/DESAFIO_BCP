package com.pe.desafio.bcp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TBL_TIPO_CAMBIO")
public class TipoCambio {

	@Id	
	@GeneratedValue
	@Column(name = "id")
	private  Integer id;
	
	@Column(name = "tipoCambio")
	@NotNull(message = "Tipo Cambio obligatorio")
	private  double tipoCambio;

	@NotNull(message = "Codigo Origen obligatorio")
	@Column(name = "codigoOrigen")
	private  String codigoOrigen;
	

	@NotNull(message = "Codigo Destino obligatorio")
	@Column(name = "codigoDestino")
	private  String codigoDestino;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public String getCodigoOrigen() {
		return codigoOrigen;
	}

	public void setCodigoOrigen(String codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	public String getCodigoDestino() {
		return codigoDestino;
	}

	public void setCodigoDestino(String codigoDestino) {
		this.codigoDestino = codigoDestino;
	}
	
	
	  
}
