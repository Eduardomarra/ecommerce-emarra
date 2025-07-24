package com.emarrashop.ecommerce.builder;

import org.springframework.stereotype.Component;

import com.emarrashop.ecommerce.dto.FornecedorDTO;
import com.emarrashop.ecommerce.entities.Fornecedor;

@Component
public class FornecedorBuilder {

	public void build(FornecedorDTO dto, Fornecedor fornecedor) {
		fornecedor.setNome(dto.getNome());
		fornecedor.setEmail(dto.getEmail());
		fornecedor.setTelefone(dto.getTelefone());
		fornecedor.setCnpj(dto.getCnpj());
		fornecedor.setAtivo(dto.getAtivo());
	}
}
