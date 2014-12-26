package modelo;

import java.util.List;

public class OrdemDeServico {

	int idOrdemServico;
	String descricao;
	Servico servico;
	Setor setor;
	String motivoDevolucao;
	String obs;
	Equipamento equipamento;
	Produto produto;
	Gestor gestor;
	Solicitante solicitante;
	Executor executor;
	List<Situacao> situacoes;
	Situacao situacao;

	void cancelarOS() {

	}

	void verStatus() {

	}

	// void incluirSolicitante(Solicitante solicitante){}
	void devolverOS(String motivo) {

	}

	public int getIdOrdemServico() {
		return idOrdemServico;
	}

	public void setIdOrdemServico(int idOrdemServico) {
		this.idOrdemServico = idOrdemServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String getMotivoDevolucao() {
		return motivoDevolucao;
	}

	public void setMotivoDevolucao(String motivoDevolucao) {
		this.motivoDevolucao = motivoDevolucao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProtudo(Produto produto) {
		this.produto = produto;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Executor getExecutor() {
		return executor;
	}

	public void setExecutor(Executor executor) {
		this.executor = executor;
	}

	public List<Situacao> getSituacoes() {
		return situacoes;
	}

	public void setSituacoes(Situacao situacao) {
		this.situacoes.add(situacao);
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

}
