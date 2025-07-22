package com.emarrashop.ecommerce.builder;

import org.springframework.stereotype.Component;

import com.emarrashop.ecommerce.dto.CategoriaDTO;
import com.emarrashop.ecommerce.entities.Categoria;

@Component
public class CategoriaBuilder {

	public void build(CategoriaDTO dto, Categoria categoria) {
		categoria.setNome(dto.getNome());
	}

}
