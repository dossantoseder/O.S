package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class SetorFachada {

	Setor setor;
	SetorDAO setorDAO = new SetorDAO();
	List<Setor> setores;
	/*private static EquipamentoFacade equipamentoFacade = null;


	public static EquipamentoFacade getInstance() {
		if (equipamentoFacade == null) {
			equipamentoFacade = new EquipamentoFacade();
		}
		return equipamentoFacade;
	}*/

	
	public List<Setor> getListarSetor() {

		setores = setorDAO.getListarSetor();

		return setores;

	}

	public Setor getSetor(int idSetor) {

		setor = setorDAO.getSetor(idSetor);

		return setor;
	}

	public Setor getSetor(Setor setor) {
		return null;
	}
	
}
