package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class GestorDAO {
	Connection con;
	PreparedStatement stmt;
	Gestor gestor;
	ResultSet rs;
	List<Gestor> gestores;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public GestorDAO() {

		con = bd.getConexao();

	}
	
	public Gestor getGestor(int id){
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from usuario where idusuario= ?");  
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			 
				while(rs.next()){
			
					gestor = new Gestor();
					
					gestor.setIdUsuario(rs.getInt("idusuario"));
					gestor.setNomeUsuario(rs.getString("nomeusuario"));
					//gestores.add(gestor);
				}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gestor;
    }
	
	public List<Gestor> getListarGestor(){
		try {
			stmt = con.prepareStatement("select * from gestor");
			rs = stmt.executeQuery();
			gestores = new ArrayList<Gestor>();
			
			while(rs.next()){
				gestor = new Gestor();
				
				gestor.setIdUsuario(rs.getInt("idgestor"));
				gestor.setNomeUsuario(rs.getString("nomegestor"));
				gestores.add(gestor);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gestores;
    }
	

}
