package com.example.demo.bussiness;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.common.exceptions.CodeError;
import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Venta;
import com.example.demo.repositories.VentaRepository;

@Service
public class ServicioVentaImpl implements ServicioVenta{
	
	Logger log = LoggerFactory.getLogger(ServicioEmpleadoImpl.class);
		
		@Autowired
		VentaRepository repository;
		
		@Override
		public List<Venta> listVentas() throws ServicioException{
			log.info("[listVentas]");
			
			List<Venta> ventas;
			try {
				ventas= repository.findAll();
				
			}catch(Exception e) {
				log.error("Exception", e);
				throw new ServicioException(CodeError.ERROR_GENERAL,e);
			}
			return ventas;
			
		}

}
