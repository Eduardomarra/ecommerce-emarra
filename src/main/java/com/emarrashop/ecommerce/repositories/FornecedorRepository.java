package com.emarrashop.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emarrashop.ecommerce.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

	Optional<Fornecedor> findByNome(String fornecedor);

}
