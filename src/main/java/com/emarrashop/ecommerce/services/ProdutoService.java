package com.emarrashop.ecommerce.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emarrashop.ecommerce.builder.ProdutoBuilder;
import com.emarrashop.ecommerce.dto.ProdutoDTO;
import com.emarrashop.ecommerce.entities.Produto;
import com.emarrashop.ecommerce.repositories.ProdutoRepository;


@Service
public class ProdutoService {

	@Autowired ProdutoRepository produtoRepository;
	@Autowired ProdutoBuilder produtoBuilder;
	
	@Transactional(readOnly = true)
	public List<ProdutoDTO> getAllProdutos() {
		List<Produto> produtos = produtoRepository.findAll();
		return produtos.stream()
                .map(ProdutoDTO::new)
                .collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ProdutoDTO findById(Long id) {
		Produto produto = produtoRepository.findById(id).orElseThrow();
		return new ProdutoDTO(produto);
	}
	
	@Transactional
	public ProdutoDTO inserirProduto(ProdutoDTO dto) {
		Produto produto = new Produto();
		produtoBuilder.build(dto, produto);
		produtoRepository.save(produto);
		return new ProdutoDTO(produto);
	}
	
	@Transactional
	public ProdutoDTO atualizarProduto(Long id, ProdutoDTO dto) {
		try {
			Produto produto = produtoRepository.getReferenceById(id);
			produtoBuilder.build(dto, produto);
			produto = produtoRepository.save(produto);
			return new ProdutoDTO(produto);
		}
		catch (Exception e) {
			throw new Error("Recurso não encontrado.");
		}
	}

	@Transactional
	public void deletarProduto(Long id) {
		if(!produtoRepository.existsById(id)) {
			throw new Error("Produto não encontrado.");
		}
		
		try {
			produtoRepository.deleteById(id);
		}
		catch (Exception e) {
			throw new Error("Produto não encontrado.");
		}
	}
	
}
