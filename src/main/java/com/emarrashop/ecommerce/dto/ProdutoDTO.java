package com.emarrashop.ecommerce.dto;

import java.util.ArrayList;
import java.util.List;

import com.emarrashop.ecommerce.entities.Categoria;
import com.emarrashop.ecommerce.entities.Estoque;
import com.emarrashop.ecommerce.entities.Fornecedor;
import com.emarrashop.ecommerce.entities.Produto;

public class ProdutoDTO {
	
	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	private boolean ativo;
	private List<CategoriaDTO> categorias = new ArrayList<>();
	private String fornecedor;
	private Integer quantidadeEstoque;

	public ProdutoDTO() {
	}

	public ProdutoDTO(Long id, String nome, String descricao, Double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public ProdutoDTO(Produto produto) {
		id = produto.getId();
		nome = produto.getNome();
		descricao = produto.getDescricao();
		preco = produto.getPreco();
		ativo = produto.getAtivo();
		fornecedor = produto.getFornecedor() != null ? produto.getFornecedor().getNome() : null;
		quantidadeEstoque = produto.getEstoque() != null ? produto.getEstoque().getQuantidade() : 0;

		for(Categoria cat : produto.getCategoria()) {
			categorias.add(new CategoriaDTO(cat));
		}
	}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public List<CategoriaDTO> getCategoria() {
		return categorias;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	@Override
	public String toString() {
		return "ProdutoDTO [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

	

}
