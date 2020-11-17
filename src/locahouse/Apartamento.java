package locahouse;
/**
 * @author Edilson do Nascimento
 *
 */
public class Apartamento extends Imovel {

	private String nomeEdificio;
	private int areaInterna;

	public Apartamento() {
		this.nomeEdificio = "";
		this.areaInterna = 0;
	}

	public String getNomeEdificio() {
		return nomeEdificio;
	}

	public void setNomeEdificio(String nomeEdificio) {
		this.nomeEdificio = nomeEdificio;
	}

	public int getAreaInterna() {
		return areaInterna;
	}

	public void setAreaInterna(int areaInterna) {
		this.areaInterna = areaInterna;
	}

}
