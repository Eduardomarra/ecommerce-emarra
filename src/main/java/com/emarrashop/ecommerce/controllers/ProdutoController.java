package com.emarrashop.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emarrashop.ecommerce.dto.ProdutoDTO;
import com.emarrashop.ecommerce.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	@Autowired ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<ProdutoDTO>> getAllProdutos() {
		List<ProdutoDTO> produtos = produtoService.getAllProdutos();
		return ResponseEntity.ok(produtos);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProdutoDTO> getProdutoPorId(@PathVariable Long id) {
		ProdutoDTO produto = produtoService.findById(id);
		return ResponseEntity.ok(produto);
	}

	@PostMapping(value = "/inserirproduto")
	public ResponseEntity<ProdutoDTO> inserirProduto(@RequestBody ProdutoDTO dto) {
		ProdutoDTO produto = produtoService.inserirProduto(dto);
		return ResponseEntity.ok(produto);
	}

	@PutMapping(value = "/atualizarproduto/{id}")
	public ResponseEntity<ProdutoDTO> atualizarProduto(@PathVariable Long id, @RequestBody ProdutoDTO dto) {
		ProdutoDTO produto = produtoService.atualizarProduto(id, dto);
		return ResponseEntity.ok(produto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
		produtoService.deletarProduto(id);
		return ResponseEntity.noContent().build();
	}

}
