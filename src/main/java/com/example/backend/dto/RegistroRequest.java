package com.example.backend.dto;

import lombok.Data;

@Data
public class RegistroRequest {
    private String nombre;
    private String email;
    private Integer edad;
    private String clave;
    private String region;
    private String comuna;
}
