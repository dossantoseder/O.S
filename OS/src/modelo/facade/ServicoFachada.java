package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

//criar um objeto serviço a partir de um identificador
public class ServicoFachada {
	Servico servico;
	ServicoDAO servicoDAO = new ServicoDAO();
	List<Servico> servicos;
	
	
	public int cadastrarServico(Servico servico) {
		int valida = -1;
		valida = servicoDAO.cadastrarServico(servico);
		return valida;

	}

	public void atualizarServico(Servico servico) {
		servicoDAO.atualizarServico(servico);

	}

	public void excluirServico(Servico servico) {
		servicoDAO.excluirServico(servico);

	}

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
