 package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class StatusFachada {
	Status status;
	StatusDAO statusDAO = new StatusDAO();
	List<Status> listaStatus;

	public int cadastrarStatus(Status status) {
		int SEM_ERRO = this.statusDAO.cadastrarStatus(status);
		return SEM_ERRO;
	}

	public int atualizarStatus(Status status) {
		int SEM_ERRO = this.statusDAO.atualizarStatus(status);
		return SEM_ERRO;
	}
	public List<Status> getListarStatus() {

		listaStatus = statusDAO.getListarStatus();

		return listaStatus;

	}

	public Status getStatus(int idStatus) {

		status = statusDAO.getStatus(idStatus);

		return status;
	}

}
