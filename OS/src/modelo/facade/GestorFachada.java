package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class GestorFachada {
	Gestor gestor;
	GestorDAO gestorDAO = new GestorDAO();
	List<Gestor> gestores;

	/*
	 * private static EquipamentoFacade equipamentoFacade = null;
	 * 
	 * 
	 * public static EquipamentoFacade getInstance() { if (equipamentoFacade ==
	 * null) { equipamentoFacade = new EquipamentoFacade(); } return
	 * equipamentoFacade; }
	 */

	public List<Gestor> getListarGestor() {

		gestores = gestorDAO.getListarGestor();

		return gestores;

	}

	public Gestor getGestor(int idGestor) {

		gestor = gestorDAO.getGestor(idGestor);

		return gestor;
	}

}
