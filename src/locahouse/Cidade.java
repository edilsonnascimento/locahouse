package locahouse;

/**
 * @author Edilson do Nascimento
 *
 */
public class Cidade {

	private int codCid;
	private String nomeCid;

	public Cidade() {
		this.codCid = 0;
		this.nomeCid = "";
	}

	public Cidade(int codCid, String nomeCid) {
		this.codCid = codCid;
		this.nomeCid = nomeCid;
	}

	public int getCodCid() {
		return codCid;
	}

	public void setCodCid(int codCid) {
		this.codCid = codCid;
	}

	public String getNomeCid() {
		return nomeCid;
	}

	public void setNomeCid(String nomeCid) {
		this.nomeCid = nomeCid;
	}

}
