<%@page import = "Facade.Facade" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
Facade f=new Facade();

String  codigo= request.getParameter("codigo");
String pass = request.getParameter("password");
String tu = request.getParameter("tu");

boolean r;
if (tu.equals("Administracion")){
	r= f.validarAdministrador(codigo,pass);
	if(r){
		
	}else{
		%>Usuario o password incorrectas<%		
	}
	
}else{
	r= f.validarAsistente(codigo,pass);
	if(r){
		
	}else{
		%>Usuario o password incorrectas<%	
	}
}
%>