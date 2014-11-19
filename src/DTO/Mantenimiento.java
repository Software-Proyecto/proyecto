package DTO;

import java.sql.Date;

public class Mantenimiento {
	private Date fecha;
	private String id_equipo;
	private String caracteristicas;
	private String tipo;
	
	
	public Mantenimiento(Date fecha, String id_equipo, String caracteristicas,	String tipo) {
		this.fecha = fecha;
		this.id_equipo = id_equipo;
		this.caracteristicas = caracteristicas;
		this.tipo = tipo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(String id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
