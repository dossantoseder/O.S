package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class SituacaoDAO {
	Connection con;
	PreparedStatement stmt;
	Situacao situacao;
	ResultSet rs;
	List<Situacao> situacoes;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();
	StatusDAO statusDAO = new StatusDAO();
	OrdemDeServico ordemDeServico;

	public SituacaoDAO() {

		con = bd.getConexao();

	}

	public List<Situacao> getListarSituacao() {
		try {
			stmt = con.prepareStatement("select * from situacao");
			rs = bd.executarBuscaSQL(stmt);
			situacoes = new ArrayList<Situacao>();

			while (rs.next()) {
				ordemDeServico = new OrdemDeServico();
				situacao = new Situacao(ordemDeServico);

				situacao.setIdSituacao(rs.getInt("idequipamento"));
				// situacao.setStatus(null);(rs.getString("status"));
				situacoes.add(situacao);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return situacoes;
	}

	public Situacao getSituacao(int id) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("select * from situacao where idordemdeservico= ?");
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {
				ordemDeServico = new OrdemDeServico();

				situacao = new Situacao(ordemDeServico);

				situacao.setIdSituacao(rs.getInt("idsituacao"));
				situacao.setStatus(statusDAO.getStatus(rs.getInt("idstatus")));
				situacao.setDataOS(rs.getDate("dataos"));
				situacoes.add(situacao);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return situacao;
	}

	public Situacao getSituacaoStatus(int id) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("select * from situacao where idsituacao= ?");
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {

				ordemDeServico = new OrdemDeServico();
				situacao = new Situacao(ordemDeServico);

				situacao.setIdSituacao(rs.getInt("idsituacao"));
				// situacao.setStatus(null);(rs.getString("status"));
				situacoes.add(situacao);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return situacao;
	}

	/*
	 * public List<Situacao> getSituacaoOSSolicitante(Usuario usuario) {
	 * ResultSet rs = null; try { stmt = con
	 * .prepareStatement("select * from situacao inner join ordemdeservico on "
	 * + "ordemdeservico.idordemdeservico = situacaoidordemdeservico " +
	 * "where idsolicitante = ?"); stmt.setInt(1, usuario.getIdUsuario()); rs =
	 * stmt.executeQuery(); situacoes = new ArrayList<Situacao>();
	 * 
	 * while (rs.next()) {
	 * 
	 * situacao = new Situacao();
	 * 
	 * situacao.setIdSituacao(rs.getInt("idsituacao"));
	 * situacao.setDataOS(rs.getDate("dataos"));
	 * situacao.setStatus(statusDAO.getStatus(rs.getInt("idstatus")));
	 * situacao.setOrdemDeServico(ordemDeServicoDAO
	 * .getOrdemDeServicoSolicitante(rs.getInt("idsituacao")));
	 * situacoes.add(situacao); }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return situacoes; }
	 */

	public Situacao getSituacaoOS(int id) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("SELECT max(dataos) as dataos, idsituacao, idstatus  FROM situacao where idordemdeservico=?");
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {
				ordemDeServico = new OrdemDeServico();
				situacao = new Situacao(ordemDeServico);

				situacao.setIdSituacao(rs.getInt("idsituacao"));
				situacao.setStatus(statusDAO.getStatus(rs.getInt("idstatus")));
				situacao.setDataOS(rs.getDate("dataos"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return situacao;
	}

}
