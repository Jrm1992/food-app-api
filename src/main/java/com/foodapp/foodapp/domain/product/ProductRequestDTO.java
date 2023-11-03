package com.foodapp.foodapp.domain.product;

public record ProductRequestDTO(
    String name,
    Integer price,
    String description
) {
    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
