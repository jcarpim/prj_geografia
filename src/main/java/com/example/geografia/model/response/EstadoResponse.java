package com.example.geografia.model.response;

import java.io.Serializable;

public class EstadoResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer codigo;
	private String sigla;
	
	public EstadoResponse(Integer codigo, String sigla) {
		super();
		this.codigo = codigo;
		this.sigla = sigla;
	}
	
	public EstadoResponse() {
		super();
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
