package com.example.demo.bussiness;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.exceptions.CodeError;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Coche;
import com.example.demo.repositories.CocheRepository;

@Service
public class ServicioCocheImpl implements ServicioCoche {
	
	Logger log = LoggerFactory.getLogger(ServicioCocheImpl.class);
	
	@Autowired
	CocheRepository repository;
	
	@Override
	public List<Coche> listCoches() throws ServicioException{
		log.info("[listCoches]");
		
		List<Coche> coches;
		
		try {
			coches= repository.findAll();
			
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		return coches;
		
	}

	@Override
	public List<Coche> listCochesVendidos() throws ServicioException {
		log.info("[listCochesVendidos]");
		
		List<Coche> coches;
		
		try {
			coches= repository.findByEstadoTrue();
			
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		return coches;
	}
	
	@Override
	public List<Coche> listCochesNoVendidos() throws ServicioException {
		log.info("[listCochesNoVendidos]");
		
		List<Coche> coches;
		
		try {
			coches= repository.findByEstadoFalse();
			
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		return coches;
	}

	@Override
	public Coche grabarCoche(Coche coche) throws ServicioException {
		log.info("[grabarCoche]");
		log.info("[coche: "+coche.toString()+"]");
		
		try{
			coche =repository.save(coche);
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		return coche;
		
	}

	@Override
	public List<Coche> findByMarca(String marca) throws ServicioException {
		log.info("[findByMarca]");
		
		List<Coche> coches;
		
		try {
			coches= repository.findByMarca(marca);
			
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		return coches;
	}

	@Override
	public List<Coche> findByMarcaModelo(String marca,String modelo) throws ServicioException {
		log.info("[findByMarcaModelo]");
		
		List<Coche> coches;
		try {
			if (marca==null) {
				coches = repository.findByModelo(modelo);
			}else if (modelo==null) {
				coches = repository.findByMarca(marca);
			}else {
				coches= repository.findByMarcaAndModelo(marca,modelo);
			}
			
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		return coches;
	}

	@Override
	public void eliminarCoche(String matricula) throws ServicioException{
		log.info("[eliminarCoche]");
		log.debug("[matricula: "+matricula+"]");
		
			try {
			repository.deleteById(matricula);
			
		}catch(Exception e) {
			log.error("Exception", e);
			throw new ServicioException(CodeError.ERROR_GENERAL,e);
		}
		
	}
}
