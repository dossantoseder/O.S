package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Status;
import modelo.facade.StatusFachada;
import controlador.Command;

public class StatusAtualizarCommand implements Command {

	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String nome = req.getParameter("nome");
		String descricao = req.getParameter("descricao");
		String idStatus = req.getParameter("idStatus");

		StatusFachada fachadaStatus = new StatusFachada();
		Status status = new Status();

		status.setNomeStatus(nome);
		status.setDescricao(descricao);
		status.setIdStatus(Integer.parseInt(idStatus));

		int SEM_ERRO = fachadaStatus.atualizarStatus(status);

		req.setAttribute("SEM_ERRO", SEM_ERRO);
		req.getRequestDispatcher("/editar_equipamento.jsp").forward(req, res);
	}

}
