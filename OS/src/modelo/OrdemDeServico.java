package modelo;


public class OrdemDeServico {
	
	int  idOrdemServico;  
	String descricao;
	Servico servico;
	Setor setor;
	String motDevolucao;
	String obs;
	Equipamento equipamento;
	Produto produto;
	Gestor gestor;


	void cancelarOS(){
		
	}
	void verStatus(){
		
	}
	//void incluirSolicitante(Solicitante solicitante){}
	void devolverOS(String motivo){
		
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
	public String getMotDevolucao() {
		return motDevolucao;
	}
	public void setMotDevolucao(String motDevolucao) {
		this.motDevolucao = motDevolucao;
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
	


}

