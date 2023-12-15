package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Coche;

public interface ServicioCliente {

	List<Cliente> listClientes() throws ServicioException;

	

}