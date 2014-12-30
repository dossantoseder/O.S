package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class ProdutoFachada {
	Produto produto;
	ProdutoDAO produtoDAO = new ProdutoDAO();
	List<Produto> produtos;

	public int cadastrarProduto(Produto produto) {
		int SEM_ERRO = this.produtoDAO.cadastrarProduto(produto);
		return SEM_ERRO;
	}

	public int atualizarProduto(Produto produto) {
		int SEM_ERRO = this.produtoDAO.atualizarProduto(produto);
		return SEM_ERRO;
	}

	public List<Produto> getListarProduto() {
		produtos = produtoDAO.getListarProduto();
		return produtos;
	}

	public Produto getProduto(int idProduto) {
		produto = produtoDAO.getProduto(idProduto);
		return produto;
	}

}
