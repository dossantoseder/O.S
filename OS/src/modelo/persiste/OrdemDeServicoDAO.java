package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class OrdemDeServicoDAO {

	Connection con;
	PreparedStatement stmt;
	OrdemDeServico ordemDeServico;
	ServicoDAO servicoDAO = new ServicoDAO();
	SetorDAO setorDAO = new SetorDAO();
	EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
	GestorDAO gestorDAO = new GestorDAO();
	SolicitanteDAO solicitanteDAO = new SolicitanteDAO();
	SituacaoDAO situacaoDAO = new SituacaoDAO();
	ResultSet rs;
	List<OrdemDeServico> ordensDeServico;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public OrdemDeServicoDAO() {

		con = bd.getConexao();

	}

	public OrdemDeServico cadastrarOrdemDeServico(OrdemDeServico ordemDeServico) {
		try {

			stmt = con
					.prepareStatement("insert into ordemdeservico(descricao,idServico,idSetor,idequipamento,idsolicitante) "
							+ "values(?,?,?,?,?)");

			stmt.setString(1, ordemDeServico.getDescricao());
			stmt.setInt(2, ordemDeServico.getServico().getIdServico());
			stmt.setInt(3, ordemDeServico.getSetor().getIdSetor());
			stmt.setInt(4, ordemDeServico.getEquipamento().getIdEquipamento());
			stmt.setInt(5, ordemDeServico.getSolicitante().getIdUsuario());
			// stmt.setString(7, ordemDeServico.getObs());
			// stmt.setInt(8, ordemDeServico.getGestor().getIdUsuario());
			int id = bd.executarSQLOS(stmt);
			ordemDeServico = getOrdemDeServico(id);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ordemDeServico;
	}

	public void atualizarOrdemDeServico(OrdemDeServico ordemDeServico) {
		try {
			System.out.println("ID: " + ordemDeServico.getIdOrdemServico());
			stmt = con.prepareStatement("update ordemdeservico "
					+ "set  idservico = ?, observacoes = ?"
					+ "where idordemdeservico=?");

			// stmt.setString(1, ordemDeServico.getDescricao());
			stmt.setInt(1, ordemDeServico.getServico().getIdServico());
			// stmt.setInt(3, ordemDeServico.getSetor().getIdSetor());
			stmt.setString(2, ordemDeServico.getObs());
			// stmt.setInt(5,
			// ordemDeServico.getEquipamento().getIdEquipamento());
			// stmt.setInt(6, ordemDeServico.getGestor().getIdUsuario());
			// stmt.setInt(7, ordemDeServico.getSolicitante().getIdUsuario());
			stmt.setInt(3, ordemDeServico.getIdOrdemServico());

			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluirOrdemDeServico(int idOrdemDeServico) {
		try {

			stmt = con
					.prepareStatement("delete from OrdemDeServico  where idOrdemDeServico = ?");
			stmt.setInt(1, idOrdemDeServico);
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<OrdemDeServico> getListarOrdemDeServico() {
		try {
			stmt = con.prepareStatement("select * from ordemdeservico");
			rs = bd.executarBuscaSQL(stmt);
			ordensDeServico = new ArrayList<OrdemDeServico>();

			while (rs.next()) {
				ordemDeServico = new OrdemDeServico();

				ordemDeServico.setIdOrdemServico(rs.getInt("idordemdeservico"));
				ordemDeServico.setDescricao(rs.getString("descricao"));
				ordemDeServico.setObs(rs.getString("observacoes"));
				ordemDeServico.setMotivoDevolucao(rs
						.getString("motivodevolucao"));
				ordemDeServico.setServico(servicoDAO.getServico(rs
						.getInt("idservico")));
				ordemDeServico
						.setSetor(setorDAO.getSetor(rs.getInt("idsetor")));
				ordemDeServico.setEquipamento(equipamentoDAO.getEquipamento(rs
						.getInt("idequipamento")));
				ordemDeServico.setGestor(gestorDAO.getGestor(rs
						.getInt("idgestor")));
				ordemDeServico.setSolicitante(solicitanteDAO.getSolicitante(rs
						.getInt("idsolicitante")));
				ordensDeServico.add(ordemDeServico);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ordensDeServico;
	}

	public OrdemDeServico getOrdemDeServico(int id) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("select * from ordemdeservico where idordemdeservico= ?");
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {

				ordemDeServico = new OrdemDeServico();

				ordemDeServico.setIdOrdemServico(rs.getInt("idordemdeservico"));
				ordemDeServico.setDescricao(rs.getString("descricao"));
				ordemDeServico.setObs(rs.getString("observacoes"));
				ordemDeServico.setMotivoDevolucao(rs
						.getString("motivodevolucao"));
				ordemDeServico.setServico(servicoDAO.getServico(rs
						.getInt("idservico")));
				ordemDeServico
						.setSetor(setorDAO.getSetor(rs.getInt("idsetor")));
				ordemDeServico.setEquipamento(equipamentoDAO.getEquipamento(rs
						.getInt("idequipamento")));
				ordemDeServico.setGestor(gestorDAO.getGestor(rs
						.getInt("idgestor")));
				ordemDeServico.setSolicitante(solicitanteDAO.getSolicitante(rs
						.getInt("idsolicitante")));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ordemDeServico;
	}

	public OrdemDeServico getOrdemDeServicoSolicitante(int idordemDeServico) {
		try {
			stmt = con
					.prepareStatement("SELECT * FROM ordemdeservico inner join "
							+ "situacao on situacao.idordemdeservico = ordemdeservico.idordemdeservico"
							+ " where ordemdeservico.idordemdeservico = ?");
			stmt.setInt(1, idordemDeServico);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {
				ordemDeServico = new OrdemDeServico();

				ordemDeServico.setIdOrdemServico(rs.getInt("idordemdeservico"));
				ordemDeServico.setDescricao(rs.getString("descricao"));
				ordemDeServico.setObs(rs.getString("observacoes"));
				ordemDeServico.setMotivoDevolucao(rs
						.getString("motivodevolucao"));
				Servico servico = servicoDAO.getServico(rs.getInt("idservico"));
				ordemDeServico.setServico(servico);
				Setor setor = setorDAO.getSetor(rs.getInt("idsetor"));
				ordemDeServico.setSetor(setor);
				Gestor gestor = gestorDAO.getGestor(rs.getInt("idgestor"));
				ordemDeServico.setGestor(gestor);
				Solicitante solicitante = solicitanteDAO.getSolicitante(rs
						.getInt("idsolicitante"));
				ordemDeServico.setSolicitante(solicitante);
				Equipamento equipamento = equipamentoDAO.getEquipamento(rs
						.getInt("idequipamento"));
				ordemDeServico.setEquipamento(equipamento);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ordemDeServico;
	}

	public List<OrdemDeServico> getListarOrdemDeServicoSituacao() {
		try {
			stmt = con
					.prepareStatement("SELECT * FROM ordemdeservico ;");
			rs = bd.executarBuscaSQL(stmt);
			ordensDeServico = new ArrayList<OrdemDeServico>();

			while (rs.next()) {
				ordemDeServico = new OrdemDeServico();

				ordemDeServico.setIdOrdemServico(rs.getInt("idordemdeservico"));
				ordemDeServico.setServico(servicoDAO.getServico(rs
						.getInt("idservico")));
				ordemDeServico.setSituacao(situacaoDAO.getSituacaoOS(rs
						.getInt("idordemdeservico")));
				ordemDeServico.setGestor(gestorDAO.getGestor(rs
						.getInt("idgestor")));
				ordemDeServico
						.setSetor(setorDAO.getSetor(rs.getInt("idsetor")));
				ordensDeServico.add(ordemDeServico);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ordensDeServico;
	}

}
