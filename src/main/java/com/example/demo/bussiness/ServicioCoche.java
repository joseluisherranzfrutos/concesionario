package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Coche;

public interface ServicioCoche {

	List<Coche> listCoches() throws ServicioException;

	List<Coche> listCochesVendidos() throws ServicioException;

	List<Coche> listCochesNoVendidos() throws ServicioException;

}