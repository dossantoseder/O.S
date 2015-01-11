package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

//criar um objeto serviço a partir de um identificador
public class TipoDeServicoFachada {
	TipoDeServico tipoDeServico;
	TipoDeServicoDAO tipoDeServicoDAO = new TipoDeServicoDAO();
	List<TipoDeServico> tipoDeServicos;

	public int cadastrarTipoDeServico(TipoDeServico tipoDeServico) {
		int valida = -1;
		valida = tipoDeServicoDAO.cadastrarServico(tipoDeServico);
		return valida;

	}

	public void atualizarTipoDeServico(TipoDeServico tipoDeServico) {
		tipoDeServicoDAO.atualizarTipoDeServico(tipoDeServico);

	}

	public void excluirTipoDeServico(int tipoDeServico) {
		tipoDeServicoDAO.excluirTipoDeServico(tipoDeServico);

	}

	public List<TipoDeServico> getListarTipoDeServico() {

		tipoDeServicos = tipoDeServicoDAO.getListarTipoDeServico();

		return tipoDeServicos;

	}

	public TipoDeServico getTipoDeServico(int idTipoDeServico) {

		tipoDeServico = tipoDeServicoDAO.getTipoServico(idTipoDeServico);

		return tipoDeServico;
	}

	public Servico getOrdemDeServico(Servico servico) {
		return null;
	}

}
