package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.dto.VentaDTO;
import com.example.demo.entities.Venta;

public interface ServicioVenta {
	
	List<Venta> listVentas() throws ServicioException;

	Venta grabarVenta(VentaDTO ventaDTO) throws ServicioException;

	Double beneficios() throws ServicioException;

}
