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

}
