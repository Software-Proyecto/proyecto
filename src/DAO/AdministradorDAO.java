package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.*;
import Util.*;

public class AdministradorDAO {

	public ArrayList<Administrador> ListaAdministradores()throws Exception{
		
		ResultSet rst;
		
		ConexionPostgres.conectar();
		
		rst = ConexionPostgres.ejecutarSQL("SELECT * "
				+ "							FROM Administrador") ;
		
		ArrayList<Administrador> myAdm = new ArrayList <Administrador>();
		
		
		while(rst.next()){
			
			Administrador adm= new Administrador();
			
			adm.setCodigo(rst.getString(1));
			adm.setNombre(rst.getString(2));
			adm.setApellido(rst.getString(3));
			adm.setClave(rst.getString(4));
			
			myAdm.add(adm);
			
		}
		
		
		ConexionPostgres.desconectar();
		return myAdm;
	}
}
