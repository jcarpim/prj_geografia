package com.example.geografia.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.geografia.model.Estados;
import com.example.geografia.model.response.EstadoResponse;
import com.example.geografia.repository.EstadosRepository;
import com.example.geografia.service.EstadosService;

@Service
public class EstadosServiceImpl implements EstadosService {
	@Autowired
	private EstadosRepository repository;

	@Override
	public List<Estados> findAllBySigla(String sigla) {
		return repository.findAllBySigla(sigla);
	}

	@Override
	public List<EstadoResponse> findAll() {
		List<Estados> estados = repository.findAll();
		final List<EstadoResponse> responses = new ArrayList<EstadoResponse>();
		estados.forEach(estado -> {
			EstadoResponse response = new EstadoResponse(estado.getId(), estado.getUf());
			responses.add(response);
		});
		return responses;
	}

}