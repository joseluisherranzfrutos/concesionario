package com.example.demo.bussiness;

import java.util.List;

import com.example.demo.common.exceptions.ServicioException;
import com.example.demo.entities.Departamento;

public interface ServicioCoche {

	List<Coche> listCoche() throws ServicioException;

}