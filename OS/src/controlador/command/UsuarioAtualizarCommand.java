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
@WebServlet("/UsuarioAtualizarCommand")
public class UsuarioAtualizarCommand implements Command{
	Usuario usuario;
	String msg;

	public UsuarioAtualizarCommand() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String nomeUsuario = req.getParameter("nomeUsuario");
		String tipo = req.getParameter("tipo");
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
	
		usuario=new Usuario();
		
		usuario=new Usuario();
		usuario.setTipo(Integer.parseInt(tipo));
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setNomeUsuario(nomeUsuario);
		
		UsuarioFachada usuarioFachada =new UsuarioFachada();
		
		usuarioFachada.atualizarUsuario(usuario);
		
		msg = "Usuário atualizado com sucesso";
		
		

	}

	public void msg(HttpServletRequest req, HttpServletResponse res, String msg)
			throws Exception {
		req.setAttribute("msg", msg);
		
		// mudar a tela
		req.getRequestDispatcher("/cadastoOS.jsp").forward(req, res);
	}

}