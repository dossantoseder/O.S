 package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class StatusFachada {
	Status status;
	StatusDAO statusDAO = new StatusDAO();
	List<Status> listaStatus;

	/*
	 * private static EquipamentoFacade equipamentoFacade = null;
	 * 
	 * 
	 * public static EquipamentoFacade getInstance() { if (equipamentoFacade ==
	 * null) { equipamentoFacade = new EquipamentoFacade(); } return
	 * equipamentoFacade; }
	 */

	public List<Status> getListarStatus() {

		listaStatus = statusDAO.getListarStatus();

		return listaStatus;

	}

	public Status getStatus(int idStatus) {

		status = statusDAO.getStatus(idStatus);

		return status;
	}

}
