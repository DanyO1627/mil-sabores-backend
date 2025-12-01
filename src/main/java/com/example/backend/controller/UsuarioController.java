package com.example.backend.controller;



import com.example.backend.model.Usuario;
import com.example.backend.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    // Listar todos los usuarios (para usuario.html)
    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    // Registrar usuario (para registrarse.html)
    @PostMapping
    public Usuario registrar(@RequestBody Usuario u) {
        return service.registrar(u);
    }

    // Login (para iniciarsesion2.html)
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario u) {
        return service.login(u.getEmail(), u.getClave());
    }

    // Actualizar usuario
    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario datos) {
        return service.actualizar(id, datos);
    }

    // Eliminar usuario
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
