package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class SetorDAO {
	Connection con;
	PreparedStatement stmt;
	Setor setor;
	ResultSet rs;
	List<Setor> setores;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public SetorDAO() {

		con = bd.getConexao();

	}

	public int  cadastrarSetor(Setor setor) {
		int valida = -1;
		try {

			stmt = con
					.prepareStatement("insert into setor(nomesetor) values(?)");
			
			stmt.setString(1, setor.getNomeSetor());
			
			valida = bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return valida;
	}

	public void atualizarSetor(Setor setor) {
		try {

			stmt = con.prepareStatement("update setor set nomesetor = ?"
					+ "where idsetor=?");

			stmt.setString(1, setor.getNomeSetor());

			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluirSetor(Setor setor) {
		try {

			stmt = con.prepareStatement("delete from setor where idsetor=?");
			stmt.setInt(1, setor.getIdSetor());
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Setor> getListarSetor() {
		try {
			stmt = con.prepareStatement("select * from setor");
			rs = bd.executarBuscaSQL(stmt);
			setores = new ArrayList<Setor>();

			while (rs.next()) {
				setor = new Setor();

				setor.setIdSetor(rs.getInt("idsetor"));
				setor.setNomeSetor(rs.getString("nomesetor"));

				setores.add(setor);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return setores;
	}

	public Setor getSetor(int id) {
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement("select * from setor where idsetor= ?");
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {

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
