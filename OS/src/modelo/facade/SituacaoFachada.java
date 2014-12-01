package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class SituacaoFachada {
	Situacao situacao;
	SituacaoDAO situacaoDAO = new SituacaoDAO();
	List<Situacao> situacoes;

	/*
	 * private static EquipamentoFacade equipamentoFacade = null;
	 * 
	 * 
	 * public static EquipamentoFacade getInstance() { if (equipamentoFacade ==
	 * null) { equipamentoFacade = new EquipamentoFacade(); } return
	 * equipamentoFacade; }
	 */

	public List<Situacao> getListarSituacao() {

		situacoes = situacaoDAO.getListarSituacao();

		return situacoes;

	}

	public Situacao getSituacao(int idSituacao) {

		situacao = situacaoDAO.getSituacao(idSituacao);

		return situacao;
	}

	public List<Situacao> getListaSituacaoSolicitante(Usuario usuario) {

		situacoes = situacaoDAO.getSituacaoOSSolicitante(usuario);

		return situacoes;

	}

}
