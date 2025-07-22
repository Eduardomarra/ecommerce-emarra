package com.emarrashop.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emarrashop.ecommerce.dto.CategoriaDTO;
import com.emarrashop.ecommerce.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

	@Autowired CategoriaService categoriaService;

	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> getAllCategorias() {
		List<CategoriaDTO> categorias = categoriaService.getAllCategorias();
		return ResponseEntity.ok(categorias);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoriaDTO> getCategoriaPorId(@PathVariable Long id) {
		CategoriaDTO categoria = categoriaService.findById(id);
		return ResponseEntity.ok(categoria);
	}

	@PostMapping(value = "/inserir")
	public ResponseEntity<CategoriaDTO> inserirCategoria(@RequestBody CategoriaDTO dto) {
		CategoriaDTO categoria = categoriaService.inserirCategoria(dto);
		return ResponseEntity.ok(categoria);
	}

	@PutMapping(value = "/atualizar/{id}")
	public ResponseEntity<CategoriaDTO> atualizarCategoria(@PathVariable Long id, @RequestBody CategoriaDTO dto) {
		CategoriaDTO categoria = categoriaService.atualizarCategoria(id, dto);
		return ResponseEntity.ok(categoria);
	}
}
