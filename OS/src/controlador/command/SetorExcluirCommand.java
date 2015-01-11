package controlador.command;



import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.OrdemDeServico;
import modelo.Setor;
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
 * Servlet implementation class UsuarioCadastrarCommand
 */
@WebServlet("/SetorExcluirCommand")
public class SetorExcluirCommand implements Command {
	Setor setor;
	String msg;

	public  SetorExcluirCommand () {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		String idSetor = req.getParameter("idSetor");

		setor =new Setor();
		
		setor.setIdSetor(Integer.parseInt(idSetor));
		
		SetorFachada setorFachada =new SetorFachada();
		
		setorFachada.cadastrarSetor(setor);
		
		msg = "Setor excluido com sucesso";
		
		

	}

	public void msg(HttpServletRequest req, HttpServletResponse res, String msg)
			throws Exception {
		req.setAttribute("msg", msg);
		
		// mudar a tela
		req.getRequestDispatcher("/cadastoOS.jsp").forward(req, res);
	}

}
