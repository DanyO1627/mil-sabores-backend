package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.Administradores;

public interface AdministradoresRepository extends JpaRepository<Administradores, Long> {
 
}
