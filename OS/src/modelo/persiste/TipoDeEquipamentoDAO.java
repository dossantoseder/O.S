package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class TipoDeEquipamentoDAO {
	Connection con;
	PreparedStatement stmt;
	TipoDeEquipamento tipoDeEquipamento;
	ResultSet rs;
	List<TipoDeEquipamento> tipoDeEquipamentos;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public TipoDeEquipamentoDAO() {

		con = bd.getConexao();

	}

	public void cadastrarTipoDeEquipamento(TipoDeEquipamento tipoDeEquipamento) {
		try {

			stmt = con
					.prepareStatement("insert into tipodeequipamento(nometipodeequipamento, descricao) values(?, ?)");

			stmt.setString(1, tipoDeEquipamento.getNomeTipoDeEquipamento());
			stmt.setString(3, tipoDeEquipamento.getDescricao());
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void atualizarTipoDeEquipamento(TipoDeEquipamento tipoDeEquipamento) {
		try {

			stmt = con
					.prepareStatement("update tipoDeEquipamento set nometipodeequipamento = ?, descricao = ?"
							+ "where idtipodeequipamento =?");

			stmt.setString(1, tipoDeEquipamento.getNomeTipoDeEquipamento());
			stmt.setString(2, tipoDeEquipamento.getDescricao());
			stmt.setInt(3, tipoDeEquipamento.getIdTipoDeEquipamento());

			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluirTipoDeEquipamento(int idTipoDeEquipamento) {
		try {

			stmt = con
					.prepareStatement("delete from tipodeequipamento where idtipodeequipamentor=?");
			stmt.setInt(1, idTipoDeEquipamento);
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<TipoDeEquipamento> getListarTipoDeEquipamento() {
		try {
			stmt = con.prepareStatement("select * from setor");
			rs = bd.executarBuscaSQL(stmt);
			tipoDeEquipamentos = new ArrayList<TipoDeEquipamento>();

			while (rs.next()) {
				tipoDeEquipamento = new TipoDeEquipamento();

				tipoDeEquipamento.setIdTipoDeEquipamento(rs
						.getInt("idtipoDeEquipamento"));
				tipoDeEquipamento.setNomeTipoDeEquipamento(rs
						.getString("nometipodeequipamento"));
				tipoDeEquipamento.setDescricao(rs.getString("descricao"));

				tipoDeEquipamentos.add(tipoDeEquipamento);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tipoDeEquipamentos;
	}

	public TipoDeEquipamento getTipoDeEquipamento(int idTipoDeEquipamento) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("select * from tipodeequipamento where idtipodeequipamento= ?");
			stmt.setInt(1, idTipoDeEquipamento);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {

				tipoDeEquipamento = new TipoDeEquipamento();

				tipoDeEquipamento.setIdTipoDeEquipamento(rs
						.getInt("idtipoDeEquipamento"));
				tipoDeEquipamento.setNomeTipoDeEquipamento(rs
						.getString("nometipodeequipamento"));
				tipoDeEquipamento.setDescricao(rs.getString("descricao"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tipoDeEquipamento;
	}

}
