package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class SolicitanteDAO {
	Connection con;
	PreparedStatement stmt;
	Solicitante solicitante;
	ResultSet rs;
	List<Solicitante> solicitantes;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public SolicitanteDAO() {

		con = bd.getConexao();

	}

	public List<Solicitante> getListarSolicitante() {
		try {
			stmt = con.prepareStatement("select * from usuario");
			rs = bd.executarBuscaSQL(stmt);
			solicitantes = new ArrayList<Solicitante>();

			while (rs.next()) {
				solicitante = new Solicitante();

				solicitante.setIdUsuario(rs.getInt("idusuario"));
				solicitante.setNomeUsuario(rs.getString("nomeusuario"));
				solicitantes.add(solicitante);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return solicitantes;
	}

	public Solicitante getSolicitante(int id) {
		ResultSet rs = null;
		try {
			stmt = con
					.prepareStatement("select * from usuario where idusuario= ?");
			stmt.setInt(1, id);
			rs = bd.executarBuscaSQL(stmt);

			while (rs.next()) {

				solicitante = new Solicitante();

				solicitante.setIdUsuario(rs.getInt("idusuario"));
				solicitante.setNomeUsuario(rs.getString("nomeusuario"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return solicitante;
	}

}
