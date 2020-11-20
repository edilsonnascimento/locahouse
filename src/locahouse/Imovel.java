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

	public Imovel(String tipoMaterial, int valorAluguel, Endereco endereco, Proprietario proprietario) {
		
		if(! enderecoIgual(proprietario.getEndereco(), endereco)) {
			this.tipoMaterial = tipoMaterial;
			this.valorAluguel = valorAluguel;
			this.endereco = endereco;
			this.proprietario = proprietario;
			System.out.println("Imóvel cadastrado com sucesso!");
		}else {
			System.out.println("Imóvel não pode ser cadastro está com o mesmo endereco do proprietário");
		}
	}

	private boolean enderecoIgual(Endereco enderecoProprietario, Endereco enderecoImovel) {
		return ( 
				(enderecoProprietario.getCidade().equals(enderecoImovel.getCidade())) &&
				(enderecoProprietario.getRua().equals(enderecoImovel.getRua())) &&
				(enderecoProprietario.getNum() == enderecoImovel.getNum())				
				);				
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

	@Override
	public String toString() {
		return "Feito em " + tipoMaterial + " com valor de aluguel de R$ " + valorAluguel + "." + 
				"\nLocalizado no endereco: " + this.endereco + "Abaixo segue dados do Proprietário\n" + proprietario + ".\n";
	}

	
}
