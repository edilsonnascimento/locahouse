package locahouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author Professor
 *
 */
public class Leitura {

	public String entDados(String dados) {

		System.out.println(dados);

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(teclado);

		String s = "";

		try {
			s = buffer.readLine();
		} catch (IOException ioe) {
			System.out.println("\n Erro no sistema ou na JVM");
		}
		return s;
	}
	
	public Date data(String mensagem) {		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(mensagem);
		try {
			String dia = this.entDados("Dia: ");
			String mes = this.entDados("mes: ");
			String ano = this.entDados("ano: ");
			Date data = formato.parse(dia + "/" + mes + "/" + ano);
			return data;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
