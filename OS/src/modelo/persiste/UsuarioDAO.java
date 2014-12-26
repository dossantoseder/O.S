package modelo.persiste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class UsuarioDAO {
	ResultSet rs;
	Connection con;
	PreparedStatement stmt;
	Usuario usuario;
	List<Usuario> usuarios;
	static ConexaoSingleton bd = ConexaoSingleton.getInstance();

	public UsuarioDAO() {

		con = bd.getConexao();

	}

	/**
	 * Método usado para inserir um osuário no banco de dados
	 **/
	public void cadastrarUsuario(Usuario usuario) {
		try {
			stmt = con.prepareStatement("insert into"
					+ " usuario set login = ?, senha = ?");
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void atualizarUsuario(Usuario usuario) {
		try {
			stmt = con
					.prepareStatement("update usuario set login=?, senha=? where idsuario = ?");

			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			stmt.setInt(3, usuario.getIdUsuario());

			bd.executarSQL(stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Usuario autenticarUsuario(Usuario user) {

		try {
			stmt = con.prepareStatement("SELECT * FROM usuario "
					+ " where login = ? and senha = ? ");
			stmt.setString(1, user.getLogin());
			stmt.setString(2, user.getSenha());
			rs = bd.executarBuscaSQL(stmt);

			if (rs.next()) {

				usuario = new Usuario();

				usuario.setTipo(rs.getInt("idtipousuario"));
				usuario.setLogin(rs.getString("login"));
				usuario.setNomeUsuario(rs.getString("nomeusuario"));
				usuario.setIdUsuario(rs.getInt("idusuario"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuario;
	}

	public Usuario getUsuario(Usuario user) {

		try {
			stmt = con.prepareStatement("SELECT * FROM usuario "
					+ " where idusuario = ? ");

			stmt.setInt(1, user.getIdUsuario());
			rs = bd.executarBuscaSQL(stmt);
			if (rs.next()) {

				usuario = new Usuario();

				usuario.setTipo(rs.getInt("idtipousuario"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuario;
	}

	public Usuario getUsuarioID(int idUsuario) {

		try {
			stmt = con.prepareStatement("SELECT * FROM usuario "
					+ " where idusuario = ? ");

			stmt.setInt(1, idUsuario);
			rs = bd.executarBuscaSQL(stmt);
			if (rs.next()) {

				usuario = new Usuario();

				usuario.setTipo(rs.getInt("idtipousuario"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setIdUsuario(rs.getInt("idusuario"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuario;
	}

	public List<Usuario> listaUsuarios() {

		try {
			stmt = con.prepareStatement("SELECT * FROM usuario");

			rs = bd.executarBuscaSQL(stmt);
			usuarios = new ArrayList<Usuario>();

			if (rs.next()) {

				usuario = new Usuario();

				usuario.setTipo(rs.getInt("idtipo"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuarios.add(usuario);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuarios;
	}

	public void excluirUsuario(Usuario usuario) {
		try {

			stmt = con
					.prepareStatement("delete from usuario where idusuario= ?");
			stmt.setInt(1, usuario.getIdUsuario());
			bd.executarSQL(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
