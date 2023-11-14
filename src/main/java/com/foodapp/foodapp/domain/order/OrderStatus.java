package com.foodapp.foodapp.domain.order;

public enum OrderStatus {

    NEW("New"),
    CONFIRMED("Confirmed"),
    CANCELLED("Cancelled");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
