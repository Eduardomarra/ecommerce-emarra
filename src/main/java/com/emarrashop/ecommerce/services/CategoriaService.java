package com.emarrashop.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emarrashop.ecommerce.builder.CategoriaBuilder;
import com.emarrashop.ecommerce.dto.CategoriaDTO;
import com.emarrashop.ecommerce.entities.Categoria;
import com.emarrashop.ecommerce.repositories.CategoriaRepository;
import com.emarrashop.ecommerce.repositories.ProdutoRepository;

@Service
public class CategoriaService {

	@Autowired CategoriaRepository categoriaRepository;
	@Autowired ProdutoRepository produtoRepository;
	@Autowired CategoriaBuilder categoriaBuilder;

	@Transactional(readOnly = true)
	public List<CategoriaDTO> getAllCategorias() {
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias.stream().map(CategoriaDTO::new).toList();
	}

	@Transactional(readOnly = true)
	public CategoriaDTO findById(Long idCategoria) {
		Categoria categoria = categoriaRepository.findById(idCategoria).orElseThrow();
		return new CategoriaDTO(categoria);
	}

	@Transactional
	public CategoriaDTO inserirCategoria(CategoriaDTO dto) {
		Categoria categoria = new Categoria();
		categoriaBuilder.build(dto, categoria);
		categoriaRepository.save(categoria);
		return new CategoriaDTO(categoria);
	}

	@Transactional
	public CategoriaDTO atualizarCategoria(Long id, CategoriaDTO dto) {
		try {
			Categoria categoria = categoriaRepository.getReferenceById(id);
			categoriaBuilder.build(dto, categoria);
			categoria = categoriaRepository.save(categoria);
			return new CategoriaDTO(categoria);
		}
		catch (Exception e) {
			throw new Error("Categoria não encontrada.");
		}
	}
}
