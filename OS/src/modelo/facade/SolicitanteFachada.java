package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class SolicitanteFachada {
	Solicitante solicitante;
	SolicitanteDAO solicitanteDAO = new SolicitanteDAO();
	List<Solicitante> solicitantes;

	/*
	 * private static EquipamentoFacade equipamentoFacade = null;
	 * 
	 * 
	 * public static EquipamentoFacade getInstance() { if (equipamentoFacade ==
	 * null) { equipamentoFacade = new EquipamentoFacade(); } return
	 * equipamentoFacade; }
	 */

	public List<Solicitante> getListarSolicitante() {

		solicitantes = solicitanteDAO.getListarSolicitante();

		return solicitantes;

	}

	public Solicitante getSolicitante(int idSolicitante) {

		solicitante = solicitanteDAO.getSolicitante(idSolicitante);

		return solicitante;
	}

}
