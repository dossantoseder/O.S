<%-- 
    Document   : teste
    Created on : 24/09/2014, 12:54:16
    Author     : leandreson
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LISTAR O.S.</title>
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
        
        
     
     
     

        
    <div id="main">
       
        
            
        <form 
            name="listarOSsolicitante"
            action="listarOS_solicitante.jsp"
            method="post">
            <ul>
           <div id="bar2">    
            <div id="divbar2"><h2>Ordens de Serviço</h2></div>  
            
            <div id="formbar">
                <label for="data">Data Inicial:</label>
                <input name="dataInicial" type="date" />
                <br>            
                <label for="data">Data Final:</label> &nbsp;
                <input name="dataInicial" type="date" />
           </div>
           <div id="pesquisar"> 
               <input name="Pesquisar" type="image" src="imagens/botaopesquisar" value="Pesquisar"/> 
           </div> 
            
            <div id="clear"></div>
           </div>
            </ul>
        </form>
        <br><br>
        
        
  
        
        
        
  <br><br><br><br>     
  <br><br><br><br>      
        
<!-- ========================================
 	 ============= T A B E L A ==============
 	 ========================================-->
<div id="form_container">

    <table>
        
        <tr>
          <th>Tipo de Serviço</th>
          <th>Status</th>
          <th>Data</th>
          <th>Setor</th>
        </tr>
        <c:forEach var="os" items="${listaos}">
        <tr>
              <td>${os.OrdemDeServico.Servico.nomeServico}</td>
              <td>${os.Status.nomeStatus}</td>
              <td>${os.dataOS.time}</td>
              <td>${os.OrdemDeServico.Setor.nomeSetor}</td>
        </tr>
        </c:forEach>
    </table> 
		</li>
			
				
			</ul>
</div>
        
        
   <br><br><br><br><br><br><br><br>
        
  </div>
    <%@ include file = "rodape.jsp" %>           
</body>     
</html>
