
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="modelo.Usuario"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="estilo.css" type="text/css" rel="stylesheet" />
<title>SIGOS UNEB</title>
</head>


<body>
	        <div id="bar">           
            <div id="img"><img src="imagens/logo.png"></div>
              <%//Usuario usuario=(Usuario)session.getAttribute("usuario");%> 
         
         <div id="NomeDoUsuario">${param.login}<%//=usuario.getNomeUsuario() %></div>   
	        <div id="sair"> <a href="index.jsp" >Sair</a></div>
            
            <div id="menuOrdensDeServico"><a href="Servlet.Controlador?controlador=OrdemDeServicoListaCommand&id=1">Ordens de Servi�o</a>&nbsp;&nbsp;&nbsp;</div>
            <div id="divisoriamenu"><img src="imagens/divisoriamenu.png"> &nbsp;&nbsp;</div>
            
            
        </div>
       
        <div id="espaco">&nbsp;</div>
              


</body>
</html>