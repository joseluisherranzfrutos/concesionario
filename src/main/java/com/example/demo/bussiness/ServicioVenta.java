package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Venta;

public interface ServicioVenta {
	List<Venta> listVentas() throws ServicioException;

}
