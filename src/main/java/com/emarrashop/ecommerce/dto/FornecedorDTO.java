package com.emarrashop.ecommerce.dto;

import java.util.List;

import com.emarrashop.ecommerce.entities.Fornecedor;
import com.emarrashop.ecommerce.entities.Produto;

import jakarta.persistence.OneToMany;

public class FornecedorDTO {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String cnpj;

	public FornecedorDTO() {}

	public FornecedorDTO(Fornecedor fornecedor) {
		this.id = fornecedor.getId();
		this.nome = fornecedor.getNome();
		this.email = fornecedor.getEmail();
		this.telefone = fornecedor.getTelefone();
		this.cnpj = fornecedor.getCnpj();
	}

	public FornecedorDTO(Long id, String nome, String email, String telefone, String cnpj) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCnpj() {
		return cnpj;
	}
}
