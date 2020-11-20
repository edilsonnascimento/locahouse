package locahouse;

import java.util.Date;

public class TstLocacao {
	
	
	public static void main(String[] args) {
		Leitura leitura = new Leitura();	
		Utilitario utilitario = new Utilitario();
		
		//util.mostraAparatamentos();
		
		//a) H� propriet�rios que alugam seus im�veis para temporada, isto � por um per�odo de tempo espec�fico;
		//primeiraRegra(leitura, utilitario);
		
		//b) Tanto os propriet�rios como seus respectivos im�veis devem possuir endere�os distintos;
		segundaRegra(leitura, utilitario);
		
	}

	private static void primeiraRegra(Leitura leitura, Utilitario utilitario) {
		Date inicio = leitura.data("Entre com a data Inicio do Aluguel: ");
		Date fim  = leitura.data("Entre com a data Final do Aluguel: ");		
		Locacao locacao1 = new Locacao(inicio, fim, utilitario.apartamentos().get(0));		
		System.out.println(locacao1);
	}
	
	private static void segundaRegra(Leitura leitura, Utilitario utilitario) {

		System.out.println("Entre como o imovel do propriet�rio com os dados abaixo \n" + utilitario.proprietarios().get(2));
	    //mesmo endere�o
	    utilitario.adicionaApartamento(leitura, 2);
	    
	    //endere�o diferente
	    utilitario.adicionaApartamento(leitura, 3);

	}
	
}
