package modelo;

import java.util.Date;

public class Situacao {

	private int idSituacao;
	private Status status;
	private Date dataOS;
	private Administrador administrador;
	private OrdemDeServico  ordemDeServico;
	
	public Situacao(OrdemDeServico  ordemDeServico){
		this.ordemDeServico = ordemDeServico;
	}

	public int getIdSituacao() {
		return idSituacao;
	}

	public void setIdSituacao(int idSituacao) {
		this.idSituacao = idSituacao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getDataOS() {
		return dataOS;
	}

	public void setDataOS(Date dataOS) {
		this.dataOS = dataOS;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public OrdemDeServico getOrdemDeServico() {
		return ordemDeServico;
	}

	public void setOrdemDeServico(OrdemDeServico ordemDeServico) {
		this.ordemDeServico = ordemDeServico;
	}

	
}
