package modelo.persiste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;
public class AdministradorDAO {
	Connection con ;
	PreparedStatement stmt;
	Administrador administrador;
	ResultSet rs;
	List<Administrador> administradores;
	static ConexaoSingleton bd  = ConexaoSingleton.getInstance();
	
		
	
	public AdministradorDAO(){
		
		con  = bd.getConexao();
		
	}
	public List<Administrador> getListarAdministrador(){
		try {
			stmt = con.prepareStatement("select * from usuario");
			rs = stmt.executeQuery();
			administradores = new ArrayList<Administrador>();
			
			while(rs.next()){
				administrador = new Administrador();
				
				administrador.setIdUsuario(rs.getInt("idequipamento"));
				administrador.setNomeUsuario(rs.getString("nomeusuario"));
				administradores.add(administrador);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return administradores;
    }
	
	public Administrador getAdministrador(int id){
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from usuario where idusuario= ?");  
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			 
				while(rs.next()){
			
					administrador = new Administrador();
					
					administrador.setIdUsuario(rs.getInt("idequipamento"));
					administrador.setNomeUsuario(rs.getString("nomeusuario"));
					
				}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return administrador;
    }


}
