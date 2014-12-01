
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="estilo.css" type="text/css" rel="stylesheet" />
<title>Insert title here</title>
</head>




<style>
*{
margin:0;padding:0;
}
#iframe{
overflow:hidden;
}
</style>
<script language="javascript" type="text/javascript">
  function resizeIframe(obj) {
    obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px';
  }
</script>



<body>
	        <div id="bar">           
            <div id="img"><img src="imagens/logo.png"></div>
            
            <div id="menuOrdensDeServico"><a href="listarOS_solicitante_1.jsp" target="iframe">Ordens de Serviço</a>&nbsp;&nbsp;&nbsp;</div>
            <div id="divisoriamenu"><img src="imagens/divisoriamenu.png"> &nbsp;&nbsp</div>
            <div id="menuCadastrarOs"><a href="cadastrarOS.jsp" target="iframe">Cadastrar OS</a></div>
            
            </div>
        </div>
                
        <div id="espaco">&nbsp;</div>


		<div id="iframe_">
			 <!-- RAONI " --><center><iframe src="listarOS_solicitante_1.jsp" id="iframeid" name="iframe" frameborder="0" width="100%"  onload='javascript:resizeIframe(this);'></iframe>
		</div>










        <div id="rodape">
            <div id="r1">Universidade do Estado da Bahia</div> 
            <div id="divisoria">
                <img src="imagens/divisoria.png">
            </div>
           <div id="r2"> Fone:(71)3117-2200 <br>
                Rua Silveira Martins, 2555, Cabula. Salvador-BA. CEP: 41.150-000</div>
           <div id="clear"></div>
        </div>

</body>
</html>