package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Equipamento;
import modelo.facade.EquipamentoFachada;
import controlador.Command;

public class EquipamentoAtualizarCommand implements Command {

	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		String tombo = req.getParameter("tombo");
		String nomeEquipamento = req.getParameter("nomeEquipamento");
		String idEquipamento = req.getParameter("idEquipamento");

		EquipamentoFachada fachadaEQUI = new EquipamentoFachada();
		Equipamento equipamento = new Equipamento();

		equipamento.setNomeEquipamento(nomeEquipamento);
		equipamento.setTombo(tombo);
		equipamento.setIdEquipamento(Integer.parseInt(idEquipamento));

		int SEM_ERRO = fachadaEQUI.atualizarEquipamento(equipamento);

		req.setAttribute("SEM_ERRO", SEM_ERRO);
		req.getRequestDispatcher("/editar_equipamento.jsp")
				.forward(req, res);

	}

}
