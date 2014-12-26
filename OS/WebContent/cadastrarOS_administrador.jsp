<%-- 
    Document   : teste
    Created on : 24/09/2014, 12:54:16
    Author     : leandreson
--%>

<%@ page language="java" import="modelo.*" import="modelo.persiste.*"
	import="java.util.*" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<title>CADASTRAR O.S.</title>
	<link rel="stylesheet" type="text/css" href="view.css" media="all">
		<link href="estilo.css" type="text/css" rel="stylesheet" />
		<link href="listarOS.css" type="text/css" rel="stylesheet" />
</head>

<%
	List<Usuario> sols;
	sols = (List<Usuario>) request.getAttribute("listasol");
	List<Setor> setores;
	setores = (List<Setor>) request.getAttribute("listaset");
	List<Servico> servs;
	servs = (List<Servico>) request.getAttribute("listaser");
	List<Equipamento> equis;
	equis = (List<Equipamento>) request.getAttribute("listaequi");
%>
<style>
body {
	background-image: url("imagens/branco.png");
	margin: 0;
	padding: 0;
}
</style>
<body>
	<%@ include file="cabecalho_administrador.jsp"%>




	<div id="main">

		<div id="bar2">
			<div id="divbar2">
				<h2>Nova Ordem de Serviço</h2>
			</div>
		</div>



		<br><br><br><br> <br><br><br><br>

										<form id="form_931421" class="appnitro"
											action="Servlet.Controlador" method="post">



											<div class="itens">

												<!--================================-->
												<strong> <label class="itens"> Setor: </label>
												</strong> <select name="idsetor" class="itens_valor" id="l3"
													style="width: 440px">
													<option value="" selected="selected"></option>
													<%
														for (Setor s : setores) {
													%>

													<option value="<%=s.getIdSetor()%>"><%=s.getNomeSetor()%></option>

													<%
														}
													%>

												</select> <br><br> <!--================================-->
														<strong> <label class="itens">
																Solicitante: </label>
													</strong> <select name="idsolicitante" class="itens_valor" id="l4"
														style="width: 440px">
															<option value="" selected="selected"></option>
															<%
																for (Usuario sol : sols) {
															%>

															<option value="<%=sol.getIdUsuario()%>"><%=sol.getNomeUsuario()%></option>

															<%
																}
															%>
													</select> <br><br> <!--================================-->
																<strong> <label class="itens"> Tipo de
																		Serviço: </label>
															</strong> <select name="idservico" class="itens_valor" id="l5"
																style="width: 440px">
																	<option value="" selected="selected"></option>
																	<%
																		for (Servico sev : servs) {
																	%>

																	<option value="<%=sev.getIdServico()%>"><%=sev.getNomeServico()%></option>

																	<%
																		}
																	%>

															</select> <br><br> <!--================================-->
																		<strong> <label class="itens">
																				Equipamento: </label>
																	</strong> <select name="idequipamento" class="itens_valor"
																		id="l4" style="width: 440px">
																			<option value="" selected="selected"></option>
																			<%
																				for (Equipamento equi : equis) {
																			%>

																			<option value="<%=equi.getIdEquipamento()%>"><%=equi.getNomeEquipamento()%></option>

																			<%
																				}
																			%>
																	</select> <br><br> <!--================================-->
																				<strong> <label class="itens">
																						Descrição: </label>
																			</strong> <textarea id="l9" name="descricao" cols="60"
																					rows="10">
				  </textarea> <br><br>
											</div>


											<div id="dbotoes">
												<div id="dcadastrar">
													<input type="hidden" name="controlador"
														value="OrdemDeServicoCadastrarCommand" /> <input
														id="btcadastrar" type="image" name="botao"
														src="imagens/btcadastrar.png">
												</div>

												<div id="dcancelar">
													<input type="hidden" name="controlador"
														value="OrdemDeServicoCadastrarCommand" /> <input
														id="btcancelar" type="image" name="botao"
														src="imagens/btcancelar.png">
												</div>
											</div>

										</form> <br> <br><br><br><br><br><br><br><br><br><br><br><br>




															<br><br>
	</div>
	<%@ include file="rodape.jsp"%>
</body>
</html>
