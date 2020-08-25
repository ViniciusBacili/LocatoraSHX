package com.shx.locacao.veiculos.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Table
@Entity
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name ="marca", nullable = false)
	private String marca;
	
	@Column(name= "nome", nullable = false)
	private String nome;
	
	@Column(name= "dataAno", nullable = false, columnDefinition = "date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataAno;
	
	@Column(name= "dataModelo", nullable = false, columnDefinition = "date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataModelo;
	
	@Column(name= "combustivel", nullable = false)
	private String combustivel;
	
	@Column(name= "diaria", precision=10, scale=2)
	private Integer diaria;
	
	@Column(name = "status" , nullable = false, columnDefinition = "tinyint(3) default 1",  insertable = false, updatable = true)
	private Integer status;
	
	public Carro() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataAno() {
		return dataAno;
	}

	public void setDataAno(Calendar dataAno) {
		this.dataAno = dataAno;
	}

	public Calendar getDataModelo() {
		return dataModelo;
	}

	public void setDataModelo(Calendar dataModelo) {
		this.dataModelo = dataModelo;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getDiaria() {
		return diaria;
	}

	public void setDiaria(Integer diaria) {
		this.diaria = diaria;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", marca=" + marca + ", nome=" + nome + ", dataAno=" + dataAno + ", dataModelo=" + dataModelo
				+ ", combustivel=" + combustivel + ", diaria=" + diaria + ", status=" + status + "]";
	}
	
}
