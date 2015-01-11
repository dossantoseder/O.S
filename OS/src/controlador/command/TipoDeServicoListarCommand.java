package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Servico;
import modelo.TipoDeServico;
import modelo.facade.ServicoFachada;
import modelo.facade.TipoDeServicoFachada;
import controlador.Command;

public class TipoDeServicoListarCommand implements Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		TipoDeServicoFachada tipoDeServicoFachada = new TipoDeServicoFachada();
		tipoDeServicoFachada.getListarTipoDeServico();
		
		
		req.setAttribute("listatipodeservico", tipoDeServicoFachada.getListarTipoDeServico());
		req.getRequestDispatcher("/listarTipoServico_administrador.jsp").forward(req, res);
	}
}