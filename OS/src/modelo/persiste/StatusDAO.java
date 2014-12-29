package modelo.persiste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;
public class StatusDAO {
	Connection con ;
	PreparedStatement stmt;
	Status status;
	ResultSet rs;
	List<Status> listaStatus;
	static ConexaoSingleton bd  = ConexaoSingleton.getInstance();
	
		
	
	public StatusDAO(){
		
		con  = bd.getConexao();
		
	}
	public List<Status> getListarStatus(){
		try {
			stmt = con.prepareStatement("select * from status");
			rs = bd.executarBuscaSQL(stmt);
			listaStatus = new ArrayList<Status>();
			
			while(rs.next()){
				status = new Status();
				
				status.setIdStatus(rs.getInt("idstatus"));
				status.setNomeStatus(rs.getString("descricao"));
				listaStatus.add(status);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaStatus;
    }
	
	public Status getStatus(int id){
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from status where idstatus= ?");  
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);
			 
				while(rs.next()){
			
					status = new Status();
					
					status.setIdStatus(rs.getInt("idstatus"));
					status.setNomeStatus(rs.getString("nomestatus"));
				}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
    }

}
