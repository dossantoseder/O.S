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

	public int cadastrarEquipamento(Equipamento equipamento) {
		int SEM_ERRO = -1;
		try {

			stmt = con
					.prepareStatement("insert into equipamento(nomeequipamento, tombo) values(?,?)");

			stmt.setString(1, equipamento.getNomeEquipamento());
			stmt.setString(2, equipamento.getTombo());
			SEM_ERRO = bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SEM_ERRO;
	}

	public int atualizarEquipamento(Equipamento equipamento) {
		int SEM_ERRO = -1;
		try {

			stmt = con
					.prepareStatement("update equipamento set nomeequipamento = ?, tombo = ?, idtipoequipamento = ? "
							+ "where idequipamento=?");

			stmt.setString(1, equipamento.getNomeEquipamento());
			stmt.setString(2, equipamento.getTombo());
			stmt.setInt(1, equipamento.getIdEquipamento());

			SEM_ERRO = bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SEM_ERRO;
	}

	public int excluirSetor(int idEquipamento) {
		int SEM_ERRO = -1;
		try {

			stmt = con
					.prepareStatement("delete from equipamento where idequipamento = ?");
			stmt.setInt(1, idEquipamento);
			SEM_ERRO = bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SEM_ERRO;
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
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {

				equipamento = new Equipamento();

				equipamento.setIdEquipamento(rs.getInt("idequipamento"));
				equipamento.setNomeEquipamento(rs.getString("nomeequipamento"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equipamento;
	}

}
