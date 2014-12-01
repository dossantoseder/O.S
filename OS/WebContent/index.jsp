<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang ="pt-br">
<head>
   <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>LOGIN</title>
<link href="login.css" type="text/css" rel="stylesheet" />


</head>
<body>
 
       <img src="imagens/meio.png"
            width="870" height="416">

       <p style='position:absolute;margin-left:760px;margin-top:215px;color:#666666;'> <font size="5" face="arial">Seja bem-vindo!</font></p>
        <h2 style='position:absolute;margin-left:430px;margin-top:310px;color:#999999;'>Gerenciador de O.S.</h2>
       
    
<div style='position:absolute;margin-left:691px;margin-top:250px;color:#666666;'>  
<SCRIPT LANGUAGE="JAVASCRIPT" >
<!-- 
var now = new Date();
var mName = now.getMonth() +1 ;
var dName = now.getDay() +1;
var dayNr = now.getDate();
var yearNr=now.getYear();
if(dName==1) {Day = "Domingo";}
if(dName==2) {Day = "Segunda-feira";}
if(dName==3) {Day = "Terça-feira";}
if(dName==4) {Day = "Quarta-feira";}
if(dName==5) {Day = "Quinta-feira";}
if(dName==6) {Day = "Sexta-feira";}
if(dName==7) {Day = "Sábado";}
if(mName==1){Month = "Janeiro";}
if(mName==2){Month = "Fevereiro";}
if(mName==3){Month = "Março";}
if(mName==4){Month = "Abril";}
if(mName==5){Month = "Maio";}
if(mName==6){Month = "Junho";}
if(mName==7){Month = "Julho";}
if(mName==8){Month = "Agosto";}
if(mName==9){Month = "Setembro";}
if(mName==10){Month = "Outubro";}
if(mName==11){Month = "Novembro";}
if(mName==12){Month = "Dezembro";}
if(yearNr < 2000) {Year = 1900 + yearNr;}
else {Year = yearNr;}
var todaysDate =(" " + Day + ", " + dayNr + " de " + Month + " de " + Year);
 
document.write('  '+todaysDate);
 
//-->
</SCRIPT>
 </div>


        <form action="Servlet.Controlador" method="post" >
                 <strong><div id="erroLogin" style="color: red;">  </div></strong>
               <div >
	             	 <div id="dusuario">
		                Usuário:<br>
		                <input type="text" name="login"class="txtarea" size="18">
		             </div>	            
		             <div id="dsenha">
		                 Senha: <br>
		                <input type="password" name="senha" value="" size="18" class="txtarea">
		             </div>     
		             <div id="dbotao" >             
		                 <input type="hidden" name="controlador" value="LogarCommand"/>
		                 <input type="image" name="botao" src="imagens/botao.png">                        
		             </div>
               </div>
        </form>





</body>
</html>