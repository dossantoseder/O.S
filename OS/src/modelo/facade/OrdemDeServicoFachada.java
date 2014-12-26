package modelo.facade;

import java.util.ArrayList;
import java.util.List;

import modelo.OrdemDeServico;
import modelo.Setor;
import modelo.persiste.OrdemDeServicoDAO;

public class OrdemDeServicoFachada {
	OrdemDeServico ordemDeServico;
	OrdemDeServicoDAO ordemDeServicoDAO = new OrdemDeServicoDAO();
	List<OrdemDeServico> ordemDeServicos = new ArrayList<OrdemDeServico>();

	public void cadastrarOrdemDeServico(OrdemDeServico ordemDeServico) {
		ordemDeServicoDAO.cadastrarOrdemDeServico(ordemDeServico);
	}

	public void atualizarOrdemDeServico(OrdemDeServico ordemDeServico) {
		ordemDeServicoDAO.atualizarOrdemDeServico(ordemDeServico);
	}

	public void excluirOrdemDeServico(OrdemDeServico ordemDeServico) {
	}

	public List<OrdemDeServico> getOrdemDeServicos() {

		// ordemDeServicos = ordemDeServicoDAO.getListarOrdemDeServico();
		ordemDeServicos = ordemDeServicoDAO.getListarOrdemDeServicoSituacao();

		return ordemDeServicos;
	}

	public OrdemDeServico getOrdemDeServico(OrdemDeServico ordemDeServico) {
		return null;
	}

	public OrdemDeServico getOrdemDeServico(int idordemDeServico) {
		//ordemDeServico = ordemDeServicoDAO.getOrdemDeServico(idordemDeServico);
		ordemDeServico = ordemDeServicoDAO.getOrdemDeServicoSolicitante(idordemDeServico);
		return ordemDeServico;
	}

}
