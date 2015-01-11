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
import modelo.Setor;
import modelo.facade.EquipamentoFachada;
import modelo.facade.ExecutorFachada;
import modelo.facade.GestorFachada;
import modelo.facade.OrdemDeServicoFachada;
import modelo.facade.ProdutoFachada;
import modelo.facade.ServicoFachada;
import modelo.facade.SetorFachada;
import modelo.facade.SituacaoFachada;
import modelo.facade.SolicitanteFachada;
import controlador.Command;

/**
 * Servlet implementation class UsuarioCadastrarCommand
 */
@WebServlet("/SetorCadastrarCommand")
public class SetorCadastrarCommand implements Command {
	Setor setor;
	String msg;

	public SetorCadastrarCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String nomeSetor = req.getParameter("nome_setor");

		setor = new Setor();

		setor.setNomeSetor(nomeSetor);

		SetorFachada setorFachada = new SetorFachada();

		int SEM_ERRO = setorFachada.cadastrarSetor(setor);

		req.setAttribute("SEM_ERRO", SEM_ERRO);
		req.getRequestDispatcher("/cadastrarSetor_administrador.jsp")
				.forward(req, res);

	}

	public void msg(HttpServletRequest req, HttpServletResponse res, String msg)
			throws Exception {
		req.setAttribute("msg", msg);

		// mudar a tela
		req.getRequestDispatcher("/cadastrarServico_administrador.jsp")
				.forward(req, res);
	}

}