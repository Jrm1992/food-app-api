package com.foodapp.foodapp.controllers;

import com.foodapp.foodapp.domain.product.Product;
import com.foodapp.foodapp.domain.product.ProductRequestDTO;
import com.foodapp.foodapp.domain.product.ProductResponseDTO;
import com.foodapp.foodapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        List<ProductResponseDTO> products = this.productRepository.findAll().stream().map(ProductResponseDTO::new).toList();

        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductRequestDTO product) {
        Product newProduct = new Product(product);

        this.productRepository.save(newProduct);
        return ResponseEntity.ok().build();
    }
}
