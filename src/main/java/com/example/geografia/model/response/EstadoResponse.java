package com.example.geografia.model.response;

import java.io.Serializable;

public class EstadoResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer codigo;
	@JsonProperty(value = "SIGLA_COM")
	private String uf;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
  
	public EstadoResponse() {
		super();
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public EstadoResponse(Integer codigo, String uf) {
		super();
		this.codigo = codigo;
		this.uf = uf;
	}
 
	
	
}
