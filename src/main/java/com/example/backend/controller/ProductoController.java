package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Producto;
import com.example.backend.service.ProductoService;

// LOS CONTROLLER SON EL PUENTE ENTRE EL BACKEND Y EL FRONTEND,
// CON LOS MAPPINGS Y 
// REACT.
// DECIDE A QUÉ SERVICE LLAMAR.
// LOS CONTROLLER RECIBEN PETICIONES DESDE EL FRONTEND, ELLOS 
// LLAMAN A UN SERVICE, EL SERVICE MANDA AL REPOSITORY PARA 
// QUE SE COMUNIQUE CON LA BBDD Y AHÍ SE DEVEULVE.
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAll() {
        return productoService.obtenerTodosLosProductos();
    }

    @GetMapping("/{id}")
    public Producto getById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Producto producto) {

        // 🔵 AGREGAR ESTOS LOGS
        System.out.println("========================================");
        System.out.println("🔵 PETICIÓN POST RECIBIDA");
        System.out.println("Producto recibido: " + producto);
        System.out.println("Nombre: " + producto.getNombreProducto());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());
        System.out.println("Imagen URL: " + producto.getImagenUrl());
        System.out.println("Descripción: " + producto.getDescripcionProducto());
        System.out.println("Descripción Larga: " + producto.getDescripcionLarga());
        System.out
                .println("Categoría: " + (producto.getCategoria() != null ? producto.getCategoria().getId() : "null"));
        System.out.println("========================================");

        // --- VALIDACIONES POR CAMPOS OBLIGATORIOS ---
        if (producto.getNombreProducto() == null || producto.getNombreProducto().isBlank()) {
            System.out.println("❌ ERROR: Nombre vacío");
            return ResponseEntity.badRequest().body("El nombre del producto es obligatorio.");
        }

        if (producto.getPrecio() == null) {
            System.out.println("❌ ERROR: Precio null");
            return ResponseEntity.badRequest().body("El precio es obligatorio.");
        }

        if (producto.getStock() == null) {
            System.out.println("❌ ERROR: Stock null");
            return ResponseEntity.badRequest().body("El stock es obligatorio.");
        }

        if (producto.getImagenUrl() == null || producto.getImagenUrl().isBlank()) {
            System.out.println("❌ ERROR: Imagen vacía");
            return ResponseEntity.badRequest().body("La imagen es obligatoria.");
        }

        if (producto.getDescripcionProducto() == null || producto.getDescripcionProducto().isBlank()) {
            System.out.println("❌ ERROR: Descripción vacía");
            return ResponseEntity.badRequest().body("La descripción es obligatoria.");
        }

        if (producto.getDescripcionLarga() == null || producto.getDescripcionLarga().isBlank()) {
            System.out.println("❌ ERROR: Descripción larga vacía");
            return ResponseEntity.badRequest().body("La descripción larga es obligatoria.");
        }

        try {
            // Si pasa todas las validaciones → guardar
            System.out.println("✅ Intentando guardar producto...");
            Producto guardado = productoService.save(producto);
            System.out.println("✅ Producto guardado exitosamente con ID: " + guardado.getId());
            return ResponseEntity.ok(guardado);
        } catch (Exception e) {
            System.out.println("❌ EXCEPCIÓN AL GUARDAR:");
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error al guardar: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Producto producto) {
        if (productoService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }

        producto.setId(id);
        Producto actualizado = productoService.save(producto);

        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (productoService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        productoService.delete(id);
        return ResponseEntity.ok("Producto eliminado");
    }

    @GetMapping("/buscar")
    public List<Producto> buscarPorNombre(@RequestParam String nombre) {
        return productoService.findByNombre(nombre);

    }

    @GetMapping("/categoria/{idCategoria}")
    public List<Producto> buscarPorCategoria(@PathVariable Long idCategoria) {
        return productoService.findByCategoria(idCategoria);
    }

}
