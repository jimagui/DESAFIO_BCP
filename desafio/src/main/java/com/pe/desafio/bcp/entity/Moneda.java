package com.pe.desafio.bcp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TBL_MONEDA")
public class Moneda {

	  
	@Id	
	@GeneratedValue
    @Column(name = "id", nullable = false)	
	private  Integer id;	
    
	@NotNull(message = "Codigo  obligatorio")
	@Min(value = 3, message = "Codigo Origen no debe ser menor que 3")
	@Max(value = 3, message = "Codigo Origen no debe ser mayor que 3")
	@Column(name = "codigo")
	private  String codigo;
	
	
	@Min(value = 3, message = "Numero no debe ser menor que 3")
	@Max(value = 3, message = "Numero Origen no debe ser mayor que 3")
	@Column(name = "numero")
	private  String numero;
	
	
	@NotNull(message = "Divisa obligatorio")
	@Column(name = "divisa")
	private String divisa;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	
	
	
}
