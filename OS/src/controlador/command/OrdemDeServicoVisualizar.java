package controlador.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.OrdemDeServico;
import modelo.facade.OrdemDeServicoFachada;

/**
 * Servlet implementation class OrdemDeServicoVisualizar
 */
@WebServlet("/OrdemDeServicoVisualizar")
public class OrdemDeServicoVisualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;


	OrdemDeServicoFachada ordemDeServicoFacade = new OrdemDeServicoFachada();
	OrdemDeServico ordemDeServico;
	List<OrdemDeServico> ordemDeServicos;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
System.out.println("teste");
		ordemDeServico = ordemDeServicoFacade.getOrdemDeServico(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("listaos", ordemDeServicos);
		req.getRequestDispatcher("/VisualizarOSadmegestor.jsp").forward(req, res);

	}

}
