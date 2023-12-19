package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Coche;
public interface CocheRepository extends JpaRepository<Coche, String>{
	
	List<Coche> findByEstadoTrue();
		
	List<Coche> findByEstadoFalse();

	List<Coche> findByMarca(String marca);
	
	List<Coche> findByModelo(String marca);
	
	List<Coche> findByMarcaAndModelo(String marca, String modelo);

	List<Coche> findByMatricula(String matricula);
	
//	@Query(value="UPDATE coche SET estado=true WHERE matricula = %:matricula%")
//	void setEstadoTrue(String matricula);
	
//	@Query(value="SELECT c FROM Coche c WHERE c.marca=%:marca% AND c.modelo=%:modelo%")
//	List<Coche> findByMarcaAndModelo(String marca,String modelo);
	
	//Filtro coches por empleado
//	@Query(value="SELECT c FROM Coche c, Venta v, Empleado e WHERE c.matricula=v.venta.idCoche AND"
//		+ "v.venta.idEmpleado=e.empleado.id AND e.empleado.nombre=:nombre")
//	List<Coche> listaCochesEmpleado(String nombre);
}
