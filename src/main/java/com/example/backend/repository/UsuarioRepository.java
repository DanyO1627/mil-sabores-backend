package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email); // AHORA SOLO BUSCAMOS EL USUARIO POR EL EMAIL, 
    // por la seguridad y porque ahora las claves estarán encriptadas.
}



