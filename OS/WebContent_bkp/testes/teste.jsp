
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
<script>
function WHFRAME(w,h){
var FrameWH = document.getElementById("iframeCadastrarOS");
alert(h);
FrameWH.style.width = (w)+"px";
FrameWH.style.height = h+"px";
}
</script>








<body>




 <!-- RAONI --><center><iframe src="cadastrarOS.jsp" id="iframeCadastrarOS" frameborder="0" width="100%" height="100%"></iframe>
 <!-- RAONI <center><iframe  name="iframeListarOS" frameborder="0" width="100%" ></iframe>
-->







</body>
</html>