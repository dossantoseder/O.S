package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class EquipamentoFachada {
	Equipamento equipamento;
	EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
	List<Equipamento> equipamentos;
	/*private static EquipamentoFacade equipamentoFacade = null;


	public static EquipamentoFacade getInstance() {
		if (equipamentoFacade == null) {
			equipamentoFacade = new EquipamentoFacade();
		}
		return equipamentoFacade;
	}*/

	
	public List<Equipamento> getListarEquipamento() {

		equipamentos = equipamentoDAO.getListarEquipamento();

		return equipamentos;

	}

	public Equipamento getEquipamento(int idEquipamento) {

		equipamento = equipamentoDAO.getEquipamento(idEquipamento);

		return equipamento;
	}

}
