package com.emarrashop.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emarrashop.ecommerce.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
