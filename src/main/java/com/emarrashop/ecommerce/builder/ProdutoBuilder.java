package com.emarrashop.ecommerce.builder;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emarrashop.ecommerce.dto.ProdutoDTO;
import com.emarrashop.ecommerce.entities.Categoria;
import com.emarrashop.ecommerce.entities.Estoque;
import com.emarrashop.ecommerce.entities.Fornecedor;
import com.emarrashop.ecommerce.entities.Produto;
import com.emarrashop.ecommerce.repositories.CategoriaRepository;
import com.emarrashop.ecommerce.repositories.EstoqueRepository;
import com.emarrashop.ecommerce.repositories.FornecedorRepository;

@Component
public class ProdutoBuilder {

	@Autowired CategoriaRepository categoriaRepository;
	@Autowired FornecedorRepository fornecedorRepository;
	@Autowired EstoqueRepository estoqueRepository;
	
	public void copiarProdutosParaEntidade(ProdutoDTO dto, Produto produto) {
		produto.setNome(dto.getNome());
		produto.setDescricao(dto.getDescricao());
		produto.setPreco(dto.getPreco());
		produto.setAtivo(dto.getAtivo());

		if (dto.getCategoria() != null && !dto.getCategoria().isEmpty()) {
			List<Categoria> categorias = categoriaRepository.findByNomeIn(dto.getCategoria());
			produto.setCategoria(categorias);
		}

		if (dto.getFornecedor() != null) {
			Fornecedor fornecedor = fornecedorRepository.findByNome(dto.getFornecedor())
					.orElseThrow(() -> new RuntimeException("Fornecedor não encontrado"));
			produto.setFornecedor(fornecedor);
		}

		Estoque estoque = produto.getEstoque();
		if (estoque == null) {
			estoque = new Estoque();
			estoque.setProduto(produto);
		}
		estoque.setQuantidade(dto.getQuantidadeEstoque());
		estoque.setDataUltimaAtualizacao(LocalDateTime.now());
		produto.setEstoque(estoque);
	}
}
