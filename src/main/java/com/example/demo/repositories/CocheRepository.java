package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Coche;
public interface CocheRepository extends JpaRepository<Coche, String>{
	//@Query(value="SELECT c FROM Coche c WHERE c.estado LIKE true")
	@Query
	List<Coche> findByEstadoTrue();
	
	@Query
	List<Coche> findByEstadoFalse();

}
