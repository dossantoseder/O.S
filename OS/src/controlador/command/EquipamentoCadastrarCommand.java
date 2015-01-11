package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Equipamento;
import modelo.facade.EquipamentoFachada;
import controlador.Command;

public class EquipamentoCadastrarCommand implements Command {

	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		String tombo = req.getParameter("tombo");
		String nomeEquipamento = req.getParameter("nome_equipamento");

		EquipamentoFachada fachadaEQUI = new EquipamentoFachada();
		Equipamento equipamento = new Equipamento();

		equipamento.setNomeEquipamento(nomeEquipamento);
		equipamento.setTombo(tombo);

		int SEM_ERRO = fachadaEQUI.cadastrarEquipamento(equipamento);

		req.setAttribute("SEM_ERRO", SEM_ERRO);
		req.getRequestDispatcher("/cadastrarEquipamento_administrador.jsp")
				.forward(req, res);

	}

}
