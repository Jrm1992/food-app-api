package com.foodapp.foodapp.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
