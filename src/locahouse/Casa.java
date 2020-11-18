package locahouse;

/**
 * @author Edilson do Nascimento
 *
 */
public class Casa extends Imovel {

	private String estilo;
	private int qtdComodos;

	public Casa() {
		this.estilo = "";
		this.qtdComodos = 0;
	}

	public Casa(String estilo, int qtdComodos, String tipoMaterial, int valorAluguel, Endereco endereco, Proprietario proprietario) {		
		super(tipoMaterial, valorAluguel, endereco, proprietario);
		this.estilo = estilo;
		this.qtdComodos = qtdComodos;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getQtdComodos() {
		return qtdComodos;
	}

	public void setQtdComodos(int qtdComodos) {
		this.qtdComodos = qtdComodos;
	}

}
