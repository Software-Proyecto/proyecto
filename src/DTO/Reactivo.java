package DTO;

import java.sql.Date;

public class Reactivo {
	private int cantidad;
	private Date fecha_entrada;
	private Date fecha_vencimiento;
	private String id_reactivo;
	private String nombre;
	
	public Reactivo(int cantidad, Date fecha_entrada, Date fecha_vencimiento,String id_reactivo, String nombre) {
		this.cantidad = cantidad;
		this.fecha_entrada = fecha_entrada;
		this.fecha_vencimiento = fecha_vencimiento;
		this.id_reactivo = id_reactivo;
		this.nombre = nombre;
	}
	
	public Reactivo() {
		
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public String getId_reactivo() {
		return id_reactivo;
	}

	public void setId_reactivo(String id_reactivo) {
		this.id_reactivo = id_reactivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
