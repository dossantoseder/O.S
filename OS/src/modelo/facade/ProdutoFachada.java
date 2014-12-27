package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class ProdutoFachada {
	Produto produto;
	ProdutoDAO produtoDAO = new ProdutoDAO();
	List<Produto> produtos;

	public void cadastrarProduto(Produto produto) {
		this.produto = produto;
	}

	public void atualizarProduto(Produto produto) {
		this.produto = produto;
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
