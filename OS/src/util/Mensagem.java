package util;

public class Mensagem {

	private static int tamanho = 10;
	
	/** 
	 * ##### 
	 *      MENSAGENS DE ERRO 
	 * ##### 
	 * */
	public static final int SEM_ERRO = 0;
	/* Mensagens de acesso a banco */
	public static final int NAO_FOI_POSSIVEL_CONECTAR_AO_BANCO = 1;
	public static final int NAO_FOI_POSSIVEL_FECHAR_A_CONEXAO = 2;
	public static final int NAO_FOI_POSSIVEL_EXECUTAR_SQL_BUSCA = 3;
	public static final int NAO_FOI_POSSIVEL_EXECUTAR_SQL_ALTERACAO = 4;
	/* Mensagens de Pessoa */
	public static final int PESSOA_IDADE_INVALIDA = 5;
	
	private static String[] mensagens = new String[tamanho];
	
	static {
		mensagens[SEM_ERRO] = "Não houve erro no sistema!!";
		mensagens[NAO_FOI_POSSIVEL_CONECTAR_AO_BANCO] = "Nao foi possível executar SQL. {executarSQL} ";
		mensagens[NAO_FOI_POSSIVEL_FECHAR_A_CONEXAO] = "Nao foi possível fechar a conexao ";
		mensagens[NAO_FOI_POSSIVEL_EXECUTAR_SQL_BUSCA] = "Nao foi executar SQL de busca ";
		mensagens[NAO_FOI_POSSIVEL_EXECUTAR_SQL_ALTERACAO] = "Não foi possível executar SQL de alteração ";
		mensagens[PESSOA_IDADE_INVALIDA] = "Idade da Pessoa Inválida";
	}
	
	public static String getMensagem(int tipoMensagem){
		return mensagens[tipoMensagem];
	}
	
	
}
