package locahouse;

import java.util.Date;

public class TstLocacao {
	
	public static void main(String[] args) {
		Leitura leitura = new Leitura();	
		Util util = new Util();
		
		util.mostraAparatamentos();
		Date inicio = leitura.data("Entre com a data Inicio do Aluguel: ");
		Date fim  = leitura.data("Entre com a data Final do Aluguel: ");
		Locacao locacao1 = new Locacao(inicio, fim, util.apartamentos().get(0));
		System.out.println(locacao1);
	}

}
