package modelo.persiste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;
public class ProdutoDAO {
	Connection con ;
	PreparedStatement stmt;
	Produto produto;
	ResultSet rs;
	List<Produto> produtos;
	static Conexao bd  = Conexao.getInstance();
	
		
	
	public ProdutoDAO(){
		
		con  = bd.getConexao();
		
	}
	
	public void cadastrarProduto(Produto produto){
		try {
			
			stmt = con.prepareStatement("insert into produto(nomeproduto,descricao,numeroprocesso) values(?,?,?)");
			
			stmt.setString(1, produto.getNomeProduto());
			stmt.setString(2, produto.getDescricao());
			stmt.setInt(3,  produto.getNumeroProcesso());
			stmt.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void atualizarProduto(Produto produto){
	       try {
				
				stmt = con.prepareStatement("update produto set nomeproduto = ?, descricao = ? ,numeroprocesso = ?"
						+ "where idproduto=?");
				
				stmt.setString(1, produto.getNomeProduto());
				stmt.setString(2, produto.getDescricao());
				stmt.setInt(3,  produto.getNumeroProcesso());
				stmt.setInt(4,  produto.getIdProduto());
				
				stmt.execute();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public void excluirSetor(int idProduto){
        try {
			
			stmt = con.prepareStatement("delete from produto where idproduto = ?");
			stmt.setInt(1, idProduto);
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Produto> getListarProduto(){
		try {
			stmt = con.prepareStatement("select * from produto");
			rs = stmt.executeQuery();
			produtos = new ArrayList<Produto>();
			
			while(rs.next()){
				produto = new Produto();
				
				produto.setIdProduto(rs.getInt("idproduto"));
				produto.setNomeProduto(rs.getString("nomeproduto"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setNumeroProcesso(rs.getInt("numeroprocesso"));
				produtos.add(produto);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produtos;
    }
	
	public Produto getProduto(int id){
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from produto where idproduto= ?");  
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			 
				while(rs.next()){
			
					produto = new Produto();
					
					produto.setIdProduto(rs.getInt("idproduto"));
					produto.setNomeProduto(rs.getString("nomeproduto"));
					produto.setDescricao(rs.getString("descricao"));
					produto.setNumeroProcesso(rs.getInt("numeroprocesso"));
				}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produto;
    }

}
