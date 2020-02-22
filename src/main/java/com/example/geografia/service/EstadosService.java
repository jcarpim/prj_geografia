package com.example.geografia.service;

import java.util.List;

import com.example.geografia.model.Estados;
import com.example.geografia.model.response.EstadoResponse;

public interface EstadosService {
	public List<Estados>findAllBySigla(String nome);
	
	public List<EstadoResponse> findAll();

}