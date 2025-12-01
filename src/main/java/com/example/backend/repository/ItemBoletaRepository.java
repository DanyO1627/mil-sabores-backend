package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.ItemBoleta;

public interface ItemBoletaRepository extends JpaRepository<ItemBoleta, Long> {
}
