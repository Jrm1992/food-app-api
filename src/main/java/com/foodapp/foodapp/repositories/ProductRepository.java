package com.foodapp.foodapp.repositories;

import com.foodapp.foodapp.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
