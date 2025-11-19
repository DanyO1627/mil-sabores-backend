package com.example.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "administradores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administradores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nombre;

    @Column(length = 300)
    private String email;

    @Column(length = 6)
    private String clave;

    @Column(length = 30)
    private String rol;

    @Column(length = 40)
    private String sucursal;

    @Column(length = 100)
    private String avatar;
}

