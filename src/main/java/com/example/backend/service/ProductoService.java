package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.Producto;
import com.example.backend.repository.ProductoRepository;

// LOS SERVICES SON PARA LA LÓGICA DE NEGOCIO, 
// VALIDA COSAS, CALCULA COSAS, REVISA PERMISOS, GENERA COSAS, 
// ES EL CEREBRO, LA PARTE DE LA INTELIGENCIA.

@Service 
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Producto findById(Long id) { 
        return productoRepository.findById(id).orElse(null); 
    } 
 
    public Producto save(Producto producto) { 
        return productoRepository.save(producto); 
    } 
 
    public void delete(Long id) { 
        productoRepository.deleteById(id); 
    } 

    // para que busque por nombre
    public List<Producto> findByNombre(String nombre) {
        return productoRepository.findByNombreProductoContainingIgnoreCase(nombre);
        

    }

    // para que busque por categoria
    public List<Producto> findByCategoria(Long idCategoria) {
        return productoRepository.findByCategoriaId(idCategoria);
    }

}