package modelo.persiste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;
public class ExecutorDAO {
	Connection con ;
	PreparedStatement stmt;
	Executor executor;
	ResultSet rs;
	List<Executor> executores;
	static ConexaoSingleton bd  = ConexaoSingleton.getInstance();
	
		
	
	public ExecutorDAO(){
		
		con  = bd.getConexao();
		
	}
	public List<Executor> getListarExecutor(){
		try {
			stmt = con.prepareStatement("select * from usuario");
			rs = stmt.executeQuery();
			executores = new ArrayList<Executor>();
			
			while(rs.next()){
				executor = new Executor();
				
				executor.setIdUsuario(rs.getInt("idusuario"));
				executor.setNomeUsuario(rs.getString("nomeusuario"));
				executores.add(executor);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return executores;
    }
	
	public Executor getExecutor(int id){
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from usuario where idusuario= ?");  
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			 
				while(rs.next()){
			
					executor = new Executor();
					
					executor.setIdUsuario(rs.getInt("idusuario"));
					executor.setNomeUsuario(rs.getString("nomeusuario"));
				}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return executor;
    }

}
