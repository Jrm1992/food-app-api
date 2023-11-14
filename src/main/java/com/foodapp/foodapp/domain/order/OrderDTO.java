package com.foodapp.foodapp.domain.order;

import com.foodapp.foodapp.domain.product.Product;
import com.foodapp.foodapp.domain.user.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record OrderDTO(
        @NotBlank
        User user,

        @NotBlank
        OrderStatus status,

        @NotBlank
        Product[] products
) {
}
