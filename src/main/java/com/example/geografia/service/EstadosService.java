package com.example.geografia.service;

import java.util.List;

import com.example.geografia.model.Estados;

public interface EstadosService {

	public List<Estados>findAllBySigla(String sigla);
	
	
}
