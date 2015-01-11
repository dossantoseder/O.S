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
        
        <title>MENSAGEM</title>
        <link rel="stylesheet" type="text/css" href="view.css" media="all">
       <link href="estilo.css" type="text/css" rel="stylesheet" />
       <link href="listarOS.css" type="text/css" rel="stylesheet" />
    </head>
    <%
    String msg = (String) request.getAttribute("msg");
    %>
 
    <style>
    	body{
	    	background-image: url("imagens/branco.png");
    		margin: 0;
    		padding: 0;
    	}
    </style>
    <body>
    <%@ include file = "cabecalho_gestor.jsp" %>       
        
     

        
    <div id="main">
       
           <div id="bar2">    
            <div id="divbar2"><h2>Mensagem</h2></div>  
           </div>

		<div>
			<label id="mensagem" style="margin-left: 100px; margin-top: 100px">
				<%=msg%>
			</label>
		</div>
        
  <br><br><br><br>     
  <br><br><br><br>      
        
	<form id="form2"  action="Servlet.Controlador" method="post">  
  	
  	
  
        
        
		
		
		
				<div id="dbotoes">

	        
	        <div id="dcancelar">  
	          <input type="hidden" name="controlador" value="OrdemDeServicoListaCommand"/>
	          <input id="btcancelar" type="image" name="botao" src="imagens/btcancelar.png">
	        </div>	          
		</div>
</form>






<br>
<br><br><br><br><br><br><br><br><br><br><br><br>


        
        
   <br><br>
        
  </div>
  <%@ include file = "rodape.jsp" %>             
</body>     
</html>
