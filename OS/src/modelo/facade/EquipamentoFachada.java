package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class EquipamentoFachada {
	Equipamento equipamento;
	EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
	List<Equipamento> equipamentos;

	public int cadastrarEquipamento(Equipamento equipamento) {
		int SEM_ERRO = this.equipamentoDAO.cadastrarEquipamento(equipamento);
		return SEM_ERRO;
	}

	public int atualizarEquipamento(Equipamento equipamento) {
		int SEM_ERRO = this.equipamentoDAO.atualizarEquipamento(equipamento);
		return SEM_ERRO;
	}

	public List<Equipamento> getListarEquipamento() {
		equipamentos = equipamentoDAO.getListarEquipamento();
		return equipamentos;
	}

	public Equipamento getEquipamento(int idEquipamento) {
		equipamento = equipamentoDAO.getEquipamento(idEquipamento);
		return equipamento;
	}

}
