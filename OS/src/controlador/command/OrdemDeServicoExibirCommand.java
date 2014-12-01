package controlador.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.OrdemDeServico;
import modelo.facade.*;
import controlador.Command;

/**
 * Servlet implementation class OrdemDeServicoExibirCommand
 */
@WebServlet("/OrdemDeServicoExibirCommand")
public class OrdemDeServicoExibirCommand extends HttpServlet implements Command {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrdemDeServicoExibirCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	OrdemDeServicoFachada ordemDeServicoFacade = new OrdemDeServicoFachada();
	OrdemDeServico ordemDeServico;
	List<OrdemDeServico> ordemDeServicos;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		ordemDeServicos = ordemDeServicoFacade.getOrdemDeServicos();
		req.setAttribute("listaos", ordemDeServicos);
		req.getRequestDispatcher("/listaros.jsp").forward(req, res);

	}

}
