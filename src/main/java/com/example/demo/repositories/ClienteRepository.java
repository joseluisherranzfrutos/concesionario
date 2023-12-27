package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	List<Cliente> findByEstadoAltaTrue();
	
	List<Cliente> findByEstadoAltaFalse();
	
	List<Cliente> findByNif(String nif);
	
	List<Cliente> findByNombre(String nombre);
	
	List<Cliente> findByNifAndNombre(String nif, String nombre);
	
}
