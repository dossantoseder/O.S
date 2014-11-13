package modelo.persiste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;
public class SetorDAO {
	Connection con ;
	PreparedStatement stmt;
	Setor setor;
	ResultSet rs;
	List<Setor> setores;
	static Conexao bd  = Conexao.getInstance();
	
		
	
	public SetorDAO(){
		
		con  = bd.getConexao();
		
	}
	
	public void cadastrarSetor(Setor setor){
		try {
			
			stmt = con.prepareStatement("insert into setor(secretaria) values(?)");
			
					
			stmt.setString(1, setor.nomeSetor);
			stmt.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void atualizarSetor(Setor setor){
	       try {
				
				stmt = con.prepareStatement("update secretaria set nomesetor = ?"
						+ "where idsetor=?");
				
				stmt.setString(1, setor.getNomeSetor());
				stmt.setInt(2,  setor.getIdSetor());
				
				stmt.execute();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public void excluirSetor(int idSetor){
        try {
			
			stmt = con.prepareStatement("delete from setor where idsetor=?");
			stmt.setInt(1, idSetor);
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Setor> getListarSetor(){
		try {
			stmt = con.prepareStatement("select * from setor");
			rs = stmt.executeQuery();
			setores = new ArrayList<Setor>();
			
			while(rs.next()){
				setor = new Setor();
				
				setor.setIdSetor(rs.getInt("idsetor"));
				setor.setNomeSetor(rs.getString("setor"));
	 			
				setores.add(setor);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return setores;
    }
	
	public Setor getSetor(int id){
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from setor where idsetor= ?");  
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			 
				while(rs.next()){
			
					setor = new Setor();
					
					setor.setIdSetor(rs.getInt("idsetor"));
					setor.setNomeSetor(rs.getString("nomesetor"));
				}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return setor;
    }

}
