package com.example.geografia.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Paises {
	
	@Id
	private Integer id;
	@Column (name = "nome")
	private String nome;
	@Column (name = "nome_pt")
	private String nome_pt;
	@Column (name = "sigla")
	private String sigla;
	@Column (name = "bacen")
	private Integer bacen;
	
	
	public Paises() {
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


	public String getNome_pt() {
		return nome_pt;
	}


	public void setNome_pt(String nome_pt) {
		this.nome_pt = nome_pt;
	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public Integer getBacen() {
		return bacen;
	}


	public void setBacen(Integer bacen) {
		this.bacen = bacen;
	}
	
	
}
