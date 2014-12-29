  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="modelo.Usuario"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="estilo.css" type="text/css" rel="stylesheet" />
<title>SIGOS UNEB</title>
</head>
	<style>
		#espaco{
			background-image: url("imagens/branco.png");
		}
	</style>
<body>

	        <div id="bar">
            <div id="img"><img src="imagens/logo.png"></div>
	        <%//Usuario usuario=(Usuario)session.getAttribute("usuario");%> 
         
         <div id="NomeDoUsuario">${param.nome} <%//= usuario.getNomeUsuario()%></div>   
	        <div id="sair"> <a href="index.jsp" >Sair</a></div>
  
	        

            <div id="menuOrdensDeServico"><a href="listarOS_administrador.jsp" >Ordens de Serviço</a>&nbsp;&nbsp;</div>
            <div id="divisoriamenu"><img src="imagens/divisoriamenu.png"> &nbsp;</div>
            <div id="menuCadastrarOs"><a href="cadastrarOS_administrador.jsp" >Cadastrar OS</a>&nbsp;&nbsp;</div>
            <div id="divisoriamenu"><img src="imagens/divisoriamenu.png"> &nbsp;</div>
            <div id="menuCadastrarOs"><a href="cadastrarEquipamento_administrador.jsp" >Equipamento</a>&nbsp;&nbsp;</div>
            <div id="divisoriamenu"><img src="imagens/divisoriamenu.png"> &nbsp;</div>
            <div id="menuCadastrarOs"><a href="cadastrarUsuario_administrador.jsp" >Usuário</a>&nbsp;&nbsp;</div>            
            <div id="divisoriamenu"><img src="imagens/divisoriamenu.png"> &nbsp;</div>
            <div id="menuCadastrarOs"><a href="cadastrarSetor_administrador.jsp" >Setor</a>&nbsp;&nbsp;</div>
            <div id="divisoriamenu"><img src="imagens/divisoriamenu.png"> &nbsp;</div>
            <div id="menuCadastrarOs"><a href="cadastrarServico_administrador.jsp" >Tipo de Serviço</a>&nbsp;&nbsp;</div>
            
            </div>
        </div>
                
        <div id="espaco">&nbsp;</div>
	
	
	
</body>
</html>