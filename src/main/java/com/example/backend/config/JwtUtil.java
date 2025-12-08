package com.example.backend.config;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    @Value("${app.jwt.secret}")
    private String secret;

    @Value("${app.jwt.expiration}")
    private long expiration;

    // GENERAR TOKEN
    public String generateToken(Long id, String email, String rol) {

        byte[] keyBytes = secret.getBytes();

        return Jwts.builder()
                .setSubject(email)
                .claim("id", id)
                .claim("rol", rol)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(Keys.hmacShaKeyFor(keyBytes), SignatureAlgorithm.HS256)
                .compact();
    }

    // VALIDAR TOKEN-> devuelve claims o null
    public Claims validateToken(String token) {
        try {
            return Jwts.parserBuilder()
                    .setSigningKey(secret.getBytes())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            return null;
        }
    }

    // Para la autenticación basada en rol
    public List<SimpleGrantedAuthority> getAuthoritiesFromRole(String rol) {
        return List.of(new SimpleGrantedAuthority("ROLE_" + rol.toUpperCase()));
    }
}
