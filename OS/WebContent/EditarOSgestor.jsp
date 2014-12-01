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
        
        <title>EDITAR O.S.</title>
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

    <%@ include file = "cabecalho_administradoregestor.jsp" %> 
        
        
     

        
    <div id="main">
       
           <div id="bar2">    
            	<div id="divbar2"><h2>Editar Ordem de Serviço</h2></div>	  
           		<div id="cancelarOS"> 
           			<input type="hidden" name="controlador" value="OrdemDeServicoAtualizarCommand"/>
               		<input id="btcancelarOS" name="btcancelarOS" type="image" src="imagens/btcancelarOS.png" value="Editar"/> 
           		</div>
            	<div id="clear"></div>	
		   </div>
       			 <br><br>
        
        
        
        
        
        

  <br><br><br><br>     
  <br><br><br><br>
  	<form id="form1"  method="post" action="">  
  	
  	
  	
		<div class="itens" >
		<!--================================-->	
				<strong>
					<label >
						Status: 
					</label>	
				</strong> 
			
				  <label id="l1"class="itens_valor">Pendente </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Setor: 
					</label>	
				</strong> 
			
				  <label id="l2" class="itens_valor">Pendente </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Gestor: 
					</label>	
				</strong> 
			
				  <label id="l3" class="itens_valor">Pendente </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Solicitante: 
					</label>	
				</strong> 
			
				  <label id="l4" class="itens_valor">Pendente </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Tipo de Serviço: 
					</label>	
				</strong> 
			
			    <select id="l3"  class="itens_valor" style="width: 440px">
				  	 <option></option>
				</select>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Data: 
					</label>	
				</strong> 
			
				  <label id="l6" class="itens_valor">Pendente </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Equipamento: 
					</label>	
				</strong> 
			
				  <label id="l7" class="itens_valor">Pendente </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Executor: 
					</label>	
				</strong> 
			
				  <label id="l8" class="itens_valor">Pendente </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Descrição: 
					</label>	
				</strong> 
			
				  <textarea id="l9" cols="60" rows="10">Pendente <br>Pendente <br>Pendente <br>Pendente <br>dasdjaslkdjalskjdlasjdlaksjdlaksjdl<br>dlaskjdlaksjdlaksjdalsdjlaskjdlkasjdlakjskld<br>
				  </textarea>
				  <br><br>
		</div>
		
		
		
		<div id="dbotoes">
			<div id="dcadastrar">		
			  <input type="hidden" name="controlador" value="OrdemDeServicoCadastrarCommand"/>
	          <input id="btcadastrar" type="image" name="botao" src="imagens/btcadastrar.png"> 
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