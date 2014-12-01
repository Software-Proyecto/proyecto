package DTO;

public class Administrador {
	private String codigo;
	private String nombre;
	private String apellido;
	private String clave;
	
	
	public Administrador(String codigo, String nombre, String apellido,String clave) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
	}


	public Administrador(){
		
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}


}