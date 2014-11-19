package DTO;

public class Implemento {
	private String id_implemento;
	private String nombre;
	private boolean estado;
	
	public Implemento(String id_implemento, String nombre, boolean estado) {
		this.id_implemento = id_implemento;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public Implemento() {
		
	}

	public String getId_implemento() {
		return id_implemento;
	}

	public void setId_implemento(String id_implemento) {
		this.id_implemento = id_implemento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
