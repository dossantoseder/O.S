<%-- 
    Document   : teste
    Created on : 24/09/2014, 12:54:16
    Author     : leandreson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LISTAR O.S.</title>
        <link rel="stylesheet" type="text/css" href="view.css" media="all">
       <link href="estilo.css" type="text/css" rel="stylesheet" />
       <link href="listarOS.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        
        
     

        
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
	                <option></option>
	                <option>------------------</option>
	                </select>
                <br>            
                <label for="data">Setor:</label>
	                <select id="inputsetor" class="field1">
	                <option></option>
	                <option>------------------</option>
	                </select>
           </div>
           <div id="pesquisar"> 
               <input id="btpesquisar" type="image" src="imagens/botaopesquisar" value="Pesquisar"/> 
           </div> 
            
            <div id="clear"></div>
           </div>
            </ul>
        </form>
        <br><br>
        
        
  
        
        
        
  <br><br><br><br>     
  <br><br><br><br>      
        <script language="JavaScript" type="text/javascript">
			pai = parent.document.1;
			var nome = pai.2.value; 
			var email = pai.email.value; 
			
		</script>
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
        <tr>
          <td>Servidores Linux</td>
          <td>50 horas</td>
          <td>Sábados</td>
          <td>UNEB</td>
        </tr>
        <tr class="alt">
          <td>Java SE</td>
          <td>60 horas</td>
          <td>Sábados</td>
          <td>UNEB</td>
        </tr>
        <tr>
          <td>Desenv. Android</td>
          <td>50 horas</td>
          <td>Segundas, Quartas e Sextas.</td>
          <td>UNEB</td>
        </tr>
        <tr class="alt">
          <td>Windows Server</td>
          <td>40 horas</td>
          <td>Domingos</td>
           <td>UNEB</td>
        </tr>
        <tr>
          <td>Java Web</td>
          <td>60 horas</td>
          <td>Segundas, Quartas e Sextas.</td>
          <td>UNEB</td>
        </tr>
        <tr class="alt">
          <td>C# e ASP NET</td>
          <td>40 horas</td>
          <td>Sábados</td>
          <td>UNEB</td>
        </tr>
    </table> 
		</li>
			
				
			</ul>
</div>
        
        
   <br><br><br><br><br><br><br><br>
        
  </div>        
</body>     
</html>
