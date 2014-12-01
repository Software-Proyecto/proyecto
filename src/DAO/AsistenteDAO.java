package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

import Util.ConexionPostgres;
import DTO.*;


public class AsistenteDAO {

	public String registrarAsistente(){
		return null;
	}
	
	public ArrayList<Asistente> ListaAsistentes() throws Exception{
		
		ResultSet rst;
		
		ConexionPostgres.conectar();
		
		rst = ConexionPostgres.ejecutarSQL("SELECT * "
				                         + " FROM Asistente") ;
		
		ArrayList<Asistente> myAsis = new ArrayList <Asistente>();
		
		
		while(rst.next()){
			
			Asistente asi= new Asistente();
			
			asi.setCodigo(rst.getString(1));
			asi.setNombre(rst.getString(2));
			asi.setApellidos(rst.getString(3));
			asi.setClave(rst.getString(4));
			
			myAsis.add(asi);
			
		}
		
		
		ConexionPostgres.desconectar();
		return myAsis;
	}
}
