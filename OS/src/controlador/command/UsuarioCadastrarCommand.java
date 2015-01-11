package controlador.command;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.OrdemDeServico;
import modelo.Usuario;
import modelo.facade.EquipamentoFachada;
import modelo.facade.ExecutorFachada;
import modelo.facade.GestorFachada;
import modelo.facade.OrdemDeServicoFachada;
import modelo.facade.ProdutoFachada;
import modelo.facade.ServicoFachada;
import modelo.facade.SetorFachada;
import modelo.facade.SituacaoFachada;
import modelo.facade.SolicitanteFachada;
import modelo.facade.UsuarioFachada;
import controlador.Command;

/**
 * Servlet implementation class UsuarioCadastrarCommand
 */
@WebServlet("/UsuarioCadastrarCommand")
public class UsuarioCadastrarCommand implements Command {
	Usuario usuario;
	String msg;

	public UsuarioCadastrarCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String nomeUsuario = req.getParameter("nome_usuario");
		String tipo = req.getParameter("tipo_usuario");
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		String senhaconfirmacao = req.getParameter("cofirmacao_senha");

		usuario = new Usuario();
		usuario.setTipo(Integer.parseInt(tipo));
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setNomeUsuario(nomeUsuario);
		usuario.setSenhaConfirmacao(senhaconfirmacao);

		UsuarioFachada usuarioFachada = new UsuarioFachada();

		int SEM_ERRO = usuarioFachada.cadastrarUsuario(usuario);

		req.setAttribute("SEM_ERRO", SEM_ERRO);
		req.getRequestDispatcher("/cadastrarUsuario_administrador.jsp")
				.forward(req, res);
		;

	}

	public void msg(HttpServletRequest req, HttpServletResponse res, String msg)
			throws Exception {
		req.setAttribute("msg", msg);

		// mudar a tela
		req.getRequestDispatcher("/cadastoOS.jsp").forward(req, res);
	}

}