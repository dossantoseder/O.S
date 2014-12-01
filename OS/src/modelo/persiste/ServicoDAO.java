package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class ServicoDAO {
	Connection con;
	PreparedStatement stmt;
	Servico servico;
	ResultSet rs;
	List<Servico> servicos;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public ServicoDAO() {

		con = bd.getConexao();

	}

	public List<Servico> getListarServico() {
		try {
			stmt = con.prepareStatement("select * from Servico");
			rs = bd.executarBuscaSQL(stmt);
			servicos = new ArrayList<Servico>();

			while (rs.next()) {
				servico = new Servico();

				servico.setIdServico(rs.getInt("idservico"));
				servico.setNomeServico(rs.getString("nomeservico"));

				servicos.add(servico);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return servicos;
	}

	public Servico getServico(int id) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("select * from servico where idservico= ?");
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {
				servico = new Servico();

				servico.setIdServico(rs.getInt("idservico"));
				servico.setNomeServico(rs.getString("nomeservico"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (servico.equals(null))
			System.out.println("A");
		else
			System.out.println("B");
		return servico;
	}

}
