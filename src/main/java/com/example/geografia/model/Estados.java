package com.example.geografia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estados {
	
	@Id
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "uf")
	private String uf;
	@Column(name = "ibge")
	private String ibge;
	@Column(name = "pais")
	private String pais;
	@Column(name = "ddd")
	private String ddd;
	
	
	public Estados() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getIbge() {
		return ibge;
	}


	public void setIbge(String ibge) {
		this.ibge = ibge;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	
	
}
