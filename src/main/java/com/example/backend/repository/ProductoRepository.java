package com.example.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.Producto;

// LOS REPOSITORIOS SON LOS QUE HABLAN CON LA BASE DE DATOS, 
// COMO SECRETARIOS, DAME ESTO, LLEVA ESTO, BORRA ESTO ETC


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>
{

    // Buscar por nombre (no busca exacto exacto)
    List<Producto> findByNombreContainingIgnoreCase(String nombre);

    // Buscar por categoría (el id de la categoria (fk))
    List<Producto> findByCategoriaId(Long idCategoria);

}









