package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private Long id;
    private String nombre;
    private String email;
    private String rol;
    private String token; // LO NUEVO, LO DEL TOKEN DE JWT
}
