<%-- 
    Document   : teste
    Created on : 24/09/2014, 12:54:16
    Author     : leandreson
--%>

<%@ page language="java" import="modelo.*" import="modelo.persiste.*" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>CADASTRAR SETOR</title>
        <link rel="stylesheet" type="text/css" href="view.css" media="all">
       <link href="estilo.css" type="text/css" rel="stylesheet" />
       <link href="listarOS.css" type="text/css" rel="stylesheet" />
    </head>
    
  
    <style>
    	body{
	    	background-image: url("imagens/branco.png");
    		margin: 0;
    		padding: 0;
    	}
    </style>
    <body>
    <%@ include file = "cabecalho_administrador.jsp" %>       
        
     

        
    <div id="main">
       
           <div id="bar2">    
            <div id="divbar2"><h2>Novo Setor</h2></div>  
           </div>


        
  <br><br><br><br>     
  <br><br><br><br>      
        
	<form id="form2"  action="Servlet.Controlador" method="post">  
  	
		<div class="itens" >
	
		<!--================================-->	
				<strong>
					<label class="itens">
						Nome: 
					</label>	
				</strong> 
			
			 	 <input type="text" name="nome_setor"  class="itens_valor" id="e1" style="width: 440px">
			 	 <br><br>

		<div id="dbotoes">
			<div id="dcadastrar">		
			  <input type="hidden" name="controlador" value="SetorCadastrarCommand"/>
	          <input id="btcadastrar" type="image" name="botao" src="imagens/btcadastrar.png"> 
	        </div>
	        
	        <div id="dcancelar">  
	          <input type="hidden" name="controlador" value="SetorCadastrarCommand"/>
	          <input id="btcancelar" type="image" name="botao" src="imagens/btcancelar.png">
	        </div>	          
		</div>
		
</form>



<br>
<br><br><br><br><br><br><br><br><br><br><br><br>


        
        
  </div>
   <br><br>
        
  <%@ include file = "rodape.jsp" %>             
</body>     
</html>