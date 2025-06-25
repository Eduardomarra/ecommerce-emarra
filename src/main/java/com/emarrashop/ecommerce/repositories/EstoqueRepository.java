package com.emarrashop.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emarrashop.ecommerce.entities.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

	Optional<Estoque> findByProduto_Id(Long produtoId);

}
