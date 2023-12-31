package com.foodapp.foodapp.domain.product;

public record ProductResponseDTO(
        String id,
        String name,
        Integer price,
        String description,

        ProductCategory category

) {
    public ProductResponseDTO(Product product) {
        this(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getDescription(),
                product.getCategory()
        );
    }
}
