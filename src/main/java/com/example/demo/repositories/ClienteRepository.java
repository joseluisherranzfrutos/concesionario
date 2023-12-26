package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	List<Cliente> findByEstadoAltaTrue();
	List<Cliente> findByEstadoAltaFalse();
	
//  Busqueda por nombre o dni	
//	@Query(value="SELECT c FROM Cliente c WHERE c.nombre like %:clave% or c.nif like %:clave% ")
//	List<Cliente> buscarCliente (String clave);
	
	List<Cliente> findByNif(String nif);
	List<Cliente> findByNombre(String nombre);
	List<Cliente> findByNifAndNombre(String nif, String nombre);
	
}
