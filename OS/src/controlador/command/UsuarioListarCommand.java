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
public class UsuarioListarCommand implements Command{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		UsuarioFachada usuarioFachada = new UsuarioFachada();
		usuarioFachada.getListarUsuario();
		
		req.setAttribute("listausuario", usuarioFachada.getListarUsuario());
		req.getRequestDispatcher("/listarUsuario_administrador.jsp").forward(req, res);
		
	}
}