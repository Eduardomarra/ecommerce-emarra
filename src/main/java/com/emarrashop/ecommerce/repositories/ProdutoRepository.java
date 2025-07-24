package com.emarrashop.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emarrashop.ecommerce.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM PRODUTOS WHERE ATIVO = TRUE")
	List<Produto> buscarAtivos();

	@Query(nativeQuery = true, value = "SELECT * FROM PRODUTOS WHERE ATIVO = FALSE")
	List<Produto> buscarInativos();
}
