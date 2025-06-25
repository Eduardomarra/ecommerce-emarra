package com.emarrashop.ecommerce.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "estoque")
public class Estoque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@MapsId
	@JoinColumn(name = "produto_id", unique = true)
	private Produto produto;
	
	private Integer quantidade;
	
	@Column(name = "data_ultima_atualizacao")
	private LocalDateTime dataUltimaAtualizacao;
	
	public Estoque() {}

	public Estoque(Produto produto, Integer quantidade, LocalDateTime dataUltimaAtualizacao) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDateTime getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}

	public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
}
