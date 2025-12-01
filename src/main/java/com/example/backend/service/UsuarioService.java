package com.example.backend.service;



import com.example.backend.model.Usuario;
import com.example.backend.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<Usuario> listar() {
        return repo.findAll();
    }

    public Usuario registrar(Usuario u) {
        return repo.save(u);
    }

    public Usuario login(String email, String clave) {
        return repo.findByEmailAndClave(email, clave);
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }

    public Usuario actualizar(Long id, Usuario datos) {
        return repo.findById(id).map(u -> {
            u.setNombre(datos.getNombre());
            u.setEmail(datos.getEmail());
            u.setEdad(datos.getEdad());
            u.setClave(datos.getClave());
            return repo.save(u);
        }).orElse(null);
    }
}
