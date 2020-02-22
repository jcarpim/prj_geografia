package com.example.geografia.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.geografia.model.response.EstadoResponse;

@RequestMapping(value="estados")
public interface EstadoResource {

	ResponseEntity<List<EstadoResponse>> carregarTodos();
}
