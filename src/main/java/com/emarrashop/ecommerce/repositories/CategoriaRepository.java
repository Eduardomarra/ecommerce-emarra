package com.emarrashop.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emarrashop.ecommerce.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
