package com.pe.desafio.bcp.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.desafio.bcp.entity.TipoCambio;

@Repository
public interface TipoCambioRepository extends CrudRepository<TipoCambio, Integer>{

	@Query("from TipoCambio t  where t.codigoOrigen = :codigoOrigen and t.codigoDestino = :codigoDestino")
	TipoCambio findTipoCambio(String codigoOrigen,String codigoDestino);
}
