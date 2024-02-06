package com.jnsdev.springdockercompose.repository;

import com.jnsdev.springdockercompose.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Autor Jairo Nascimento
 * @Created 06/02/2024 - 13:15
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
