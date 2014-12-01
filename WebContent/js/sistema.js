var estado = false;
var barra = document.getElementById("lateralIzq");
var espacio = document.getElementById("espacio");
function cambioEstado () {
	if(estado){
		barra.style.width = "5rem";
		espacio.style.width = "93%";
	}else{
		espacio.style.width = "80%";
		barra.style.width = "20%";
	}
	estado=!estado;
}
function cambioEstadoIn () {
	if(!estado){
		espacio.style.width = "80%";
		barra.style.width = "20%";
	}
}
function cambioEstadoOut () {
	if(!estado){
		barra.style.width = "5rem";
		espacio.style.width = "93%";
	}
}
barra.addEventListener("click", cambioEstado);
barra.addEventListener("mouseenter", cambioEstadoIn);
barra.addEventListener("mouseleave", cambioEstadoOut);


function crearAlerta () {

	var content = "";
	if(arguments.length >= 2){

		content = "<h3>"+arguments[0]+"</h3><p>"+arguments[1]+"</p>";
	}else{
		content= "<p>"+arguments[0]+"</p>";
	}
	var div = document.createElement("div");
	var claseDiv = "alerta ";
	if(arguments.length==3){
		if(arguments[2]=="blanco"){
			claseDiv += "alertaBlanca";
		}else if(arguments[2]=="rojo"){
			claseDiv += "alertaRoja";
		}else{
			claseDiv += "alertaVerde";
		}
	}else{
		claseDiv += "alertaRoja";
	}
	div.setAttribute("class", claseDiv);
	div.innerHTML = content;
	document.body.appendChild(div);
	setTimeout(function() {
		div.style.opacity = "0";
		console.log("si");
	}, arguments[3] || 10000);
	setTimeout(function() {
		document.body.removeChild(div);
		console.log("aja");
	}, arguments[3]+1000 ||  11000);
}
function abrirEspacio (espacio) {
	var vector = document.getElementsByClassName("campoMenu");
	for(i=0;i<vector.length;i++){
		vector[i].style.display= "none";
		vector[i].style.opacity = "0";
	}
	var abrir = document.getElementById(espacio);
	abrir.style.display="block";
	setTimeout(function(){
		abrir.style.opacity= "1";
	}, 10);
}




//metodos agregados para la programacion...





/* Crea el objeto AJAX. Esta funcion es generica para cualquier utilidad de este tipo, por
	lo que se puede copiar tal como esta aqui */
function nuevoAjax()
{ 
	var xmlhttp=false;
	try	{
		// Creacion del objeto AJAX para navegadores no IE Ejemplo:Mozilla, Safari 
		xmlhttp=new ActiveXObject("Msxml2.XMLHTTP");
	}catch(e){
		try	{
			// Creacion del objet AJAX para IE
			xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		}catch(E){
			if (!xmlhttp && typeof XMLHttpRequest!='undefined') xmlhttp=new XMLHttpRequest();
		}
	}
	return xmlhttp; 
}


/**
 * este metodo recolecta los datos y envia los mismos al jps encargado de validar los datos
 */
function ValidarSesionJS(){

	var codigo = frmIndex.usuario.value;
	var password = frmIndex.password.value;
	var tu = document.getElementById("tipoUsuario").value;
	
	
	alert(codigo+password+tu);
	validarSesionAjax(codigo, password,tu, "divError");
}

function validarSesionAjax(codigo, password,tu, campo){
	
	aleatorio=Math.random(); 
  	ajax = nuevoAjax();   
  	
	parametros = "codigo="+codigo+"&password="+password+"&tu="+tu+"&aleatorio="+aleatorio;  
	url = "validarSesion.jsp";  
	ajax.open("POST",url,true);
	ajax.setRequestHeader('Content-Type','application/x-www-form-urlencoded');   
	ajax.send(parametros);
	
	ajax.onreadystatechange=function()
	{
	  if (ajax.readyState==4)
	  {
	    if (ajax.status == 200)
	    {          	       	 
	       	 var rta= ajax.responseText;	       	         
	         if (rta.indexOf("Ok")<0) { 
	         	document.getElementById(campo).innerHTML = ajax.responseText;
	         }
	         else {	   
	        	
				frmIngreso.submit();
				
			 }	             
	    }
	    else
	    {    
	         var rta= ajax.responseText;         
	         if (rta.indexOf("Ok")<0) { 
	         	document.getElementById(campo).innerHTML = ajax.responseText;
	         }
	         else {	        		         	
				frmIngreso.submit();
			 }
	    }
	  } 
	  else
	  {
	    document.getElementById(campo).value = "Verificando Usuario...";
	  }
	}
}