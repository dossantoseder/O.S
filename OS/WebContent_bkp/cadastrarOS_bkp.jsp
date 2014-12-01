<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ordens de Serviço</title>
<link rel="stylesheet" type="text/css" href="view.css" media="all">
<script type="text/javascript" src="view.js"></script>






<style>
*{
margin:0;padding:0;
}
html,body{
overflow:hidden;
}

</style>




</head>
<body >

	
	<img id="top" src="top.png" alt="">
	<div id="form_container">
	
		<h1><a>Ordens de Serviço</a></h1>
		<form id="form_931421" class="appnitro"  method="post" action="">
					<div class="form_description">
			<h2>Ordem de Serviço</h2>
			<p>Nova Odem de Serviço</p>
		</div>						
			<ul >
			
					<li id="li_2" >
		<label class="description" for="element_2">Setor </label>
		<div>
		<select class="element select medium" id="element_2" name="element_2"> 
			<option value="" selected="selected"></option>
<option value="1" >First option</option>
<option value="2" >Second option</option>
<option value="3" >Third option</option>

		</select>
		</div> 
		</li>		<li id="li_3" >
		<label class="description" for="element_3">Solicitante </label>
		<div>
		<select class="element select medium" id="element_3" name="element_3"> 
			<option value="" selected="selected"></option>
<option value="1" >First option</option>
<option value="2" >Second option</option>
<option value="3" >Third option</option>

		</select>
		</div> 
		</li>		<li id="li_4" >
		<label class="description" for="element_4">Tipo de Serviço </label>
		<div>
		<select class="element select medium" id="element_4" name="element_4"> 
			<option value="" selected="selected"></option>
<option value="1" >First option</option>
<option value="2" >Second option</option>
<option value="3" >Third option</option>

		</select>
		</div> 
		</li>		<li id="li_1" >
		<label class="description" for="element_1">Descrição </label>
		<div>
			<textarea id="element_1" name="element_1" class="element textarea medium"></textarea> 
		</div> 
		</li>
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="931421" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Cadastrar" />
                <input id="saveFormCancela" class="button_text" type="submit" name="submit" value="Cancela" />
		</li>
			</ul>
		</form>	
		
	</div>
	<img id="bottom" src="bottom.png" alt="">
	

	</body>
	

</html>