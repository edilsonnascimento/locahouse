package locahouse;

/**
 * @author Edilson do Nascimento
 *
 */
public class Proprietario {

	private int cpf_fProp;
	private String nome_Prop;

	public Proprietario() {
		this.cpf_fProp = 00000000000;
		this.nome_Prop = "";
	}

	public Proprietario(int cpf_fProp, String nome_Prop) {
		this.cpf_fProp = cpf_fProp;
		this.nome_Prop = nome_Prop;
	}

	public int getCpf_fProp() {
		return cpf_fProp;
	}

	public void setCpf_fProp(int cpf_fProp) {
		this.cpf_fProp = cpf_fProp;
	}

	public String getNome_Prop() {
		return nome_Prop;
	}

	public void setNome_Prop(String nome_Prop) {
		this.nome_Prop = nome_Prop;
	}

}
