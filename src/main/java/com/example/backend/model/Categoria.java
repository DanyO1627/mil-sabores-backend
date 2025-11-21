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
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id; 

    @Column (nullable=false, length = 28)
    private String nombreCategoria; 

    @Column (nullable=false, length=100)
    private String descripcionCategoria;

    @Column (nullable=false, length=255)
    private String imagenUrl; 

    @Column(nullable = true)
    private Boolean activo;



}

