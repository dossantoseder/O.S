package controlador.command;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.OrdemDeServico;
import modelo.facade.EquipamentoFachada;
import modelo.facade.ExecutorFachada;
import modelo.facade.GestorFachada;
import modelo.facade.OrdemDeServicoFachada;
import modelo.facade.ProdutoFachada;
import modelo.facade.ServicoFachada;
import modelo.facade.SetorFachada;
import modelo.facade.SituacaoFachada;
import modelo.facade.SolicitanteFachada;
import controlador.Command;

/**
 * Servlet implementation class OrdemDeServicoCadastrarCommand
 */
@WebServlet("/OrdemDeServicoCadastrarCommand")
public class OrdemDeServicoCadastrarCommand extends HttpServlet implements Command{
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
    public OrdemDeServicoCadastrarCommand() {
        super();
    }

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String descrcao = req.getParameter("descricao");
		String servico = req.getParameter("idservico");
		String setor = req.getParameter("idsetor");
		//String motivodevolucao = req.getParameter("motivodevolucao");
		String observacoes = req.getParameter("observacoes");
		String equipamento = req.getParameter("idequipamento");
		//String produto = req.getParameter("idproduto");
		//String gestor = req.getParameter("idgestor");
		//String executor = req.getParameter("idexecutor");
		String solicitante = req.getParameter("idsolicitante");
		//String situacao = req.getParameter("idsituacao");
		
		/*Calendar data = Calendar.getInstance();  
		Date d = (Date) data.getTime();  
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		dateFormat.format(d); */
		
		ordemDeServico = new OrdemDeServico();
		ordemDeServico.setDescricao(descrcao);
		ordemDeServico.setServico(servicoFachada.getServico(Integer.parseInt(servico)));
		ordemDeServico
				.setSetor(setorFachada.getSetor(Integer.parseInt(setor)));
		//ordemDeServico.setMotivoDevolucao(motivodevolucao); só deve existir na atualização
		ordemDeServico.setObs(observacoes);
		ordemDeServico.setEquipamento(equipamentoFachada.getEquipamento(Integer.parseInt(equipamento)));
		//ordemDeServico.setGestor(gestorFachada.getGestor(Integer.parseInt(gestor)));
		ordemDeServico.setSolicitante(solicitanteFachada.getSolicitante(Integer.parseInt(solicitante)));
		//ordemDeServico.setSituacao(situacaoFachada.getSituacao(Integer.parseInt(situacao)));
		
		ordemDeServicoFacade.cadastrarOrdemDeServico(ordemDeServico);
		msg = "Ordem de Serviço cadastrada com sucesso";

	}

	public void msg(HttpServletRequest req, HttpServletResponse res, String msg)
			throws Exception {
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("/cadastoOS.jsp").forward(req, res);
	}

}
