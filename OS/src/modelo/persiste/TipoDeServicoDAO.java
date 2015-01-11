package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class TipoDeServicoDAO {
	Connection con;
	PreparedStatement stmt;
	TipoDeServico tipoDeServico;
	ResultSet rs;
	List<TipoDeServico> tipoDeServicos;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public TipoDeServicoDAO() {

		con = bd.getConexao();

	}

	public int cadastrarServico(TipoDeServico tipoDeServico) {
		int valida = -1;
		try {

			stmt = con
					.prepareStatement("insert into tiposervico(nometiposervico) values(?)");

			stmt.setString(1, tipoDeServico.getNomeTipoDeServico());

			valida = bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return valida;
	}

	public void atualizarTipoDeServico(TipoDeServico tipoDeServico) {
		try {

			stmt = con
					.prepareStatement("update tiposervico set nometiposervico = ?"
							+ "where idservico=?");

			stmt.setString(1, tipoDeServico.getNomeTipoDeServico());
			stmt.setInt(2, tipoDeServico.getIdTipoDServico());

			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluirTipoDeServico(int idTipoServico) {
		try {

			stmt = con
					.prepareStatement("delete from tiposervico where idtiposervico=?");
			stmt.setInt(1, idTipoServico);

			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<TipoDeServico> getListarTipoDeServico() {
		try {
			stmt = con.prepareStatement("select * from tiposervico");
			rs = bd.executarBuscaSQL(stmt);
			tipoDeServicos = new ArrayList<TipoDeServico>();

			while (rs.next()) {
				tipoDeServico = new TipoDeServico();

				tipoDeServico.setIdTipoDeServico(rs.getInt("idtiposervico"));
				tipoDeServico.setNomeTipoDeServico(rs
						.getString("nometiposervico"));

				tipoDeServicos.add(tipoDeServico);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tipoDeServicos;
	}

	public TipoDeServico getTipoServico(int id) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("select * from tiposervico where idtiposervico= ?");
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {
				tipoDeServico = new TipoDeServico();

				tipoDeServico.setIdTipoDeServico(rs.getInt("idtiposervico"));
				tipoDeServico.setNomeTipoDeServico(rs
						.getString("nometiposervico"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tipoDeServico;
	}

}
