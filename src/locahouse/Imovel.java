package locahouse;

/**
 * @author Edilson do Nascimento
 *
 */
public abstract class Imovel {

	private String tipoMaterial;
	private int valorAluguel;
	private Endereco endereco;
	private Proprietario proprietario;

	public Imovel() {
		this.tipoMaterial = "";
		this.valorAluguel = 0;
		this.endereco = new Endereco();
		this.proprietario = new Proprietario();
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public int getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(int valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

}
