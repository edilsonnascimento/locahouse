package locahouse;

/**
 * @author Edilson do Nascimento
 *
 */
public class Endereco {

	private String rua;
	private int num;
	private Cidade cidade;

	public Endereco() {
		this.rua = "";
		this.num = 0;
		this.cidade = new Cidade();
	}

	public Endereco(String rua, int num, Cidade cidade) {
		this.rua = rua;
		this.num = num;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return this.getRua() + ", Número " + num + " na Cidade de " + cidade + "\n";
	}

}
