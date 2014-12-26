package util;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Data {

	/**
	 * Método usado para formatar uma data(Date)vinda do banco
	 * */
	public String getFormatarDataDoBanco(Date dtParaFormata) {
		String dataFormatada = null;

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		dataFormatada = df.format(dtParaFormata);

		return dataFormatada;
	}

	/**
	 * Método usado para formatar uma data(String)vinda da interface
	 * */
	public String getFormatarDataDaInterface(String dtParaFormata) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

		try {

			Date dataFormatada;
			dataFormatada = new Date(formatter.parse(dtParaFormata).getTime());
			formatter.applyPattern("yyyy-mm-dd");
			dtParaFormata = formatter.format(dataFormatada);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dtParaFormata;
	}

	public static void rodarTestesAvaliacao() {

		Data data = new Data();
		// Date dtParaFormata
		// data.getFormatarDataDoBanco(Date dtParaFormata);

	}

}
