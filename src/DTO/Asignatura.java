package DTO;

public class Asignatura {
	private String codigo;
	private String nombre;
	private String plan_estudio;
	
	
	public Asignatura(String codigo, String nombre, String plan_estudio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.plan_estudio = plan_estudio;
	}
	
	public Asignatura() {
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
		return plan_estudio;
	}
	public void setApellidos(String plan_estudio) {
		this.plan_estudio = plan_estudio;
	}
	
	
	
}
