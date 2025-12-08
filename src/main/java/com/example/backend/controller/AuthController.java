package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.config.JwtUtil;
import com.example.backend.dto.LoginRequest;
import com.example.backend.dto.LoginResponse;
import com.example.backend.dto.RegistroRequest;
import com.example.backend.model.Usuario;
import com.example.backend.repository.UsuarioRepository;
import com.example.backend.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthController {

    private final UsuarioService usuarioService;
    private final UsuarioRepository usuarioRepository;
    private final JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // LOGIN
    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        Usuario usuario = usuarioRepository.findByEmail(request.getEmail());

        if (usuario == null) {
            throw new RuntimeException("Credenciales inválidas");
        }

        // comparar contraseña ingresada vs. contraseña encriptada en DB
        if (!passwordEncoder.matches(request.getClave(), usuario.getClave())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        // Generar JWT
        String token = jwtUtil.generateToken(
            usuario.getId(),
            usuario.getEmail(),
            usuario.getRol()
    );

        return new LoginResponse(
            usuario.getId(),
            usuario.getNombre(),
            usuario.getEmail(),
            usuario.getRol(), 
            token
        );
    }

    // REGISTRO
    @PostMapping("/registro")
    public Usuario registrar(@RequestBody RegistroRequest req) {

        Usuario u = new Usuario(
                req.getNombre(),
                req.getEmail(),
                req.getEdad(),
                passwordEncoder.encode(req.getClave()),   // clave encriptada
                req.getRegion(),
                req.getComuna(),
                "Activo",
                "cliente",
                "base",
                java.time.LocalDate.now().toString()
        );

        return usuarioService.registrar(u);
    }
}
