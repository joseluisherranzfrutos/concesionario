package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bussiness.ServicioVenta;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.dto.VentaDTO;
import com.example.demo.entities.Venta;

@RestController
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	ServicioVenta servicio;
	
	@GetMapping
	public List<Venta> list() throws ServicioException{
		
		return servicio.listVentas();
		
	}
	
	@PostMapping
	public Venta create(@RequestBody VentaDTO venta) throws ServicioException {
		
		return servicio.grabarVenta(venta);
	}
	
}
