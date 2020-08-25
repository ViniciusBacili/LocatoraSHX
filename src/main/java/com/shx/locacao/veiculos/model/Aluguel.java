package com.shx.locacao.veiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(uniqueConstraints = {
		@UniqueConstraint(columnNames={"cliente_cpf", "carro_id"})
})
@Entity
public class Aluguel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(targetEntity = Cliente.class)
	private Cliente cliente;

	@ManyToOne(targetEntity = Carro.class)
	private Carro carro;
	
	
	public Aluguel(Cliente cliente, Carro carro) {
		this.cliente = cliente;
		this.carro = carro;
	}
}