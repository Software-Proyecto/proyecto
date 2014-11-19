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