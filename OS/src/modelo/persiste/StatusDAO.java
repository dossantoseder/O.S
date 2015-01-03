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
	
	public int cadastrarStatus(Status status) {
		int SEM_ERRO = -1;
		try {

			stmt = con
					.prepareStatement("insert into status(nomestatus, descricao) values(?,?)");

			stmt.setString(1, status.getNomeStatus());
			stmt.setString(2,status.getDescricao());
			SEM_ERRO = bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SEM_ERRO;
	}

	public int atualizarStatus(Status status) {
		int SEM_ERRO = -1;
		try {

			stmt = con
					.prepareStatement("update status set nomestatus = ?, descricao = ?, idstatus = ? "
							+ "where idequipamento=?");

			stmt.setString(1, status.getNomeStatus());
			stmt.setString(2,status.getDescricao());
			stmt.setInt(3, status.getIdStatus());

			SEM_ERRO = bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SEM_ERRO;
	}

	public int excluirStatus(int idStatus) {
		int SEM_ERRO = -1;
		try {

			stmt = con
					.prepareStatement("delete from status where idstatus = ?");
			stmt.setInt(1, idStatus);
			SEM_ERRO = bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SEM_ERRO;
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
