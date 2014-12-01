package modelo.facade;

import java.util.List;

import modelo.*;
import modelo.persiste.*;

public class ProdutoFachada {
	Produto produto;
	ProdutoDAO produtoDAO = new ProdutoDAO();
	List<Produto> produtos;

	/*
	 * private static EquipamentoFacade equipamentoFacade = null;
	 * 
	 * 
	 * public static EquipamentoFacade getInstance() { if (equipamentoFacade ==
	 * null) { equipamentoFacade = new EquipamentoFacade(); } return
	 * equipamentoFacade; }
	 */

	public List<Produto> getListarProduto() {

		produtos = produtoDAO.getListarProduto();

		return produtos;

	}

	public Produto getProduto(int idProduto) {

		produto = produtoDAO.getProduto(idProduto);

		return produto;
	}

}
