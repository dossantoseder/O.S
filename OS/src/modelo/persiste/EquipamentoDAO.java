package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class EquipamentoDAO {
	Connection con;
	PreparedStatement stmt;
	Equipamento equipamento;
	ResultSet rs;
	List<Equipamento> equipamentos;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public EquipamentoDAO() {

		con = bd.getConexao();

	}

	public void cadastrarEquipamento(Equipamento equipamento) {
		try {

			stmt = con
					.prepareStatement("insert into equipamento(tombo,idtipoequipamento) values(?,?)");

			stmt.setString(1, equipamento.getTombo());
			stmt.setInt(2, equipamento.getTipoDeEquipamento()
					.getIdTipoDeEquipamento());
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void atualizarEquipamento(Equipamento equipamento) {
		try {

			stmt = con
					.prepareStatement("update equipamento set tombo = ?, idtipoequipamento = ? "
							+ "where idequipamento=?");

			stmt.setString(1, equipamento.getTombo());

			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluirSetor(int idEquipamento) {
		try {

			stmt = con
					.prepareStatement("delete from equipamento where idequipamento = ?");
			stmt.setInt(1, idEquipamento);
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Equipamento> getListarEquipamento() {
		try {
			stmt = con.prepareStatement("select * from equipamento");
			rs = bd.executarBuscaSQL(stmt);
			equipamentos = new ArrayList<Equipamento>();

			while (rs.next()) {
				equipamento = new Equipamento();

				equipamento.setIdEquipamento(rs.getInt("idequipamento"));
				equipamento.setNomeEquipamento(rs.getString("nomeequipamento"));
				equipamentos.add(equipamento);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equipamentos;
	}

	public Equipamento getEquipamento(int id) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("select * from equipamento where idequipamento= ?");
			stmt.setInt(1, id);
			rs  = bd.executarBuscaSQL(stmt);

			while (rs.next()) {

				equipamento = new Equipamento();

				equipamento.setIdEquipamento(rs.getInt("idequipamento"));
				equipamento.setTombo(rs.getString("nomeequipamento"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equipamento;
	}

}
