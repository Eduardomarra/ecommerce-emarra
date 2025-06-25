package com.emarrashop.ecommerce.dto;

public class CategoriaDTO {

	private Long id;
	private String name;

	public CategoriaDTO() {
	}

	public CategoriaDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public CategoriaDTO(CategoriaDTO categoria) {
		this.id = categoria.getId();
		this.name = categoria.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
