package DTO;

public class Asistente {
	private String codigo;
	private String nombre;
	private String apellidos;
	private String clave;
	
	public Asistente(String codigo, String nombre, String apellidos,String clave) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.clave= clave;
	}
	
	public Asistente() {
	}
	
	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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
