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
// CON LOS MAPPINGS Y TODO ESO SON LAS URL QUE VAN A USARSE EN EL 
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
    public Producto create(@RequestBody Producto producto) {
        return productoService.save(producto);
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
