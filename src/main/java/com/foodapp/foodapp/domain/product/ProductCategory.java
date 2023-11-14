package com.foodapp.foodapp.domain.product;

public enum ProductCategory {

    DRINK("Drink"),
    FOOD("Food");

    private String category;

    ProductCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
