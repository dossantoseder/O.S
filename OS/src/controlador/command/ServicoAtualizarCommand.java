package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Servico;
import modelo.facade.ServicoFachada;
import controlador.Command;

public class ServicoAtualizarCommand implements Command{

	Servico servico;
	String msg;
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String nomeServico = req.getParameter("nomeServico");
		String idServico = req.getParameter("idServico");

		servico =new Servico();
		
		servico.setIdServico(Integer.parseInt(idServico));
		servico.setNomeServico(nomeServico);
		ServicoFachada servicoFachada =new ServicoFachada();
		
		servicoFachada.atualizarServico(servico);
		
		msg = "Servico atualizar com sucesso";
		
		

	}

	public void msg(HttpServletRequest req, HttpServletResponse res, String msg)
			throws Exception {
		req.setAttribute("msg", msg);
		
		// mudar a tela
		req.getRequestDispatcher("/cadastoOS.jsp").forward(req, res);
	}

}
