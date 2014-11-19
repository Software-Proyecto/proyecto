package DTO;

import java.sql.Date;

public class Prestamo {
	private Docente mydocente;
	private Asistente myAsistente;
	private Asignatura myAsignatura;
	private String turno;
	private Date fecha;
	private Practica myPractica;
	private String observaciones;
	
	
	public Prestamo(Docente mydocente, Asistente myAsistente, Asignatura myAsignatura, String turno, Date fecha, Practica myPractica, String observaciones) {
		this.mydocente = mydocente;
		this.myAsistente = myAsistente;
		this.myAsignatura = myAsignatura;
		this.turno = turno;
		this.fecha = fecha;
		this.myPractica = myPractica;
		this.observaciones = observaciones;
	}
	
	public Prestamo() {
		
	}
	
	public Docente getMydocente() {
		return mydocente;
	}
	public void setMydocente(Docente mydocente) {
		this.mydocente = mydocente;
	}
	public Asistente getMyAsistente() {
		return myAsistente;
	}
	public void setMyAsistente(Asistente myAsistente) {
		this.myAsistente = myAsistente;
	}
	public Asignatura getMyAsignatura() {
		return myAsignatura;
	}
	public void setMyAsignatura(Asignatura myAsignatura) {
		this.myAsignatura = myAsignatura;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Practica getMyPractica() {
		return myPractica;
	}
	public void setMyPractica(Practica myPractica) {
		this.myPractica = myPractica;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
}
