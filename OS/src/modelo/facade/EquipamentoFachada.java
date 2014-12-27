package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class EquipamentoFachada {
	Equipamento equipamento;
	EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
	List<Equipamento> equipamentos;

	public void cadastrarEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public void atualizarEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
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
