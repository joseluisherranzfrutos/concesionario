package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bussiness.ServicioCoche;
import com.example.demo.entities.Coche;

@Controller
@RequestMapping(value={"/","/cochesTh"})
public class ControladorCocheTh {
	
	@Autowired
	ServicioCoche servicio;
	
	@GetMapping
	public String paginaCoches(Model model) throws Exception {
		List<Coche> coches = servicio.listCoches();
		
		model.addAttribute("coches", coches);	
		return "coches1";
	}

}
