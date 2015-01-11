package controlador.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.OrdemDeServico;
import modelo.Servico;
import modelo.Setor;
import modelo.Status;
import modelo.facade.OrdemDeServicoFachada;
import modelo.facade.ServicoFachada;
import modelo.facade.SetorFachada;
import modelo.facade.StatusFachada;
import controlador.Command;

public class OrdemDeServicoDadosAtualizacao implements Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		int id=Integer.parseInt(req.getParameter("id"));
		SetorFachada setorFachada = new SetorFachada();
		ServicoFachada servicoFachada = new ServicoFachada();
		OrdemDeServicoFachada ordemDeServicoFachada = new OrdemDeServicoFachada();
		StatusFachada statusFachada = new StatusFachada();
		List<Setor> setores = setorFachada.getListarSetor();
		List<Servico> servicos = servicoFachada.getListarServico();
		List<Status> status = statusFachada.getListarStatus();
		OrdemDeServico os = ordemDeServicoFachada.getOrdemDeServico(id);
		
		req.setAttribute("listaser", servicos);
		req.setAttribute("listastatus", status);
		req.setAttribute("os", os);
		req.getRequestDispatcher("/EditarOS_administrador.jsp")
				.forward(req, res);
	}

}
