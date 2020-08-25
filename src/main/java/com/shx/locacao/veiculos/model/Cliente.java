package com.shx.locacao.veiculos.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Table
@Entity
public class Cliente {
	
	@Id
	@Column(name= "cpf", unique = true)
	private Long cpf;
	
	@Column(name= "nome", nullable = false)
	private String nome;
	
	@Column(name="dataNascimento", nullable = false, columnDefinition = "date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataNasc;
	
	@Column(name = "status" , nullable = false, columnDefinition = "tinyint(3) default 1",  insertable = false, updatable = true)
	private Integer status;
	
	public Cliente() {
	}

	public Cliente(Long cpf, String nome, Calendar dataNasc, Integer status) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.status = status;
	}
	
	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer ativo) {
		this.status = ativo;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ",dataNasc=" + dataNasc + ",status=" + status + "]";
	}
}