package com.example.demo.business;

import java.util.List;

import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Empleado;

public interface ServicioEmpleado {
	List <Empleado> listEmpleados() throws ServicioException;
}
