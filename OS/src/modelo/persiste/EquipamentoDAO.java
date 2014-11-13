package modelo.persiste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;
public class EquipamentoDAO {
	Connection con ;
	PreparedStatement stmt;
	Equipamento equipamento;
	ResultSet rs;
	List<Equipamento> equipamentos;
	static Conexao bd  = Conexao.getInstance();
	
		
	
	public EquipamentoDAO(){
		
		con  = bd.getConexao();
		
	}
	
	public void cadastrarEquipamento(Equipamento equipamento){
		try {
			
			stmt = con.prepareStatement("insert into produto(tombo,idtipoequipamento) values(?,?)");
			
			stmt.setString(1, equipamento.getTombo());
			stmt.setInt(2, equipamento.getTipoDeEquipamento().getIdTipoDeEquipamento());
			stmt.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void atualizarEquipamento(Equipamento equipamento){
	       try {
				
				stmt = con.prepareStatement("update equipamento set tombo = ?, idtipoequipamento = ? "
						+ "where idequipamento=?");
				
				stmt.setString(1, equipamento.getTombo());
				
				stmt.execute();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public void excluirSetor(int idProduto){
        try {
			
			stmt = con.prepareStatement("delete from produto where idequipamento = ?");
			stmt.setInt(1, idProduto);
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Equipamento> getListarProduto(){
		try {
			stmt = con.prepareStatement("select * from equipamento");
			rs = stmt.executeQuery();
			equipamentos = new ArrayList<Equipamento>();
			
			while(rs.next()){
				equipamento = new Equipamento();
				
				equipamento.setIdEquipamento(rs.getInt("idequipamento"));
				equipamento.setTombo(rs.getString("tombo"));
				equipamentos.add(equipamento);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equipamentos;
    }
	
	public Equipamento getEquipamento(int id){
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from equipamento where idequipamento= ?");  
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			 
				while(rs.next()){
			
					equipamento = new Equipamento();
					
					equipamento.setIdEquipamento(rs.getInt("idproduto"));
					equipamento.setTombo(rs.getString("nomeproduto"));
					equipamentos.add(equipamento);
				}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equipamento;
    }

}
