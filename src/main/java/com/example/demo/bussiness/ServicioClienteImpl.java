package com.example.demo.bussiness;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.exceptions.CodeError;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Cliente;
import com.example.demo.repositories.ClienteRepository;

@Service
public class ServicioClienteImpl implements ServicioCliente {
	
	Logger log = LoggerFactory.getLogger(ServicioClienteImpl.class);
	
	@Autowired
	ClienteRepository repository;
	
	
	@Override
	public List<Cliente> listClientes() throws ServicioException{
		log.info("[listClientes]");
		
		List<Cliente> clientes;
		
		try {
			clientes= repository.findAll();
			
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		return clientes;
		
	}




	

}
