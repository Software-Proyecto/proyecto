package DTO;

public class Docente {
	private String id_docente;
	private String apellidos;
	private String nombre;
	private String tipo_docente;
	
	public void Docente(){
		
	}
	
	

	public Docente(String id_docente, String apellidos, String nombre,String tipo_docente) {
		this.id_docente = id_docente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.tipo_docente = tipo_docente;
	}



	public String getId_docente() {
		return id_docente;
	}

	public void setId_docente(String id_docente) {
		this.id_docente = id_docente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo_docente() {
		return tipo_docente;
	}

	public void setTipo_docente(String tipo_docente) {
		this.tipo_docente = tipo_docente;
	}
	
}
