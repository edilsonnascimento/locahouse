package locahouse;

/**
 * @author Edilson do Nascimento
 *
 */
public class Proprietario {

	private long cpf_fProp;
	private String nome_Prop;
	private Endereco endereco;

	public Proprietario() {
		this.cpf_fProp = 00000000000;
		this.nome_Prop = "";
		this.endereco = new Endereco();
	}

	public Proprietario(long cpf_fProp, String nome_Prop, Endereco endereco) {
		this.cpf_fProp = cpf_fProp;
		this.nome_Prop = nome_Prop;
		this.endereco = endereco;
	}

	public long getCpf_fProp() {
		return cpf_fProp;
	}

	public void setCpf_fProp(long cpf_fProp) {
		this.cpf_fProp = cpf_fProp;
	}

	public String getNome_Prop() {
		return nome_Prop;
	}

	public void setNome_Prop(String nome_Prop) {
		this.nome_Prop = nome_Prop;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome_Prop() + ", portador do CPF: " + this.getCpf_fProp() + ";\n"
				+ "Residente na endereço: " + this.getEndereco() + ".";
	}

}
