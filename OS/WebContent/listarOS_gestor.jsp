<%-- 
    Document   : teste
    Created on : 24/09/2014, 12:54:16
    Author     : leandreson
--%>

<%@ page language="java" import="modelo.*" import="modelo.persiste.*" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%

 
  List<OrdemDeServico> Ordens;
  Ordens = (List<OrdemDeServico>)request.getAttribute("listaos");
  List<Setor> setores;
  setores = (List<Setor>)request.getAttribute("listasetor");
  List<Status> listaStatus;
  listaStatus = (List<Status>)request.getAttribute("listastatus");
  
%>
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
	
	
<body >

    <%@ include file = "cabecalho_gestor.jsp" %>    
        
        
  {$usuario.nomeUsuario}   

        
    <div id="main">
       
        
            
        <form 
            name="listarOSsolicitante"
            action="listarOS_solicitante.jsp"
            method="post">
            <ul>
           <div id="bar2">    
            <div id="divbar2"><h2>Ordens de Serviço</h2></div>  
            
            <div id="formbar">
                <label for="data">Data Inicial:&nbsp;</label>
                <input name="dataInicial" type="date" />
                <br>
                <label for="data">Data &nbsp;Final:&nbsp;</label> 
                <input name="dataFinal" type="date" />               
           </div>
           
             <div id="formbar2">
                <label for="data">Status:</label>
	                <select id="inputstatus" class="field1">
	                <%for(Status status : listaStatus){%>

            <option selected="selected" value="<%=status.getIdStatus()%>"><%=status.getNomeStatus()%></option>

         <%}%>
	                </select>
                <br>            
                <label for="data">Setor:</label>
	                <select id="inputsetor" class="field1">
	                <%for(Setor s : setores){%>

            <option selected="selected" value="<%=s.getIdSetor()%>"><%=s.getNomeSetor()%></option>

         <%}%>
	                </select>
           </div>
           <div id="pesquisar"> 
              	<input type="hidden" name="controlador" value="ListarCommand"/>
               <input id="btpesquisar" type="image" src="imagens/botaopesquisar" value="Pesquisar"/> 
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
        <%if(Ordens!=null){ %>
           <%for(OrdemDeServico o: Ordens){%>
               <tr>
                  <td><a style="color: blue;"    href="OrdemDeServicoVisualizar?id=<%=o.getIdOrdemServico()%>">
                  <%=o.getDescricao()%></a></td>
                  
                 <td><%=o.getDescricao()%></td>
                 <td><%=o.getObs()%></td>
                 <td><%=o.getIdOrdemServico()%></td>
               </tr>

            <%}%>
            <%}%>
    </table> 
		</li>
			
				
			</ul>
</div>
        
        
   <br><br><br><br><br><br><br><br>
        
  </div>
  <%@ include file = "rodape.jsp" %>             
</body>     
</html>
