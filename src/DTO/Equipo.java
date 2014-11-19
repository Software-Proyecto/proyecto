package DTO;

public class Equipo {
	private String id_inventario;
	private String id_serie;
	private String turno_equipo;
	private String nombre;
	private String marca;
	private String modelo;
	private String fabricante;
	private long costo;
	private long costo_reposicion;
	private String voltaje;
	private String indicaciones_fabricante;
	private String calibracion;
	private String ubicacion;
	private String garantia;
	
	public Equipo(String id_inventario, String id_serie, String turno_equipo,
			String nombre, String marca, String modelo, String fabricante,
			long costo, long costo_reposicion, String voltaje,
			String indicaciones_fabricante, String calibracion,
			String ubicacion, String garantia) {
		
		this.id_inventario = id_inventario;
		this.id_serie = id_serie;
		this.turno_equipo = turno_equipo;
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.costo = costo;
		this.costo_reposicion = costo_reposicion;
		this.voltaje = voltaje;
		this.indicaciones_fabricante = indicaciones_fabricante;
		this.calibracion = calibracion;
		this.ubicacion = ubicacion;
		this.garantia = garantia;
	}
	
	public Equipo() {
		
	}

	public String getId_inventario() {
		return id_inventario;
	}

	public void setId_inventario(String id_inventario) {
		this.id_inventario = id_inventario;
	}

	public String getId_serie() {
		return id_serie;
	}

	public void setId_serie(String id_serie) {
		this.id_serie = id_serie;
	}

	public String getTurno_equipo() {
		return turno_equipo;
	}

	public void setTurno_equipo(String turno_equipo) {
		this.turno_equipo = turno_equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public long getCosto() {
		return costo;
	}

	public void setCosto(long costo) {
		this.costo = costo;
	}

	public long getCosto_reposicion() {
		return costo_reposicion;
	}

	public void setCosto_reposicion(long costo_reposicion) {
		this.costo_reposicion = costo_reposicion;
	}

	public String getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}

	public String getIndicaciones_fabricante() {
		return indicaciones_fabricante;
	}

	public void setIndicaciones_fabricante(String indicaciones_fabricante) {
		this.indicaciones_fabricante = indicaciones_fabricante;
	}

	public String getCalibracion() {
		return calibracion;
	}

	public void setCalibracion(String calibracion) {
		this.calibracion = calibracion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	
	
	
}
