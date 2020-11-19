package locahouse;

/**
 * @author Edilson do Nascimento
 *
 */
import java.util.Date;

public class Locacao {

	private Date dataInicio;
	private Date dataFim;
	private Apartamento apartamento;
	private Casa casa;

	public Locacao() {
		this.dataInicio = new Date();
		this.dataFim = new Date();
		this.apartamento = new Apartamento();
		this.casa = new Casa();
	}

	public Locacao(Date dataInicio, Date dataFim, Apartamento apartamento, Casa casa) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.apartamento = apartamento;
		this.casa = casa;
	}
	
	public Locacao(Date dataInicio, Date dataFim, Apartamento apartamento) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.apartamento = apartamento;
	}
	
	public Locacao(Date dataInicio, Date dataFim, Casa casa) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.casa = casa;
	}



	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	@Override
	public String toString() {
		return "Locacao [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", apartamento=" + apartamento + ", casa="
				+ casa + "]";
	}

}
