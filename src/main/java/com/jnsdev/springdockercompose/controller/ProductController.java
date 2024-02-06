package com.jnsdev.springdockercompose.controller;

import com.jnsdev.springdockercompose.model.Product;
import com.jnsdev.springdockercompose.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 06/02/2024 - 12:56
 */

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductRepository repository;

    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @PostMapping("/api/products")
    public HttpStatus saveProduct(@RequestBody Product product) {
        repository.save(product);
        return HttpStatus.CREATED;
    }
}
