package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.backend.model.Boleta;
import com.example.backend.repository.BoletaRepository;

@Service
public class BoletaService {

    private final BoletaRepository repo;

    public BoletaService(BoletaRepository repo) {
        this.repo = repo;
    }

    public Boleta guardar(Boleta boleta) {

        // asegurar relación bidireccional
        if (boleta.getCarrito() != null) {
            boleta.getCarrito().forEach(item -> item.setBoleta(boleta));
        }

        return repo.save(boleta);
    }

    public List<Boleta> listar() {
        return repo.findAll();
    }

    public Optional<Boleta> obtener(Long id) {
        return repo.findById(id);
    }

    public List<Boleta> listarPorUsuario(Long usuarioId) {
        return repo.findByUsuarioId(usuarioId);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
