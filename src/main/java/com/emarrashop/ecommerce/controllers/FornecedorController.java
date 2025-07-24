package com.emarrashop.ecommerce.controllers;

import java.time.temporal.ValueRange;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emarrashop.ecommerce.dto.FornecedorDTO;
import com.emarrashop.ecommerce.services.FornecedorService;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorController {

	@Autowired FornecedorService fornecedorService;

	@GetMapping
	public ResponseEntity<List<FornecedorDTO>> getAllFornecedores() {
		List<FornecedorDTO> dto = fornecedorService.getAllForenecedores();
		return ResponseEntity.ok(dto);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<FornecedorDTO> getFornecedorPorId(@PathVariable Long id) {
		FornecedorDTO dto = fornecedorService.findById(id);
		return ResponseEntity.ok(dto);
	}

	@PostMapping(value = "/inserir")
	public ResponseEntity<FornecedorDTO> inserirFornecedor(@RequestBody FornecedorDTO dto) {
		FornecedorDTO fornecedor = fornecedorService.inserirFornecedor(dto);
		return ResponseEntity.ok(fornecedor);
	}

	@PutMapping(value = "/atualizar/{id}")
	public ResponseEntity<FornecedorDTO> atualizarFornecedor(@PathVariable Long id, @RequestBody FornecedorDTO dto) {
		FornecedorDTO fornecedor = fornecedorService.atualizarFornecedor(id, dto);
		return ResponseEntity.ok(fornecedor);
	}
}
