package util;

/**
 * Esta classe contém funções de utilidade. Ela possui funcionalidades \n
 * que podem ser utilizadas em diversos programas \n
 * 
 * @author Renato Novais Criada em: 21/08/2009 \n 
 * Última atualização: 20/02/2010
 */
import javax.swing.JOptionPane;

public class Utilidade {
	
	public static boolean ehNumero(String msn){
		try{
			Integer.parseInt(msn);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	/**
	 * Implementa o system.out.println()
	 * */
	public static void SOP(String t){
		System.out.println(t);
	}
	
	/**
	 * Tipos de mensagens de popUp
	 * */
	public static final int POP_UP_MENSAGEM_ERRO = 1;
	public static final int POP_UP_MENSAGEM_INFORMACAO = 2;
	/**
	 * Este método apresenta um popUp na tela com a mensagem msn o título (titulo), e o tipo\n
	 * para o tipo use:\n
	 * 	POP_UP_MENSAGEM_ERRO       - para Mensagem de erro,\n 
	 *  POP_UP_MENSAGEM_INFORMACAO - Mensagem de informação \n
	 * se o título for = null o método usará "Erro" e "Informação"  
	 * */
	public static void mensagemPopUp(String msn, String titulo, int tipo){
		
		switch (tipo){
			case POP_UP_MENSAGEM_ERRO:{
				if (titulo == null) titulo = "Erro";
				System.out.println(titulo+" - "+msn);
				break;
			} 
			case POP_UP_MENSAGEM_INFORMACAO:{
				if (titulo == null) titulo = "Informação";
				System.out.println(titulo+" - "+msn);
				break;
			} 
		}
		
		
	} 

}
