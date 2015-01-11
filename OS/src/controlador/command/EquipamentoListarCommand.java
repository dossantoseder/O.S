package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.facade.EquipamentoFachada;
import modelo.facade.SetorFachada;
import controlador.Command;

public class EquipamentoListarCommand implements Command{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		EquipamentoFachada equipamentoFachada = new EquipamentoFachada();
		equipamentoFachada.getListarEquipamento();
		
		//fazer verificação se é ADM ou GESTOR
		req.setAttribute("listaequipamento",equipamentoFachada.getListarEquipamento());
		req.getRequestDispatcher("/listarEquipamento_administrador.jsp").forward(req, res);
		
	}
	
}
