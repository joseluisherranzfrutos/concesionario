package com.example.demo.bussiness;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.exceptions.CodeError;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Departamento;
import com.example.demo.respositories.DepartamentoRepository;

@Service
public class ServicioCocheImpl implements ServicioCoche {
	
	Logger log = LoggerFactory.getLogger(ServicioCocheImpl.class);
	
	@Autowired
	CocheRepository repository;
	
	
	@Override
	public List<Coche> listDepartamentos() throws ServicioException{
		log.info("[listDepartamentos]");
		
		List<Departamento> departamentos;
		
		try {
			departamentos= repository.findAll();
			
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		return departamentos;
		
	}
	
	
	

}
