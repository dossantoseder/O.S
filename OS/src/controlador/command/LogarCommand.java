package controlador.command;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.Command;

/**
 * Servlet implementation class LogarCommand
 */
@WebServlet("/LogarCommand")
public class LogarCommand extends HttpServlet implements Command {


	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("home.html").forward(req, res);
	}
	

}
