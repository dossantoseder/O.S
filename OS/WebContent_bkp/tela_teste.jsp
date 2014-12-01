<%@ page language="java" import="modelo.*" import="modelo.persiste.*" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Insert title here</title>
</head>
<%
  List<OrdemDeServico> Ordens;
  Ordens = (List<OrdemDeServico>)request.getAttribute("listaos");
  
%>
<body bgcolor="#2ABFFF">

<SCRIPT language=JavaScript>
	
	function Delete(Id,Nome) {
		
		var Endereco = "ExcluirMedico?idMedico=" + Id;
		var Mensagem = "Os dados do médico '" + Nome + "' serão apagados definitivamente.\nDeseja continuar?"

		if (confirm(Mensagem)){
	         window.location.href = Endereco ; 
    	}
	}

</SCRIPT>
  <%if(Ordens==null){ %>
<font color="#FF0000" size="2" face="Verdana, Arial, Helvetica, sans-serif"><label>Clique em enviar para ver a lista</label></font><br>
  <%}%>
 <table width="100%" border="1" cellspacing="0" bordercolor="#006600">
          <tr bgcolor="#ffffff"> 

            <td width="4%"><div align="center"><font color="#FFFFFF">Nome</font></div></td>
            <td width="18%"><div align="center"><font color="#FFFFFF">rg</font></div></td>
            <td width="18%"><div align="center"><font color="#FFFFFF">cpf</font></div></td>
          </tr>
           <%if(Ordens!=null){ %>
           <%for(OrdemDeServico o: Ordens){%>
               <tr>
                  <td><a href="editarOs?id=<%=o.getIdOrdemServico()%>">
                  <%=o.getDescricao()%></a></td>
                  
                  <td width="4%"><div align="center"><%=o.getDescricao()%></div></td>
                  <td width="4%"><div align="center"><%=o.getObs()%></div></td>
                  <td width="4%"><div align="center"><%=o.getIdOrdemServico()%></div></td>

                  <td><div align="center"><img src="imagem\firefox.png" class='clsCursor' alt="Excluir Médico" width="23" height="22" border="0" onClick = "Delete('<%=o.getIdOrdemServico()%>','<%=o.getDescricao()%>');"></div></td>
               </tr>

            <%}%>
            <%}%>
</table>
<form action="Servlet.Controlador" method="POST" >

<input type="hidden" name="controlador" value="OrdemDeServicoExibirCommand"/>
<input type="submit" value="Enviar"/>
</form>
</body>
</html>