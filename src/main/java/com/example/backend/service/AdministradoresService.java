package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.Administradores;
import com.example.backend.repository.AdministradoresRepository; 
 
@Service 
public class AdministradoresService { 
 
    @Autowired 
    private AdministradoresRepository administradoresRepository;
 
    public List<Administradores> findAll() { 
        return administradoresRepository.findAll(); 
    } 
 
    public Administradores findById(Long id) { 
        return administradoresRepository.findById(id).orElse(null); 
    } 
 
    public Administradores save(Administradores administradores) {  
        return administradoresRepository.save(administradores); 
    } 
 
    public void delete(Long id) { 
        administradoresRepository.deleteById(id); 
    } 
}

