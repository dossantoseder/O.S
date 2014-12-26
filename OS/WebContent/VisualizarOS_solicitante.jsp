<%-- 
    Document   : teste
    Created on : 24/09/2014, 12:54:16
    Author     : leandreson
--%>
<%@ page language="java" import="modelo.*" import="modelo.persiste.*" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>VISUALIZAR O.S.</title>
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

    <%@ include file = "cabecalho_solicitante.jsp" %> 
        
        
   <%

 
  OrdemDeServico os;
  os = (OrdemDeServico)session.getAttribute("listaos");
  
%>  

        
    <div id="main">
       
           <div id="bar2">    
            <div id="divbar2"><h2>Ordem de Serviço</h2></div>  
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
			
				  <label id="l1"class="itens_valor"></label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Setor: 
					</label>	
				</strong> 
			
				  <label id="l2" class="itens_valor"><%=os.getSetor().getNomeSetor() %></label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Gestor: 
					</label>	
				</strong> 
			
				  <label id="l3" class="itens_valor"><%=os.getGestor().getNomeUsuario() %></label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Solicitante: 
					</label>	
				</strong> 
			
				  <label id="l4" class="itens_valor"><%=os.getSolicitante().getNomeUsuario() %> </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Tipo de Serviço: 
					</label>	
				</strong> 
			
				  <label id="l5"  class="itens_valor"><%=os.getServico().getNomeServico() %> </label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Data: 
					</label>	
				</strong> 
			
				  <label id="l6" class="itens_valor">data</label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Equipamento: 
					</label>	
				</strong> 
			
				  <label id="l7" class="itens_valor"><%=os.getEquipamento().getNomeEquipamento() %></label>
				  <br><br>
		<!--================================-->	
				<strong>
					<label class="itens">
						Executor: 
					</label>	
				</strong> 
			
				  <label id="l8" class="itens_valor"><%=os.getExecutor().getNomeUsuario() %></label>
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
		
		
		
		  <input type="hidden" name="controlador" value="ListaHistoricoCommand"/>
          <input id="bthistorico" type="image" name="botao" src="imagens/bthistorico.png"> 
		
</form>






<br>
<br><br><br><br><br><br><br><br><br><br><br><br>
<div id="form_container">

    <table>
        <tr>
          <th width="94">Status</th>
          <th width="56">Data</th>
          <th width="160">Administrador</th>
        </tr>
        <tr>
          <td>Servidores Linux</td>
          <td>50 horas</td>
          <td>Sábados</td>
        </tr>
        <tr class="alt">
          <td>Java SE</td>
          <td>60 horas</td>
          <td>Sábados</td>
        </tr>
        <tr>
          <td>Desenv. Android</td>
          <td>50 horas</td>
          <td>Segundas, Quartas e Sextas.</td>
        </tr>
        <tr class="alt">
          <td>Windows Server</td>
          <td>40 horas</td>
          <td>Domingos</td>
        </tr>
        <tr>
          <td>Java Web</td>
          <td>60 horas</td>
          <td>Segundas, Quartas e Sextas.</td>
        </tr>
        <tr class="alt">
          <td>C# e ASP NET</td>
          <td>40 horas</td>
          <td>Sábados</td>
        </tr>
    </table>
		</li>
			</ul>
	
		
	</div>
	
	  <br><br><br><br>     
  <br><br><br><br>  
	
	
	</div>
	  <%@ include file = "rodape.jsp" %>   
	</body>
</html>