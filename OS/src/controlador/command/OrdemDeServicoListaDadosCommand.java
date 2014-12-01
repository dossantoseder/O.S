package controlador.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.facade.EquipamentoFachada;
import modelo.facade.OrdemDeServicoFachada;
import modelo.facade.ServicoFachada;
import modelo.facade.SetorFachada;
import modelo.facade.SolicitanteFachada;
import modelo.facade.StatusFachada;
import controlador.Command;

/**
 * Servlet implementation class OrdemDeServicoListaDadosCommand
 */
@WebServlet("/OrdemDeServicoListaDadosCommand")
public class OrdemDeServicoListaDadosCommand extends HttpServlet implements
		Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		SolicitanteFachada solicitanteFachada = new SolicitanteFachada();
		SetorFachada setorFachada = new SetorFachada();
		ServicoFachada servicoFachada = new ServicoFachada();
		EquipamentoFachada equipamentoFachada = new EquipamentoFachada();
		System.out.println("aqui");
		req.setAttribute("listasol", solicitanteFachada.getListarSolicitante());
		req.setAttribute("listaset", setorFachada.getListarSetor());
		req.setAttribute("listaser", servicoFachada.getListarServico());
		req.setAttribute("listaequi", equipamentoFachada.getListarEquipamento());
		req.getRequestDispatcher("/cadastrarOS.jsp").forward(req, res);

	}

}
