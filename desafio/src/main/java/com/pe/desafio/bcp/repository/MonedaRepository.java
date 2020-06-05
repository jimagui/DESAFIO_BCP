package com.pe.desafio.bcp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pe.desafio.bcp.entity.Moneda;

@Repository
public interface MonedaRepository extends CrudRepository<Moneda, Integer>{

}
