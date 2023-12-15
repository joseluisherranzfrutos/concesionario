//package com.example.demo.entities;
//
//import java.util.Date;
//
//import org.antlr.v4.runtime.misc.NotNull;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.format.annotation.DateTimeFormat.ISO;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.MapsId;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
//
//@Entity
//@Table(name="VENTA")
//public class Venta {
//	
//	
//
//	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(iso = ISO.DATE)
//	@Column(name="FECHA")
//	private Date fecha;
//	
//	
//	@Column(name="MONTO") 
//	private Double monto;
//	
////	@ManyToOne
////	@JoinColumn(name="IDCLIENTE")
////	private Integer idCliente;
////		
////	@ManyToOne
////	@JoinColumn(name="IDEMPLEADO")
////	private Integer idEmpleado;
////	
//	@Id
//	@OneToOne
//	@JoinColumn(name="IDCOCHE")
//	private String idCoche;
////	
//	@MapsId
//	@OneToOne
//	@JoinColumn(name="IDCLIENTE")
//	private Cliente cliente;
//	
//	@MapsId
//	@OneToOne
//	@JoinColumn(name="IDEMPLEADO")
//	private Empleado empleado;
//	
//	
//	
//    @MapsId
//    @OneToOne //(cascade = CascadeType.ALL)
//	@JoinColumn(name="IDCOCHE")
//	private Coche coche;
//	
//	
//		
//	public Venta() {
//		
//	}
//
//	public Date getFecha() {
//		return fecha;
//	}
//
//
//
//	public void setFecha(Date fecha) {
//		this.fecha = fecha;
//	}
//
//
//
//	public Double getMonto() {
//		return monto;
//	}
//
//
//
//	public void setMonto(Double monto) {
//		this.monto = monto;
//	}
//
//
//
//	public Cliente getCliente() {
//		return cliente;
//	}
//
//
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
//
//
//
//	public Empleado getEmpleado() {
//		return empleado;
//	}
//
//
//
//	public void setEmpleado(Empleado empleado) {
//		this.empleado = empleado;
//	}
//
//
//
//	public Coche getCoche() {
//		return coche;
//	}
//
//
//
//	public void setCoche(Coche coche) {
//		this.coche = coche;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Venta [fecha=" + fecha + ", monto=" + monto + ", cliente=" + cliente + ", empleado=" + empleado
//				+ ", coche=" + coche + "]";
//	}
//
//	
//}
