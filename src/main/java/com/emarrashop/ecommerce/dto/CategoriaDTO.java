package com.emarrashop.ecommerce.dto;

import com.emarrashop.ecommerce.entities.Categoria;

public class CategoriaDTO {

	private Long id;
	private String nome;

	public CategoriaDTO() {
	}

	public CategoriaDTO(Long id, String name) {
		this.id = id;
		this.nome = name;
	}

	public CategoriaDTO(Categoria categoria) {
		this.id = categoria.getId();
		this.nome = categoria.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
