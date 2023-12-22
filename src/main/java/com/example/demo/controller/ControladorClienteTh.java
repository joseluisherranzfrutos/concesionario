package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bussiness.ServicioCliente;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Cliente;

@Controller
@RequestMapping(value={"/clientesTh"})
public class ControladorClienteTh {
	
	@Autowired
	ServicioCliente servicio;
	
	@GetMapping
	public String paginaClientes(Model model) throws Exception {
		List<Cliente> clientes = servicio.listClientes();
		
		model.addAttribute("clientes", clientes);	
		return "clientes";
	}
	
	@GetMapping("/crear")
	public String nuevoCliente(Model model) throws ServicioException {
		
		model.addAttribute("cliente", new Cliente());
		
		
		return "agregarNuevoCliente";
	}
	
	@PostMapping
	public String create(@ModelAttribute Cliente cliente,Model model) throws ServicioException {
		cliente = servicio.grabarCliente(cliente);
		model.addAttribute("cliente", cliente);
	
		return "redirect:/clientesTh";

		
	}
	
	@GetMapping("/modificar/{id}")
	public String paginaCliente(@PathVariable Integer id,Model model) throws Exception {
		Cliente cliente = servicio.conseguirCliente(id);
		
		model.addAttribute("cliente", cliente);	
		
		return "modificarCliente";
	}
	
}
