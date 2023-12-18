package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bussiness.ServicioCoche;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Coche;

@RestController
@RequestMapping("/coche")
public class CocheController {

    @Autowired
    ServicioCoche servicio;

    @GetMapping
    public List<Coche> list() throws ServicioException {
        return servicio.listCoches();
    }

    @GetMapping(value="/vendidos")
    public List<Coche> listarCochesVendidos() throws ServicioException {
        return servicio.listCochesVendidos();
    }

    @GetMapping(value="/noVendidos")
    public List<Coche> listarCochesNoVendidos() throws ServicioException {
        return servicio.listCochesNoVendidos();
    }

    @GetMapping(value="/buscarMarca")
    public List<Coche> findByMarca(@PathVariable(value = "marca") String marca) throws ServicioException {
        return servicio.findByMarca(marca);
    }

    @GetMapping(value="/buscarModelo")
    public List<Coche> findByModelo(@Param(value = "modelo") String modelo) throws ServicioException {
        return servicio.findByModelo(modelo);
    }

    @PostMapping
    public Coche create(@RequestBody Coche coche) throws ServicioException {
        return servicio.grabarCoche(coche);
    }
}
