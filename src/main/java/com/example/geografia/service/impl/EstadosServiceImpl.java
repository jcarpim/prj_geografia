package com.example.geografia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.geografia.model.Estados;
import com.example.geografia.repository.EstadosRepository;
import com.example.geografia.service.EstadosService;

public class EstadosServiceImpl implements EstadosService {
	@Autowired
	private EstadosRepository repository;

	@Override
	public List<Estados> findAllBySigla(String sigla) {
		return repository.findAllBySigla(sigla);
	}

}