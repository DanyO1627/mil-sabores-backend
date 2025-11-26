package com.example.backend.repository;

import com.example.backend.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmailAndClave(String email, String clave);
}
