package com.foodapp.foodapp.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDTO(
        @NotBlank
        String name,

        @NotNull
        Integer price,

        @NotNull
        String description,

        @NotNull
        ProductCategory category

) {
}
