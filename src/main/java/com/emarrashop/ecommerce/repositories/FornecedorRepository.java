package com.emarrashop.ecommerce.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emarrashop.ecommerce.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

	@Query(nativeQuery = true, value = "SELECT * " + "FROM FORNECEDORES " + "WHERE ATIVO = FALSE")
	List<Fornecedor> buscarInativos();

	@Query(nativeQuery = true, value = "SELECT * " + "FROM FORNECEDORES " + "WHERE ATIVO = TRUE")
	List<Fornecedor> buscarAtivos();

	Optional<Fornecedor> findByNome(String fornecedor);

}
