package controlador.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.OrdemDeServico;
import modelo.Setor;
import modelo.Situacao;
import modelo.Status;
import modelo.Usuario;
import modelo.facade.OrdemDeServicoFachada;
import modelo.facade.SetorFachada;
import modelo.facade.SituacaoFachada;
import modelo.facade.StatusFachada;
import modelo.facade.UsuarioFachada;
import controlador.Command;

public class OrdemDeServicoListaCommand implements Command{
		Usuario usuarioLogado;
		List<OrdemDeServico> ordemDeServicos;
		OrdemDeServicoFachada ordemDeServicoFacade = new OrdemDeServicoFachada();
		SituacaoFachada situacaoFachada = new SituacaoFachada();
		StatusFachada statusFachada = new StatusFachada();
		SetorFachada setorFachada = new SetorFachada();

		@Override
		public void execute(HttpServletRequest req, HttpServletResponse res)
				throws Exception {
			UsuarioFachada usuarioFachada = new UsuarioFachada();
			String idUsuario = "1";//req.getParameter("id");
			usuarioLogado  = usuarioFachada.getUsuarioID(Integer.parseInt(idUsuario));

			if (usuarioLogado.equals(null)) {
				req.setAttribute("erro", "erro");
				req.getRequestDispatcher("/index.jsp").forward(req, res);
			} else if (usuarioLogado.getTipo() == 1) {

				req.setAttribute("usuario", usuarioLogado);
				req.setAttribute("listaos", getListaOS());
				req.setAttribute("listastatus", getListaStatus());
				req.setAttribute("listasetor", getListaSetor());
				req.getRequestDispatcher("/listarOS_administrador.jsp").forward(req, res);
				/*
				 * req.getRequestDispatcher("/listarOS_administrador.jsp").forward(req
				 * , res);
				 */
			} else if (usuarioLogado.getTipo() == 2) {

				req.setAttribute("usuario", usuarioLogado);
				req.setAttribute("listaos", getListaOS());
				req.setAttribute("listastatus", getListaStatus());
				req.setAttribute("listasetor", getListaSetor());
				req.getRequestDispatcher("/listarOS_gestor.jsp").forward(req, res);
			} else {
				req.setAttribute("usuario", usuarioLogado);
				req.setAttribute("listaos", getListaOSSolicitante(usuarioLogado));
				req.getRequestDispatcher("/listarOS_solicitante.jsp").forward(req,
						res);
			}

		}

		public List<Situacao> getListaOSSolicitante(Usuario usuarioLogado) {
			return situacaoFachada.getListaSituacaoSolicitante(usuarioLogado);
		}

		public List<OrdemDeServico> getListaOS() {
			return ordemDeServicoFacade.getOrdemDeServicos();
		}

		public List<Status> getListaStatus() {
			return statusFachada.getListarStatus();
		}

		public List<Setor> getListaSetor() {
			return setorFachada.getListarSetor();
		}

}
