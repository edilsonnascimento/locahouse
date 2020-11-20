package locahouse;

/**
 * @author Edilson do Nascimento
 *
 */
public class Proprietario {

	private long cpf_Prop;
	private String nome_Prop;
	private Endereco endereco;

	public Proprietario() {
		this.cpf_Prop = 00000000000;
		this.nome_Prop = "";
		this.endereco = new Endereco();
	}

	public Proprietario(long cpf_Prop, String nome_Prop, Endereco endereco) {
		this.cpf_Prop = cpf_Prop;
		this.nome_Prop = nome_Prop;
		this.endereco = endereco;
	}

	public long getCpf_Prop() {
		return cpf_Prop;
	}

	public void setCpf_Prop(long cpf_Prop) {
		this.cpf_Prop = cpf_Prop;
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
		return "Nome: " + this.getNome_Prop() + ", portador do CPF: " + this.getCpf_Prop() + ";\n"
				+ "Residente na endereço: " + this.getEndereco() + ".";
	}

}
