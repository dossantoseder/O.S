package modelo.persiste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static Conexao singleton = null;
	private static Connection con =null ;
   
	//padrao de projeto que cria uma única instancia da classe BDMySql
    public static Conexao getInstance(){
		if (singleton == null)
		{
			singleton = new Conexao();
		}		
			return singleton;
	}
	
	//construtor que conecta ao banco
  private Conexao(){
		try {
			
			Class.forName("org.postgresql.Driver").newInstance();
			//"jdbc:postgresql://localhost:5432/db_projeto";

		      //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicamedica",
		       // "root","ifba");
		      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_os",
				        "postgres","s@nt0$");
		       System.out.println(" Conectado ");
		      
		}
		catch(SQLException  e) {
			System.out.println("Nao foi possível realizar a conexão.");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
    public Connection getConexao(){
	  
	     return con;
	  
   }

}
