package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bussiness.ServicioCoche;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Coche;


@RestController
@RequestMapping("/coche")
public class CocheController {
	
	@Autowired
	ServicioCoche servicio;
	
	@GetMapping
	public List<Coche> list() throws ServicioException{
		
		return servicio.listCoches();
	}
	
	@GetMapping(value="/vendidos")
	public List<Coche> listVendidos() throws ServicioException{
		return servicio.listCochesVendidos();
	}
	
	@GetMapping(value="/noVendidos")
	public List<Coche> listNoVendidos() throws ServicioException{
		return servicio.listCochesNoVendidos();
	}
	
}
