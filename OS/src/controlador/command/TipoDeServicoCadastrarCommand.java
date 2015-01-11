package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Servico;
import modelo.TipoDeServico;
import modelo.facade.ServicoFachada;
import modelo.facade.TipoDeServicoFachada;
import controlador.Command;

public class TipoDeServicoCadastrarCommand implements Command {
	TipoDeServico tipoDeServico;
	String msg;

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		String nomeServico = req.getParameter("nometiposervico");

		tipoDeServico =new TipoDeServico();
		
		tipoDeServico.setNomeTipoDeServico(nomeServico);
		
		TipoDeServicoFachada tipoDeServicoFachada =new TipoDeServicoFachada();
		
		int SEM_ERRO = tipoDeServicoFachada.cadastrarTipoDeServico(tipoDeServico);

		req.setAttribute("SEM_ERRO", SEM_ERRO);
		req.getRequestDispatcher("/cadastrarTipoServico_administrador.jsp")
		.forward(req, res);
	}

}
