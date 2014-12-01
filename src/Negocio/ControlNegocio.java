package Negocio;
import java.util.ArrayList;

import DAO.*;
import DTO.*;


public class ControlNegocio {

	public ControlNegocio(){
		
	}

	public boolean validarAdministrador(String codigo, String pass) throws Exception {
		AdministradorDAO a=new AdministradorDAO();
		 
		ArrayList<Administrador> listaAdm = a.ListaAdministradores();
		
		for(Administrador xx: listaAdm){
			if(codigo.equals(xx.getCodigo()) && pass.equals(xx.getClave())){
				return true;
			}
		}
		return false;
		
	}

	public boolean validarAsistente(String codigo, String pass) throws Exception {
		AsistenteDAO a=new AsistenteDAO();
		 
		ArrayList<Asistente> listaAsis = a.ListaAsistentes();
		
		for(Asistente xx: listaAsis){
			if(codigo.equals(xx.getCodigo()) && pass.equals(xx.getClave())){
				return true;
			}
		}
		return false;
	}
	
}
