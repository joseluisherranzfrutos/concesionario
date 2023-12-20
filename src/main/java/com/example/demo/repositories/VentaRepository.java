package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Coche;
import com.example.demo.entities.Venta;

public interface VentaRepository extends JpaRepository<Venta, Integer>{

	//Filtro coches por empleado
	@Query("SELECT c FROM Venta v INNER JOIN Coche c ON c.matricula=v.coche.matricula "
			+ "INNER JOIN Empleado e ON e.id=v.empleado.id WHERE e.nombre=:nombre")
	List<Coche> listaCochesEmpleado(String nombre);

}
