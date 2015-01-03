package controlador.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Produto;
import modelo.facade.ProdutoFachada;
import controlador.Command;

public class ProdutoCadastrarCommand implements Command {

	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		ProdutoFachada fachadaPRO = new ProdutoFachada();
		Produto produto = new Produto();

		String nomeProduto = req.getParameter("nomeProduto");
		String descricao = req.getParameter("descricao");
		String numeroProcesso = req.getParameter("numeroProcesso");

		produto.setNomeProduto(nomeProduto);
		produto.setDescricao(descricao);
		produto.setNumeroProcesso(Integer.parseInt(numeroProcesso));

		int SEM_ERRO = fachadaPRO.cadastrarProduto(produto);

		req.setAttribute("SEM_ERRO", SEM_ERRO);
		req.getRequestDispatcher("/cadastrar_produto.jsp").forward(req, res);

	}

}
