package com.shx.locacao.veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shx.locacao.veiculos.model.Carro;

@RepositoryRestResource(path = "restCarros")
public interface CarroRepository extends JpaRepository<Carro, Integer>, QuerydslPredicateExecutor<Carro>  {


}