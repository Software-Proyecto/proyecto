package DTO;

public class Practica {

	private Equipo myEquipo;
	private String nombre;
	private int duracion;
	private String caracteristicas;
	
	
	public Practica(Equipo myEquipo, String nombre, int duracion,	String caracteristicas) {
		this.myEquipo = myEquipo;
		this.nombre = nombre;
		this.duracion = duracion;
		this.caracteristicas = caracteristicas;
	}
	public Practica(){
		
	}
	
	
	public Equipo getMyEquipo() {
		return myEquipo;
	}
	public void setMyEquipo(Equipo myEquipo) {
		this.myEquipo = myEquipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
}
