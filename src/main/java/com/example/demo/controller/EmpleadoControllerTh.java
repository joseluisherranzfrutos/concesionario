package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bussiness.ServicioEmpleado;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Coche;
import com.example.demo.entities.Empleado;

@Controller
@RequestMapping(value={"/","/empleadosTh"})

public class EmpleadoControllerTh {
	
	@Autowired
	ServicioEmpleado servicio;
	
	
	@GetMapping
	public String paginaEmpleados(Model model) throws Exception {
		List<Empleado> empleados = servicio.listEmpleados();
		
		model.addAttribute("empleados", empleados);	
		return "empleados";
		
	}
	
	@PostMapping
	public String grabarEmpleado(@ModelAttribute Empleado empleado, Model model) throws Exception {
	    empleado = servicio.grabarEmpleado(empleado);

	   
	    List<Empleado> empleados = servicio.listEmpleados();

	    model.addAttribute("empleados", empleados);
	    return "empleados";
	}

	}
	
	
