<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE script PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">

google.load('visualization','1.0',{'packages':['corechart']});
google.setOnLoadCallback(dibujar);
function dibujar(){
	var data = new google.visualization.DataTable();
	data.addColumn('string','ciudad');
	data.addColumn('number', 'visitas');
	data.addRows(
			[
				['primero',15],
				['segundo',15],
				['tercero',15],
			]
			);
	var opciones= {'title':'Prueba de graficas',
					'width':500,
					'heigth':300};
			
	var grafica = new google.visualization.PieChart(document.getElementById('Espacio_grafico')); 
	grafica.draw(data,opciones);	
} 
</script>    
<div id="Espacio_grafico" >
<h1>Esto es para ver si sale algo</h1>

</div>
</html>