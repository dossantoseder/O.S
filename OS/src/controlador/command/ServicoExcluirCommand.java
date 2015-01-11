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
import modelo.Servico;
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
@WebServlet("/ServicoExcluirCommand")
public class ServicoExcluirCommand implements Command {
	Servico servico;
	String msg;

	public ServicoExcluirCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		String idServico = req.getParameter("idServico");
		String nomeServico = req.getParameter("nomeServico");

		servico = new Servico();

		servico.setNomeServico(nomeServico);
		servico.setIdServico(Integer.parseInt(idServico));

		ServicoFachada servicoFachada = new ServicoFachada();

		servicoFachada.excluirServico(servico);

		msg = "Servico Excluir com sucesso";

	}

	public void msg(HttpServletRequest req, HttpServletResponse res, String msg)
			throws Exception {
		req.setAttribute("msg", msg);

		// mudar a tela
		req.getRequestDispatcher("/cadastoOS.jsp").forward(req, res);
	}

}
