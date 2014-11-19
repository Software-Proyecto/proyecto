package DTO;

public class Proveedor {
	private String id_proveedor;
	private String nombre;
	private String direccion;
	private String sitio_web;
	private String telefono;
	
	public Proveedor(String id_proveedor, String nombre, String direccion,String sitio_web, String telefono) {
		this.id_proveedor = id_proveedor;
		this.nombre = nombre;
		this.direccion = direccion;
		this.sitio_web = sitio_web;
		this.telefono = telefono;
	}

	public String getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(String id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSitio_web() {
		return sitio_web;
	}

	public void setSitio_web(String sitio_web) {
		this.sitio_web = sitio_web;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
