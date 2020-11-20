package locahouse;

import java.util.Date;

public class TstLocacao {
	
	
	public static void main(String[] args) {
		Leitura leitura = new Leitura();	
		Utilitario utilitario = new Utilitario();
		
		//util.mostraAparatamentos();
		
		//a) Há proprietários que alugam seus imóveis para temporada, isto é por um período de tempo específico;
		//primeiraRegra(leitura, utilitario);
		
		//b) Tanto os proprietários como seus respectivos imóveis devem possuir endereços distintos;
		segundaRegra(leitura, utilitario);
		
	}

	private static void primeiraRegra(Leitura leitura, Utilitario utilitario) {
		Date inicio = leitura.data("Entre com a data Inicio do Aluguel: ");
		Date fim  = leitura.data("Entre com a data Final do Aluguel: ");		
		Locacao locacao1 = new Locacao(inicio, fim, utilitario.apartamentos().get(0));		
		System.out.println(locacao1);
	}
	
	private static void segundaRegra(Leitura leitura, Utilitario utilitario) {

		System.out.println("Entre como o imovel do proprietário com os dados abaixo \n" + utilitario.proprietarios().get(2));
	    //mesmo endereço
	    utilitario.adicionaApartamento(leitura, 2);
	    
	    //endereço diferente
	    utilitario.adicionaApartamento(leitura, 3);

	}
	
}
