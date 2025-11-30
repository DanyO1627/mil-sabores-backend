package com.example.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Boleta;
import com.example.backend.model.ItemBoleta;
import com.example.backend.service.BoletaService;

@RestController
@RequestMapping("/api/boletas")
@CrossOrigin("*")
public class BoletaController {

    private final BoletaService service;

    public BoletaController(BoletaService service) {
        this.service = service;
    }

    @PostMapping
    public Boleta crear(@RequestBody Boleta boleta) {

        if (boleta.getCarrito() != null) {
            for (ItemBoleta item : boleta.getCarrito()) {
                item.setBoleta(boleta);
            }
        }

        return service.guardar(boleta);
    }

    @GetMapping
    public List<Boleta> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Boleta obtener(@PathVariable Long id) {
        return service.obtener(id).orElse(null);
    }

    @GetMapping("/usuario/{idUsuario}")
    public List<Boleta> listarPorUsuario(@PathVariable Long idUsuario) {
        return service.listarPorUsuario(idUsuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
