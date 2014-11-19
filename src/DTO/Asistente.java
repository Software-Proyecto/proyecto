package DTO;

public class Asistente {
	private String codigo;
	private String nombre;
	private String apellidos;
	
	
	public Asistente(String codigo, String nombre, String apellidos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Asistente() {
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
}
