package Facade;
import java.util.ArrayList;

import Negocio.ControlNegocio;
import DTO.*;

public class Facade {
	
	ControlNegocio cn;
	
	public Facade(){
			this.cn=new ControlNegocio();
	}
	
	public boolean validarAdministrador(String codigo,String pass) throws Exception{
		return cn.validarAdministrador(codigo, pass);
	}
	public boolean validarAsistente(String codigo,String pass) throws Exception{
		return cn.validarAsistente(codigo, pass);
	}
	
	//metodos que tienen todos los registros del sistema
	public String registarImplemento(){
		return null;
	}
	public String registrarReactivo(){
		return null;
	}
	public String registrarProveedor(){
		return null;
	}
	public String registrarMantenimiento(){
		return null;
	}
	public String registrarEquipo(){
		return null;
	}
	public String registrarAdministrador(){
		return null;
	}
	public String registrarAsistente(){
		return null;
	}
	public String registrarDocente(){
		return null;
	}
	public String registraAsignatura(){
		return null;
	}
	public String registrarPractica(){
		return null;
	}
	public String registrarPrestamo(){
		return null;
	}
	
	//metodos que tienen todas las consultas del sistema
	
	public ArrayList<Asistente> ListaAsistentes(){
		return null;
	}
	public ArrayList<Docente> ListaDocentes(){
		return null;
	}
	public ArrayList<Asignatura> ListaAsignaturas(){
		return null;
	}
	public ArrayList<Equipo> ListaEquipos(){
		return null;
	}
	public ArrayList<Proveedor> ListaProveedores(){
		return null;
	}
	
	public ArrayList<Practica> ListaPracticas(){
		return null;
	}
	
	public ArrayList<Reactivo> ListaReactivos(){
		return null;
	}
	
	public ArrayList<Implemento> ListaImplemento(){
		return null;
	}
	/*
	public ArrayList<Integer> datosGraficaEquipos(){
		
	} 
	*/
}
