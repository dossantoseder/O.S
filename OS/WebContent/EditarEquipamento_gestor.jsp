<%-- 
    Document   : teste
    Created on : 24/09/2014, 12:54:16
    Author     : leandreson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>EDITAR EQUIPAMENTO</title>
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

    <%@ include file = "cabecalho_gestor.jsp" %> 
        
        
     

        
    <div id="main">
       
           <div id="bar2">    
            	<div id="divbar2"><h2>Editar Equipamento</h2></div>	  
		   </div>
       			 <br><br>
        
        
        
        
        
        

  <br><br><br><br>     
  <br><br><br><br>
  	<form id="form1"  method="post" action="">  
  	
  	
  	
		<div class="itens" >
		<!--================================-->	
				<strong>
					<label >
						Equipamento: 
					</label>	
				</strong> 
			
				  <input id="l1"class="itens_valor" value="Pendente" style="width: 440px"> </input>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Tombo: 
					</label>	
				</strong> 
			
				  <input id="l2"class="itens_valor" value="Pendente" style="width: 440px"> </input>
				  <br><br>
		</div>
		
		
		
		<div id="dbotoes">
			<div id="dcadastrar">		
			  <input type="hidden" name="controlador" value="OrdemDeServicoCadastrarCommand"/>
	          <input id="btcadastrar" type="image" name="botao" src="imagens/btsalvar.png"> 
	        </div>
	        
	        <div id="dcancelar">  
	          <input type="hidden" name="controlador" value="OrdemDeServicoCadastrarCommand"/>
	          <input id="btcancelar" type="image" name="botao" src="imagens/btcancelar.png">
	        </div>	          
		</div>
		
	
</form>






<br>
<br><br><br><br><br><br><br><br><br><br><br><br>

	
	  <br><br><br><br>     
  <br><br><br><br>  
	
	
	</div>
	  <%@ include file = "rodape.jsp" %>   
	</body>
</html>