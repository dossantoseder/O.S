package modelo.persiste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.Mensagem;
import util.Utilidade;

public class ConexaoSingleton {
	
	private static ConexaoSingleton singleton = null;
	private static Connection con =null ;
   
	//padrao de projeto que cria uma única instancia da classe BDMySql
    public static ConexaoSingleton getInstance(){
		if (singleton == null)
		{
			singleton = new ConexaoSingleton();
		}		
			return singleton;
	}
	
	//construtor que conecta ao banco
  private ConexaoSingleton(){
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bd_sgos","root","s@nt0$");
		      
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
     
    public int executarSQL(PreparedStatement stmt) {
		try {
			stmt.execute();
			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Mensagem.SEM_ERRO;

		} catch (Exception e) {
			
			return Mensagem.NAO_FOI_POSSIVEL_CONECTAR_AO_BANCO;
		}
	}
    
    public ResultSet executarBuscaSQL(PreparedStatement stmt) {
		try {
			ResultSet rs = stmt.executeQuery();
			return rs;
		} catch (Exception e) {
			Utilidade.SOP(Mensagem.getMensagem(Mensagem.NAO_FOI_POSSIVEL_EXECUTAR_SQL_BUSCA));
			return null;
		}

	}
    
    public void fecharConexao() {
		try {
			con.close();
		} catch (Exception e) {
			Utilidade.SOP(Mensagem.getMensagem(Mensagem.NAO_FOI_POSSIVEL_FECHAR_A_CONEXAO));
		}

	}
	
	@Override
	protected void finalize() throws Throwable {
		fecharConexao();
		super.finalize();
	}


}
