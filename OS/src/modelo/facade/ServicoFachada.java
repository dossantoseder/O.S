package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

//criar um objeto serviço a partir de um identificador
public class ServicoFachada {
	Servico servico;
	ServicoDAO servicoDAO = new ServicoDAO();
	List<Servico> servicos;

	/*
	 * private static EquipamentoFacade equipamentoFacade = null;
	 * 
	 * 
	 * public static EquipamentoFacade getInstance() { if (equipamentoFacade ==
	 * null) { equipamentoFacade = new EquipamentoFacade(); } return
	 * equipamentoFacade; }
	 */

	public List<Servico> getListarServico() {

		servicos = servicoDAO.getListarServico();

		return servicos;

	}

	public Servico getServico(int idServico) {

		servico = servicoDAO.getServico(idServico);

		return servico;
	}

	public Servico getOrdemDeServico(Servico servico) {
		return null;
	}

}
