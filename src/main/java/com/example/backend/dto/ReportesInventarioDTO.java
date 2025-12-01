package com.example.backend.dto;


import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor 
public class ReportesInventarioDTO {
    private int totalProductos;
    private int totalCriticos;
    private int stockTotal;
    private long valorInventario;


    private List<Map<String, Object>> stockPorCategoria;
    private List<Map<String, Object>> distribucionStock;
    private List<Map<String, Object>> topCaros;
    private List<Map<String, Object>> valorPorCategoria;
}

