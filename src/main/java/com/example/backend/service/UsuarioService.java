package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.backend.model.Usuario;
import com.example.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository repo, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.passwordEncoder = passwordEncoder;
    }

    public List<Usuario> listar() {
        return repo.findAll();
    }


    // EN EL MISMO REGISTRO
    // ahora ENCRIPTAMOS las claves
    public Usuario registrar(Usuario u) {

        String claveEncriptada = passwordEncoder.encode(u.getClave());
        u.setClave(claveEncriptada);

        return repo.save(u);
    }

    // Y POR TANTO AHORA EN EL LOGIN
    // COMPARAMOS las CLAVES con las BCRYPT
    public Usuario login(String email, String claveIngresada) {

        Usuario u = repo.findByEmail(email);

        if (u == null) return null;

        // comprara la clave ingresada con el HASH guardado
        boolean coincide = passwordEncoder.matches(claveIngresada, u.getClave());

        return coincide ? u : null;
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

            if (datos.getClave() != null && !datos.getClave().isEmpty()) {
                String claveEncriptada = passwordEncoder.encode(datos.getClave());
                u.setClave(claveEncriptada);
            }

            return repo.save(u);
        }).orElse(null);
    }
}







