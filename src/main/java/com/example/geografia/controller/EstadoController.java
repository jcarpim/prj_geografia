package com.example.geografia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.geografia.model.response.EstadoResponse;
import com.example.geografia.resource.EstadoResource;
import com.example.geografia.service.EstadosService;

@RestController
public class EstadoController implements EstadoResource {

	@Autowired
	private EstadosService service;

	@Override
	@GetMapping(path = "/todos",  produces = "application/json")
	public ResponseEntity<List<EstadoResponse>> carregarTodos() {
		List<EstadoResponse> responses = service.findAll();
		return ResponseEntity.ok().body(responses);

	}

}