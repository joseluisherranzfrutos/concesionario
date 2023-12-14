package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Coche;

public interface CocheRepository extends JpaRepository<Coche, String>{

}
