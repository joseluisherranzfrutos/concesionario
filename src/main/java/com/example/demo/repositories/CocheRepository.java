package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Coche;
public interface CocheRepository extends JpaRepository<Coche, String>{
	
	List<Coche> findByEstadoTrue();
		
	List<Coche> findByEstadoFalse();

	List<Coche> findByMarca(String marca);
	
	List<Coche> findByModelo(String marca);
	
	List<Coche> findByMarcaAndModelo(String marca, String modelo);

	List<Coche> findByMatricula(String matricula);
	
}
