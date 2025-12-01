package com.example.backend.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.backend.dto.ReportesInventarioDTO;
import com.example.backend.dto.ReportesUsuariosDTO;
import com.example.backend.service.ReportesService;


import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/reportes")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ReportesController {


    private final ReportesService reportesService;


    @GetMapping("/inventario")
    public ReportesInventarioDTO getInventarioReport() {
        return reportesService.getInventarioReport();
    }


    @GetMapping("/usuarios")
    public ReportesUsuariosDTO getUsuariosReport() {
        return reportesService.getUsersReport();
    }
}

