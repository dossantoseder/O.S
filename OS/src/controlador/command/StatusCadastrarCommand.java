package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Status;
import modelo.facade.StatusFachada;
import controlador.Command;

public class StatusCadastrarCommand implements Command {

	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String nome = req.getParameter("nome");
		String descricao = req.getParameter("descricao");

		StatusFachada fachadaStatus = new StatusFachada();
		Status status = new Status();

		status.setNomeStatus(nome);
		status.setDescricao(descricao);

		int SEM_ERRO = fachadaStatus.cadastrarStatus(status);

		req.setAttribute("SEM_ERRO", SEM_ERRO);
		req.getRequestDispatcher("/cadastrar_equipamento.jsp")
				.forward(req, res);
	}

}
