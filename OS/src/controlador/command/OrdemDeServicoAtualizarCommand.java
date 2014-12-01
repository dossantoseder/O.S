package controlador.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.OrdemDeServico;
import modelo.facade.*;
import controlador.Command;

/**
 * Servlet implementation class OrdemDeServicoAtualizarCommand
 */
@WebServlet("/OrdemDeServicoAtualizarCommand")
public class OrdemDeServicoAtualizarCommand extends HttpServlet implements
		Command {
	OrdemDeServicoFachada ordemDeServicoFacade = new OrdemDeServicoFachada();
	OrdemDeServico ordemDeServico;
	ServicoFachada servicoFachada = new ServicoFachada();
	SetorFachada setorFachada = new SetorFachada();
	EquipamentoFachada equipamentoFachada = new EquipamentoFachada();
	ProdutoFachada produtoFachada = new ProdutoFachada();
	GestorFachada gestorFachada = new GestorFachada();
	ExecutorFachada executorFachada = new ExecutorFachada();
	SolicitanteFachada solicitanteFachada = new SolicitanteFachada();
	SituacaoFachada situacaoFachada = new SituacaoFachada();
	String msg;

	public OrdemDeServicoAtualizarCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		//String descrcao = req.getParameter("descricao");
		String servico = req.getParameter("idservico");
		String idordemdeservico = req.getParameter("idordemdeservico");
		//String setor = req.getParameter("idsetor");
		//String motivodevolucao = req.getParameter("motivodevolucao");
		String observacoes = req.getParameter("observacoes");
		//String equipamento = req.getParameter("idequipamento");
		//String produto = req.getParameter("idproduto");
		//String gestor = req.getParameter("idgestor");
		//String executor = req.getParameter("idexecutor");
		//String solicitante = req.getParameter("idsolicitante");
		String situacao = req.getParameter("idstatus");
		ordemDeServico = new OrdemDeServico();
		//ordemDeServico.setDescricao(descrcao);
		ordemDeServico.setServico(servicoFachada.getServico(Integer.parseInt(servico)));
		//ordemDeServico
			//	.setSetor(setorFachada.getSetor(Integer.parseInt(setor)));
		//ordemDeServico.setMotivoDevolucao(motivodevolucao); só deve existir na atualização
		ordemDeServico.setObs(observacoes);
		//ordemDeServico.setEquipamento(equipamentoFachada.getEquipamento(Integer.parseInt(equipamento)));
		//ordemDeServico.setGestor(gestorFachada.getGestor(Integer.parseInt(gestor)));
		//ordemDeServico.setSolicitante(solicitanteFachada.getSolicitante(Integer.parseInt(solicitante)));
		//ordemDeServico.setSituacao(situacaoFachada.getSituacao(Integer.parseInt(situacao)));
		ordemDeServico.setIdOrdemServico(Integer.parseInt(idordemdeservico));
		ordemDeServicoFacade.atualizarOrdemDeServico(ordemDeServico);
		
		msg = "Ordem de Serviço Atualizada com sucesso";
		
		msg(req, res, msg);

	}

	public void msg(HttpServletRequest req, HttpServletResponse res, String msg)
			throws Exception {
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("/paginaInformacao.jsp").forward(req, res);
	}

}
