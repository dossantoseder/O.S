package modelo;

public class Equipamento {
	public int idEquipamento;
	public String tombo;
	public TipoDeEquipamento tipoDeEquipamento;

	public int getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(int idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public String getTombo() {
		return tombo;
	}

	public void setTombo(String tombo) {
		this.tombo = tombo;
	}

	public TipoDeEquipamento getTipoDeEquipamento() {
		return tipoDeEquipamento;
	}

	public void setTipoDeEquipamento(TipoDeEquipamento tipoDeEquipamento) {
		this.tipoDeEquipamento = tipoDeEquipamento;
	}

}
