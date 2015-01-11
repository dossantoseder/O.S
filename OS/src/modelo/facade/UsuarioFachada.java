package modelo.facade;

import java.util.List;

import modelo.Setor;
import modelo.Usuario;
import modelo.persiste.UsuarioDAO;

public class UsuarioFachada {

	Usuario usuario;
	List<Usuario> usuarios;
	UsuarioDAO usuarioDAO = new UsuarioDAO();

	public int  cadastrarUsuario(Usuario usuario) {
		int valida = -1;
		valida = usuarioDAO.cadastrarUsuario(usuario);
		return valida;
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

	public Usuario getUsuarioID(int idUusuario) {
		usuario = usuarioDAO.getUsuarioID(idUusuario);
		
		return usuario;

	}

	public void listaUsuarios() {
		usuarioDAO.listaUsuarios();

	}
	

	public List<Usuario> getListarUsuario() {
		usuarios = usuarioDAO.getListarUsuario();
		return usuarios;
	}

	public Usuario autenticarUsuario(Usuario user) {
		usuario = usuarioDAO.autenticarUsuario(user);

		return usuario;

	}

}
