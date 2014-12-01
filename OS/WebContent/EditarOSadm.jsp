<%@ page language="java" import="modelo.*" import="modelo.persiste.*" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ordens de Servi�o</title>
<link rel="stylesheet" type="text/css" href="view.css" media="all">
<script type="text/javascript" src="view.js"></script>
</head>

<%
  List<Servico> servs;
  servs = (List<Servico>)request.getAttribute("listaser");
  List<Status> listaStatus;
  listaStatus = (List<Status>)request.getAttribute("listastatus");
  OrdemDeServico os;
  os = (OrdemDeServico)request.getAttribute("os");
  
%>

<body id="main_body" >
<c:import url="cabecalho.jsp"/>	
	<img id="top" src="top.png" alt="">
	<div id="form_container">
	
		<h1><a>Ordens de Servi�o</a></h1>
		<form id="form_931421" class="appnitro"  action="Servlet.Controlador" method="post" >
					<div class="form_description">
			<h2>Ordem de Servi�o</h2>
		</div>						
			<ul >
		<input name="idordemdeservico" type="hidden" id="idordemdeservico" value="<%=os.getIdOrdemServico()%>"/>	
					<li id="li_1" >
		<label class="description" for="idstatus">Status </label>
		<div>
		<select class="element select medium" id="idstatus" name="idstatus"> 
			<%for(Status status : listaStatus){%>

            <option selected="selected" value="<%=status.getIdStatus()%>"><%=status.getNomeStatus()%></option>

         <%}%>

		</select>
        
		</div> 
		</li>		<li id="li_2" >
		<strong>
		<label class="description" for="element_2" >Setor </label>
		</strong>
		<div>
		  <label class="description" for="observacoes" ><%=os.getSetor().getNomeSetor()%></label>
		</div> 
		</li>
        <li id="li_3" >
		<label class="description" for="element_2"><strong>Gestor </strong></label>
		<div>
		  <label class="description" for="observacoes" ><%=os.getGestor().getNomeUsuario()%></label>
		</div> 
		</li>
        <li id="li_4" >
        <label class="description" for="element_2"><strong>Solicitante </strong></label>
		<div>
		  <label class="description" for="observacoes" ><%=os.getSolicitante().getNomeUsuario()%></label>
		</div> 
		</li>
        <li id="li_5" >
		<label class="description" for="idservico">Tipo de Servi�o </label>
		<div>
		<select class="element select medium" id="idservico" name="idservico"> 
			 <%for(Servico sev : servs){%>

            <option selected="selected" value="<%=sev.getIdServico()%>"><%=sev.getNomeServico()%></option>
             
         <%}%>

		</select>
        
		</div> 
		</li>	
        <li id="li_6" >
		<strong>
		<label class="description" for="observacoes" >Data</label>
		</strong> 
		<div>
		  <label class="description" for="observacoes" >17/11/2014 </label>
		</div> 
		</li>
		 <li id="li_7" >
		<strong>
		<label class="description" for="observacoes" >Equipamento</label>
		</strong> 
		<div>
		  <label class="description" for="observacoes" ><%=os.getEquipamento().getNomeEquipamento()%></label>
		</div> 
		</li>	
         <li id="li_8" >
		<strong>
		<label class="description" for="observacoes" >Executor</label>
		</strong> 
		<div>
		  <label class="description" for="observacoes" >Particula</label>
		</div> 
		</li>
         <li id="li_9" >
		<label class="description" for="element_9">Observa��es </label>
		<div>
			<textarea id="observacoes" name="observacoes" class="element textarea medium"></textarea> 
		</div> 
		</li>
         
			  <li class="buttons">
			    
			    <input type="hidden" name="controlador" value="OrdemDeServicoAtualizarCommand"/>
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Salvar" />
                <input id="saveFormCancela" class="button_text" type="submit" name="submit" value="Cancela" />
                <input id="saveFormCancela" class="button_text" type="submit" name="submit" value="Cadastrar Ordem" />
                <input id="saveFormCancela" class="button_text" type="submit" name="submit" value="Produto" />
                <input id="saveFormCancela" class="button_text" type="submit" name="submit" value="Servi�o" />
		</li>
			</ul>
		</form>	
	</div>
	<img id="bottom" src="bottom.png" alt="">
	  <%@ include file = "rodape.jsp" %>   
	</body>
</html>