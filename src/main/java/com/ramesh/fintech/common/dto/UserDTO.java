package com.ramesh.fintech.common.dto;

public class UserDTO {
    private String userId;
    private String name;
    private String email;

    public UserDTO() {}

    public UserDTO(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
}
