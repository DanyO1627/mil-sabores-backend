
package com.example.backend;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestBCrypt {
    public static void main(String[] args) {
        String hash = new BCryptPasswordEncoder().encode("empleado123");
        System.out.println(hash);
    }
}

// ESTO ES PARA ENCRIPTAR DESDE ACÁ "MANUALMENTE" Y PONERLO EN LA BASE DE DATOS SI QUEREMOS