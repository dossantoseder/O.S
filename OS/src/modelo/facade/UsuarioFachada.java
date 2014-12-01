package modelo.facade;

import java.util.List;

import modelo.Usuario;
import modelo.persiste.UsuarioDAO;

public class UsuarioFachada {

	Usuario usuario;
	List<Usuario> Usuarios;
	UsuarioDAO usuarioDAO = new UsuarioDAO();

	public void cadastrarUsuario(Usuario usuario) {
		usuarioDAO.cadastrarUsuario(usuario);

	}

	public void atualizarUsuario(Usuario usuario) {
		usuarioDAO.atualizarUsuario(usuario);

	}

	public void excluirUsuario(Usuario usuario) {
		usuarioDAO.excluirUsuario(usuario);

	}

	public void getUsuario(Usuario usuario) {
		usuarioDAO.getUsuario(usuario);

	}

	public void listaUsuarios() {
		usuarioDAO.listaUsuarios();

	}

	public Usuario autenticarUsuario(Usuario user) {
		usuario = usuarioDAO.autenticarUsuario(user);

		return usuario;

	}

}
