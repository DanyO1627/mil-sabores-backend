package com.example.backend.dto;


import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor 
public class ReportesUsuariosDTO {
    private int totalUsuarios;
    private List<Map<String, Object>> usuariosPorRegion;
    private List<Map<String, Object>> usuariosPorEdad;
    private List<Map<String, Object>> usuariosPorEstado;
}

