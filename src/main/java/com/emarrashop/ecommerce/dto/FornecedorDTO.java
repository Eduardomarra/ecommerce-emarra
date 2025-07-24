package com.emarrashop.ecommerce.dto;

import com.emarrashop.ecommerce.entities.Fornecedor;

public class FornecedorDTO {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String cnpj;
	private Boolean ativo = true;

	public FornecedorDTO() {}

	public FornecedorDTO(Fornecedor fornecedor) {
		this.id = fornecedor.getId();
		this.nome = fornecedor.getNome();
		this.email = fornecedor.getEmail();
		this.telefone = fornecedor.getTelefone();
		this.cnpj = fornecedor.getCnpj();
		this.ativo = fornecedor.getAtivo();
	}

	public FornecedorDTO(Long id, String nome, String email, String telefone, String cnpj, Boolean ativo) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.ativo = ativo;
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

	public Boolean getAtivo() {
		return ativo;
	}
}
