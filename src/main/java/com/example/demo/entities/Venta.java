package com.example.demo.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="VENTA")
public class Venta {
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="FECHA")
	private Date fecha;
	
	@JoinColumn(name="IDCLIENTE")
	private Integer idCliente;
	
	@JoinColumn(name="IDEMPLEADO")
	private Integer idEmpleado;
	@Id
	@JoinColumn(name="IDCOCHE")
	private String idCoche;
	
	@Column(name="MONTO") 
	private Double monto;
	
	public Venta() {
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(String idCoche) {
		this.idCoche = idCoche;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Venta [fecha=" + fecha + ", idCliente=" + idCliente + ", idEmpleado=" + idEmpleado + ", idCoche="
				+ idCoche + ", monto=" + monto + "]";
	}
	
	
	
}
