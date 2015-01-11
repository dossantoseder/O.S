package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.facade.SetorFachada;
import controlador.Command;

public class SetorListarCommand implements Command{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		SetorFachada setorFachada = new SetorFachada();	
		setorFachada.getListarSetor();
		
		req.setAttribute("listasetor", setorFachada.getListarSetor());
		req.getRequestDispatcher("/listarSetor_administrador.jsp").forward(req, res);
	}

}
